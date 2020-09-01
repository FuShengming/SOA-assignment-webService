package webServiceClient;

import ServerService.*;
import com.sun.xml.internal.ws.api.message.Headers;
import com.sun.xml.internal.ws.developer.WSBindingProvider;
import entity.StudentService.GradeService.AlreadyExistFault;
import entity.StudentService.GradeService.CannotFindFault;
import entity.StudentService.GradeService.InvalidRequestFault;
import entity.StudentService.GradeService.学生类型;


import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class InfoService {
    /*
     *注：每种操作将操作种类记录在header中，方便LoginHandler对不同操作进行不同的权限验证
     * */


    public 学生类型 addStudentInfo(学生类型 student) throws MalformedURLException  {
        URL url = new URL("http://localhost:8089/addStudentInfo" + "?wsdl");
        StudentInfoManagementService studentInfoManagementService = new StudentInfoManagementService(url);
        AddStudentInfoInterface addStudentInfoInterface =  studentInfoManagementService.getAddStudentInfoEndpoint();
        WSBindingProvider bp = (WSBindingProvider)addStudentInfoInterface;
        bp.setOutboundHeaders(Headers.create(new QName("","op"),"addInfo"));
        try{
            学生类型 res= addStudentInfoInterface.addStudentInfoOperation(student);
            return res;
        }

        catch (AlreadyExistFault  e){

            System.out.println("错误："+e.getFaultInfo());
            e.printStackTrace();
            return null;
        }
        catch (InvalidRequestFault e){

            System.out.println("错误："+e.getFaultInfo());
            e.printStackTrace();
            return null;
        }

    }

    public 学生类型 searchStudentInfo(String id) throws MalformedURLException {
        URL url = new URL("http://localhost:8089/searchStudentInfo" + "?wsdl");
        StudentInfoManagementService studentInfoManagementService = new StudentInfoManagementService(url);
        SearchStudentInfoInterface searchStudentInfoInterface = studentInfoManagementService.getSearchStudentInfoEndpoint();
        WSBindingProvider bp = (WSBindingProvider)searchStudentInfoInterface;
        bp.setOutboundHeaders(Headers.create(new QName("","op"),"searchInfo"));
        try{
            学生类型 res= searchStudentInfoInterface.searchStudentInfoOperation(id);
            return res;
        }
        catch (InvalidRequestFault e){
            System.out.println("错误："+e.getFaultInfo());
            e.printStackTrace();

            return null;
        }
        catch (CannotFindFault e){

            System.out.println("错误："+e.getFaultInfo());
            e.printStackTrace();
            return null;
        }
    }

    public 学生类型 deleteStudentInfo(String id) throws MalformedURLException {
        URL url = new URL("http://localhost:8089/deleteStudentInfo" + "?wsdl");
        StudentInfoManagementService studentInfoManagementService = new StudentInfoManagementService(url);
        DeleteStudentInfoInterface deleteStudentInfoInterface = studentInfoManagementService.getDeleteStudentInfoEndpoint();
        WSBindingProvider bp = (WSBindingProvider)deleteStudentInfoInterface;
        bp.setOutboundHeaders(Headers.create(new QName("","op"),"deleteInfo"));
        try{
            学生类型 res= deleteStudentInfoInterface.deleteStudentInfoOperation(id);
            return res;
        }
        catch (InvalidRequestFault e){
            System.out.println("错误："+e.getFaultInfo());
            e.printStackTrace();
            return null;
        }
        catch (CannotFindFault e){
            System.out.println("错误："+e.getFaultInfo());
            e.printStackTrace();
            return null;
        }
    }

    public 学生类型 modifyStudentInfo(学生类型 student) throws MalformedURLException {
        URL url = new URL("http://localhost:8089/modifyStudentInfo" + "?wsdl");
        StudentInfoManagementService studentInfoManagementService = new StudentInfoManagementService(url);
        ModifyStudentInfoInterface modifyStudentInfoInterface = studentInfoManagementService.getModifyStudentInfoEndpoint();
        WSBindingProvider bp = (WSBindingProvider)modifyStudentInfoInterface;
        bp.setOutboundHeaders(Headers.create(new QName("","op"),"modifyInfo"));
        try{
            学生类型 res= modifyStudentInfoInterface.modifyStudentInfoOperation(student);
            return res;
        }
        catch (InvalidRequestFault e){
            System.out.println("错误："+e.getFaultInfo());
            e.printStackTrace();
            return null;
        }
        catch (CannotFindFault e){
            System.out.println("错误："+e.getFaultInfo());
            e.printStackTrace();
            return null;
        }
    }
}
