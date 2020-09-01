
package ServerService;

import entity.StudentService.GradeService.CannotFindFault;
import entity.StudentService.GradeService.InvalidRequestFault;
import entity.StudentService.GradeService.ObjectFactory;
import entity.StudentService.GradeService.学生类型;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "searchStudentInfoInterface", targetNamespace = "http://jw.nju.edu.cn/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SearchStudentInfoInterface {


    /**
     * 
     *                 输入需要查询的学号，返回完整的学生信息
     *                 若查询成功则返回课程成绩，失败则返回相应的fault信息
     *             
     * 
     * @param studentNumber
     * @return
     *     returns entity.StudentService.InfoService.个人信息类型
     * @throws CannotFindFault
     * @throws InvalidRequestFault
     */
    @WebMethod(action = "searchStudentGrade")
    @WebResult(name = "\u4e2a\u4eba\u4fe1\u606f", targetNamespace = "http://www.nju.edu.cn/schema", partName = "studentInfo")
    public 学生类型 searchStudentInfoOperation(
            @WebParam(name = "\u5b66\u53f7", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "studentNumber")
                    String studentNumber)
        throws CannotFindFault, InvalidRequestFault
    ;

}
