
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


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01
 * Generated source version: 2.2
 *
 */
@WebService(name = "AuthorityPort", targetNamespace = "http://jw.nju.edu.cn/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
        ObjectFactory.class
})
public interface AuthorityPort {


    /**
     *
     * @param studentAuthenticationInfo
     * @return
     *     returns main.java.example.suck2.验证结果类型
     * @throws PwdFault
     * @throws InvalidDataFault
     * @throws StudentDoNotExistFault
     */
    @WebMethod(operationName = "StudentAuthority", action = "authority/StudentAuthority")
    @WebResult(name = "\u9a8c\u8bc1\u7ed3\u679c", targetNamespace = "http://www.nju.edu.cn/security/schema", partName = "scoreList")
    @Action(input = "authority/StudentAuthority", output = "score/StudentAuthorityResponse", fault = {
            @FaultAction(className = StudentDoNotExistFault.class, value = "score/StudentDoNotExistFault"),
            @FaultAction(className = PwdFault.class, value = "authority/PwdFault"),
            @FaultAction(className = InvalidDataFault.class, value = "authority/InvalidDataFault")
    })
    public authenticationResult studentAuthority(
            @WebParam(name = "StudentAuthorityParam", targetNamespace = "http://www.nju.edu.cn/security/schema", partName = "StudentAuthenticationInfo")
                    StudentAuthorityParamType studentAuthenticationInfo)
            throws InvalidDataFault, PwdFault, StudentDoNotExistFault
    ;

}
