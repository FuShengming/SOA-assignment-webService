
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
@WebService(name = "StudentInfoPort", targetNamespace = "http://jw.nju.edu.cn/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
        ObjectFactory.class
})
public interface StudentInfoPort {


    /**
     *
     * @param studentId
     * @return
     *     returns main.java.example.entity.学生信息类型
     * @throws InvalidDataFault
     * @throws StudentDoNotExistFault
     */
    @WebMethod(action = "student/getStudentInfoById")
    @WebResult(name = "\u5b66\u751f", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "studentInfo")
    @Action(input = "studentInfo/getStudentInfoByIdRequest", output = "studentInfo/getStudentInfoByIdResponse", fault = {
            @FaultAction(className = StudentDoNotExistFault.class, value = "studentInfo/StudentDoNotExistFault"),
            @FaultAction(className = InvalidDataFault.class, value = "studentInfo/InvalidDataFault")
    })
    public Student getStudentInfoById(
            @WebParam(name = "getStudentInfoParam", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "studentId")
                    GetStudentInfoParamType studentId)
            throws InvalidDataFault, StudentDoNotExistFault
    ;

    /**
     *
     * @param studentId
     * @return
     *     returns main.java.example.entity.学生信息类型
     * @throws InvalidDataFault
     * @throws StudentDoNotExistFault
     */
    @WebMethod(action = "student/deleteStudentInfoById")
    @WebResult(name = "\u5b66\u751f", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "deletedStudentInfo")
    @Action(input = "studentInfo/deleteStudentInfoByIdRequest", output = "studentInfo/deleteStudentInfoByIdResponse", fault = {
            @FaultAction(className = StudentDoNotExistFault.class, value = "studentInfo/StudentDoNotExistFault"),
            @FaultAction(className = InvalidDataFault.class, value = "studentInfo/InvalidDataFault")
    })
    public Student deleteStudentInfoById(
            @WebParam(name = "deleteStudentInfoParam", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "studentId")
                    DeleteStudentInfoParamType studentId)
            throws InvalidDataFault, StudentDoNotExistFault
    ;

    /**
     *
     * @param studentInfo
     * @return
     *     returns main.java.example.entity.学生信息类型
     * @throws InvalidDataFault
     * @throws StudentDoNotExistFault
     */
    @WebMethod(action = "student/updateStudentInfoById")
    @WebResult(name = "\u5b66\u751f", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "updatedStudentInfo")
    @Action(input = "studentInfo/updateStudentInfoByIdRequest", output = "studentInfo/updateStudentInfoByIdResponse", fault = {
            @FaultAction(className = StudentDoNotExistFault.class, value = "studentInfo/StudentDoNotExistFault"),
            @FaultAction(className = InvalidDataFault.class, value = "studentInfo/InvalidDataFault")
    })
    public Student updateStudentInfo(
            @WebParam(name = "updateStudentInfoParam", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "studentInfo")
                    UpdateStudentInfoParamType studentInfo)
            throws InvalidDataFault, StudentDoNotExistFault
    ;

    /**
     *
     * @param studentInfo
     * @return
     *     returns main.java.example.entity.学生信息类型
     * @throws StudentExistedFault
     * @throws InvalidDataFault
     */
    @WebMethod(action = "student/addStudentInfoById")
    @WebResult(name = "\u5b66\u751f", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "addedStudentInfo")
    @Action(input = "studentInfo/addStudentInfoByIdRequest", output = "studentInfo/addStudentInfoByIdResponse", fault = {
            @FaultAction(className = StudentExistedFault.class, value = "studentInfo/StudentExistedFault"),
            @FaultAction(className = InvalidDataFault.class, value = "studentInfo/InvalidDataFault")
    })
    public Student addStudentInfo(
            @WebParam(name = "addStudentInfoParam", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "studentInfo")
                    AddStudentInfoParamType studentInfo)
            throws InvalidDataFault, StudentExistedFault
    ;

}

