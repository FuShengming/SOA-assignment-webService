
package com.example.webService.bl;

import com.example.webService.entity.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;



@WebService(name = "LoginPort", targetNamespace = "http://jw.nju.edu.cn/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LoginPort {


    @WebMethod(operationName = "EmailAuthentication", action = "login/EmailAuthentication")
    @WebResult(name = "EmailAuthenticationResult", targetNamespace = "http://www.nju.edu.cn/schema", partName = "EmailAuthenticationResult")
    @Action(input = "login/EmailAuthenticationInfo", output = "login/EmailAuthenticationResponse", fault = {
        @FaultAction(className = EmailPwdFault.class, value = "login/EmailPwdFault"),
        @FaultAction(className = NotNjuFault.class, value = "login/NotNjuFault"),
            @FaultAction(className = InvalidDataFault.class, value = "login/InvalidDataFault")
    })
    public EmailAuthenticationResultType emailAuthentication(
            @WebParam(name = "EmailAuthenticationInfo", targetNamespace = "http://www.nju.edu.cn/schema", partName = "EmailAuthenticationInfo")
                    EmailAuthenticationInfoType emailAuthenticationInfo)
        throws EmailPwdFault, NotNjuFault, InvalidDataFault
            ;

}
