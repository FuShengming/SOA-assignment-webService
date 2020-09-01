package Handler;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
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

public class PersistenceHandler implements SOAPHandler<SOAPMessageContext> {
    @Override
    public Set<QName> getHeaders() {
        return null;
    }
    @Override
    public boolean handleMessage(SOAPMessageContext context) {

        saveMessage(context);

        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        try {
            System.out.println(context.getMessage().getSOAPBody().getChildNodes().item(0).getLocalName());
        } catch (SOAPException e) {
            e.printStackTrace();
        }
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
