import cn.edu.nju.jw.schema.*;
import cn.edu.nju.jw.wsdl.*;

import java.net.URL;

public class TestService {

    public static void main(String[] args) throws Exception {

        URL url = new URL(ServicePublisher.address + "?wsdl");
        GradeService client = new GradeService(url);
        GradeServiceInterface gradeService = client.getGradeServiceEndpoint();
        课程成绩列表类型 request = getRequest();
        课程成绩列表类型 searchResult = null;
        try {
            System.out.println("search");
            // 若为服务发布后的首次查询，应抛出cannotfind异常
            searchResult = gradeService.searchGrade("171250674");
            showCourseGradeList(searchResult);
        } catch (InvalidRequestFault requestFault) {
            System.out.println(requestFault.getFaultInfo());
        } catch (CannotFindFault cannotFindFault) {
            System.out.println(cannotFindFault.getFaultInfo());
        }

        try {
            System.out.println("add");
            课程成绩列表类型 addResult = gradeService.addGrade(request);
            // 若添加成功，则查询应能成功查询到添加的成绩
            searchResult = gradeService.searchGrade("171250674");
            showCourseGradeList(searchResult);
        } catch (InvalidRequestFault requestFault) {
            System.out.println(requestFault.getFaultInfo());
        } catch (AlreadyExistFault fault) {
            System.out.println(fault.getFaultInfo());
        }

        try {
            System.out.println("modify");
            request.get课程成绩().get(0).get成绩().get(0).set得分(60);
            课程成绩列表类型 modifyResult = gradeService.modifyGrade(request);
            // 若修改成功，则查询返回的对应得分应为60
            searchResult = gradeService.searchGrade("171250674");
            showCourseGradeList(searchResult);
        } catch (InvalidRequestFault requestFault) {
            System.out.println(requestFault.getFaultInfo());
        } catch (CannotFindFault cannotFindFault) {
            System.out.println(cannotFindFault.getFaultInfo());
        }

        try {
            System.out.println("delete");
            课程成绩列表类型 deleteResult = gradeService.deleteGrade(request);
            // 若删除成功，则查询将报cannotfind异常
            searchResult = gradeService.searchGrade("171250674");
            showCourseGradeList(searchResult);
        } catch (InvalidRequestFault requestFault) {
            System.out.println(requestFault.getFaultInfo());
        } catch (CannotFindFault cannotFindFault) {
            System.out.println(cannotFindFault.getFaultInfo());
        }
    }

    // 获取课程成绩的请求用例
    public static 课程成绩列表类型 getRequest() {
        课程成绩列表类型 request = new 课程成绩列表类型();
        课程成绩类型 courseGrade = new 课程成绩类型();
        courseGrade.set课程编号("123456");
        courseGrade.set成绩性质(成绩性质类型.总评成绩);
        成绩类型 grade = new 成绩类型();
        grade.set学号("171250674");
        grade.set得分(100);
        courseGrade.get成绩().add(grade);
        request.get课程成绩().add(courseGrade);
        return request;
    }

    // 输出课程成绩类型对象，便于检查
    public static void showCourseGradeList(课程成绩列表类型 courseGradeList) {
        for (课程成绩类型 courseGrade : courseGradeList.get课程成绩()) {
            System.out.println("-----------------------------");
            System.out.println("课程编号：" + courseGrade.get课程编号() + ", 成绩性质：" + courseGrade.get成绩性质().value());
            for (成绩类型 grade : courseGrade.get成绩()) {
                System.out.println("        学号：" + grade.get学号() + ", 得分：" + grade.get得分());
            }
            System.out.println("-----------------------------");
            System.out.println();
        }
    }

}
