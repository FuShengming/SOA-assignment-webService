package webServiceClient;

import ServerService.GradeService;
import ServerService.GradeServiceInterface;
import com.sun.xml.internal.ws.api.message.Headers;
import com.sun.xml.internal.ws.developer.WSBindingProvider;
import entity.StudentService.GradeService.AlreadyExistFault;
import entity.StudentService.GradeService.CannotFindFault;
import entity.StudentService.GradeService.InvalidRequestFault;
import entity.StudentService.GradeService.课程成绩列表类型;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class ScoreService {
    public 课程成绩列表类型 addScore(课程成绩列表类型 scoreList,String email,String password) throws MalformedURLException {

        URL url = new URL("http://localhost:8088/StudentGradeManagement" + "?wsdl");
        GradeService gradeService = new GradeService(url);
        GradeServiceInterface gradeServiceInterface = gradeService.getGradeServiceEndpoint();
        WSBindingProvider bp = (WSBindingProvider)gradeServiceInterface;
        bp.setOutboundHeaders(Headers.create(new QName("http://www.nju.edu.cn/schema","email"),email), Headers.create(new QName("http://www.nju.edu.cn/schema","password"),password));
        try{
            return gradeServiceInterface.addGrade(scoreList);
        }
        catch (InvalidRequestFault e){
            System.out.println("错误："+e.getFaultInfo());
            e.printStackTrace();
            return null;
        }
        catch (AlreadyExistFault e){
            System.out.println("错误："+e.getFaultInfo());
            e.printStackTrace();
            return null;
        }
    }
    public 课程成绩列表类型 updateScore(课程成绩列表类型 scoreList,String email,String password) throws MalformedURLException {
        URL url = new URL("http://localhost:8088/StudentGradeManagement" + "?wsdl");
        GradeService gradeService = new GradeService(url);
        GradeServiceInterface gradeServiceInterface = gradeService.getGradeServiceEndpoint();
        WSBindingProvider bp = (WSBindingProvider)gradeServiceInterface;
        bp.setOutboundHeaders(Headers.create(new QName("http://www.nju.edu.cn/schema","email"),email), Headers.create(new QName("http://www.nju.edu.cn/schema","password"),password));
        try{
            return gradeServiceInterface.modifyGrade(scoreList);

        }
        catch (InvalidRequestFault e){
            System.out.println("错误："+e.getFaultInfo());
            e.printStackTrace();
            return null;
        }
        catch ( CannotFindFault e){
            System.out.println("错误："+e.getFaultInfo());
            e.printStackTrace();
            return null;
        }
    }
    public 课程成绩列表类型 deleteScore(课程成绩列表类型 scoreList,String email,String password) throws MalformedURLException {
        URL url = new URL("http://localhost:8088/StudentGradeManagement" + "?wsdl");
        GradeService gradeService = new GradeService(url);
        GradeServiceInterface gradeServiceInterface = gradeService.getGradeServiceEndpoint();
        WSBindingProvider bp = (WSBindingProvider)gradeServiceInterface;
        bp.setOutboundHeaders(Headers.create(new QName("http://www.nju.edu.cn/schema","email"),email), Headers.create(new QName("http://www.nju.edu.cn/schema","password"),password));
        try{
           return gradeServiceInterface.deleteGrade(scoreList);
        }
        catch (InvalidRequestFault e){
            System.out.println("错误："+e.getFaultInfo());
            e.printStackTrace();
            return null;
        }
        catch ( CannotFindFault e){
            System.out.println("错误："+e.getFaultInfo());
            e.printStackTrace();
            return null;
        }
    }

    public 课程成绩列表类型 searchScore(String id,String email,String password) throws MalformedURLException {
        URL url = new URL("http://localhost:8088/StudentGradeManagement" + "?wsdl");
        GradeService gradeService = new GradeService(url);
        GradeServiceInterface gradeServiceInterface = gradeService.getGradeServiceEndpoint();
        WSBindingProvider bp = (WSBindingProvider)gradeServiceInterface;
        bp.setOutboundHeaders(Headers.create(new QName("http://www.nju.edu.cn/schema","email"),email), Headers.create(new QName("http://www.nju.edu.cn/schema","password"),password));
        try{
            return gradeServiceInterface.searchGrade(id);
        }
        catch (InvalidRequestFault e){
            System.out.println("错误："+e.getFaultInfo());
            e.printStackTrace();
            return null;
        }
        catch ( CannotFindFault e){
            System.out.println("错误："+e.getFaultInfo());
            e.printStackTrace();
            return null;
        }
    }
}
