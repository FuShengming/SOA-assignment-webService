package Handler;

import entity.StudentService.GradeService.学生类型;
import entity.StudentService.GradeService.课程成绩列表类型;

import org.w3c.dom.NodeList;
import webServiceClient.InfoService;
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
import java.net.MalformedURLException;
import java.util.Set;

public class InfoModifyHandler implements SOAPHandler<SOAPMessageContext> {
    String email = null;
    String password = null;
    @Override
    public Set<QName> getHeaders() {
        return null;
    }
    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        if (!(Boolean) context.get(SOAPMessageContext.MESSAGE_OUTBOUND_PROPERTY)) {
            try{
                SOAPMessage msg = context.getMessage();

                SOAPEnvelope env = msg.getSOAPPart().getEnvelope();
                SOAPHeader hdr = env.getHeader();
                SOAPBody body = env.getBody();
                NodeList nodeList = body.getChildNodes();
                String kind = nodeList.item(0).getLocalName();
                //判断是否为增加、删除或修改成绩操作
                if(kind.equals("addResponse")||kind.equals("deleteResponse")||kind.equals("modifyResponse")){
                    NodeList headerNodeList = hdr.getChildNodes();
                    String id = body.getElementsByTagNameNS("http://jw.nju.edu.cn/schema","学号").item(0).getTextContent();

                    ScoreService scoreService = new ScoreService();

                    课程成绩列表类型 scoreList = scoreService.searchScore(id,email,password);

                    InfoService infoService = new InfoService();
                    学生类型 student = infoService.searchStudentInfo(id);
                    student.set课程成绩列表(scoreList);
                    infoService.modifyStudentInfo(student);
                }
                else{

                    return true;
                }
            }
            catch (SOAPException | MalformedURLException e){
                System.out.println("soap message error");
                return false;
            }
        }
        else{
            try{
                SOAPMessage msg = context.getMessage();

                SOAPEnvelope env = msg.getSOAPPart().getEnvelope();
                SOAPHeader hdr = env.getHeader();
                SOAPBody body = env.getBody();
                NodeList nodeList = body.getChildNodes();
                String kind = nodeList.item(0).getLocalName();

                if(kind.equals("addRequest")||kind.equals("deleteRequest")||kind.equals("modifyRequest")){
                    NodeList headerNodeList = hdr.getChildNodes();
                    email = headerNodeList.item(0).getTextContent();
                    password = headerNodeList.item(1).getTextContent();

                }
                else{
                    return true;
                }
            }
            catch (SOAPException e){
                System.out.println("soap message error");
                return false;
            }
        }
        return true;
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
            // Set formatting
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
