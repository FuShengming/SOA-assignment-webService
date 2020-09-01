
package entity.LoginService;

import javax.xml.ws.WebFault;


@WebFault(name = "EmailPwdFaultEle", targetNamespace = "http://jw.nju.edu.cn/wsdl/fault")
public class EmailPwdFault
    extends Exception
{

    private EmailPwdFaultType faultInfo;

    public EmailPwdFault(String message, EmailPwdFaultType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }


    public EmailPwdFault(String message, EmailPwdFaultType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }


    public EmailPwdFaultType getFaultInfo() {
        return faultInfo;
    }

}
