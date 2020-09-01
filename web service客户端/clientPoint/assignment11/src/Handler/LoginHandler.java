package Handler;

import entity.LoginService.EmailAuthenticationInfoType;
import entity.LoginService.EmailAuthenticationResultType;
import org.w3c.dom.NodeList;
import webServiceClient.EmailLoginService;
import webServiceClient.ScoreService;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class LoginHandler implements SOAPHandler<SOAPMessageContext> {
    @Override
    public Set<QName> getHeaders() {
        return null;
    }
    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        if ((Boolean) context.get(SOAPMessageContext.MESSAGE_OUTBOUND_PROPERTY)) {
            try{
            SOAPMessage msg = context.getMessage();

            SOAPEnvelope env = msg.getSOAPPart().getEnvelope();
            SOAPHeader hdr = env.getHeader();
                SOAPBody body = env.getBody();
                EmailLoginService emailLoginService = new EmailLoginService();
            if(hdr!=null){
                NodeList nodeList = hdr.getChildNodes();
                String email = nodeList.item(0).getTextContent();
                String password = nodeList.item(1).getTextContent();
                EmailAuthenticationInfoType param  = new EmailAuthenticationInfoType();
                param.setEmail(email);
                param.setPwd(password);
                EmailAuthenticationResultType res = emailLoginService.login(param);

                if(res.getEmailIdentity().toString().equals("老师")){
                    return true;
                }
                else if(res.getEmailIdentity().toString().equals("本科生")||(res.getEmailIdentity().toString().equals("研究生"))){

                    System.out.println();
                    //-----此操作为查询成绩操作则通过权限验证--------
                    if(body.getElementsByTagNameNS("http://jw.nju.edu.cn/schema","searchRequest").getLength()==0){
                        System.out.println("您的身份为："+res.getEmailIdentity().toString()+",没有执行此操作的权限。");
                        return false;
                    }
                    else{
                        return true;
                    }
                }
                else{
                    System.out.println("您未通过身份验证"+",没有执行此操作的权限。");
                    return false;
                }


            }
            else{
                System.out.println("错误：请求未包含身份验证信息。");
                return false;
            }
            }
            catch (SOAPException e){
                e.printStackTrace();
                return false;
            }
        }
        else {

            return true;
        }

    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        saveMessage(context);
        return true;
    }

    @Override
    public void close(MessageContext context) {

    }

    private void saveMessage(SOAPMessageContext context){
        SOAPMessage soapMessage = context.getMessage();
        try {
            File file = new File("massage");
            if (!file.exists()) {
                boolean res = file.createNewFile();
                if (!res)
                    throw new IOException("create file error");
            }
            FileOutputStream outputStream = new FileOutputStream(file,true);
            if (!(Boolean) context.get(SOAPMessageContext.MESSAGE_OUTBOUND_PROPERTY)) {
                outputStream.write("RESPONSE:\n".getBytes());
            } else {
                outputStream.write("REQUEST:\n".getBytes());
            }
            TransformerFactory tff = TransformerFactory.newInstance();
            Transformer tf = tff.newTransformer();
            tf.setOutputProperty(OutputKeys.INDENT, "yes");
            tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount",
                    "2");

            Source sc = soapMessage.getSOAPPart().getContent();
            ByteArrayOutputStream streamOut = new ByteArrayOutputStream();
            StreamResult result = new StreamResult(streamOut);
            tf.transform(sc, result);
            String strMessage = streamOut.toString();
            outputStream.write(strMessage.getBytes());
            outputStream.write('\n');
        } catch (SOAPException | IOException | TransformerException e) {
            e.printStackTrace();
        }
    }

}
