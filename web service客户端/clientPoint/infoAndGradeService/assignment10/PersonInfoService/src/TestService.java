//import cn.edu.nju.jw.schema.学生类型;
//import cn.edu.nju.jw.schema.课程成绩列表类型;
//import cn.edu.nju.jw.wsdl.*;
//import cn.edu.nju.schema.*;
//
//import java.math.BigInteger;
//import java.net.URL;
//
//public class TestService {
//
//    public static void main(String[] args) throws Exception {
//        URL url = new URL(ServicePublisher.searchAddress);
//        StudentInfoManagementService service = new StudentInfoManagementService(url);
//        SearchStudentInfoInterface searchService = service.getSearchStudentInfoEndpoint();
//        try {
//            System.out.println("search");
//            showPersonInfo(searchService.searchStudentInfoOperation("171250674"));
//        } catch (InvalidRequestFault invalidRequestFault) {
//            System.out.println("invalidRequestFault: " + invalidRequestFault.getFaultInfo());
//        } catch (CannotFindFault cannotFindFault) {
//            System.out.println("cannotFindFault: " + cannotFindFault.getFaultInfo());
//        }
//
//
//        学生类型 request = getRequest();
//        url = new URL(ServicePublisher.addAddress);
//        service = new StudentInfoManagementService(url);
//        AddStudentInfoInterface addService = service.getAddStudentInfoEndpoint();
//        try {
//            System.out.println("add");
//            addService.addStudentInfoOperation(request);
//            showPersonInfo(searchService.searchStudentInfoOperation("171250674"));
//        } catch (AlreadyExistFault alreadyExistFault) {
//            System.out.println("alreadyExistFault: " + alreadyExistFault.getFaultInfo());
//        } catch (InvalidRequestFault invalidRequestFault) {
//            System.out.println("invalidRequestFault: " + invalidRequestFault.getFaultInfo());
//        } catch (CannotFindFault cannotFindFault) {
//            System.out.println("cannotFindFault: " + cannotFindFault.getFaultInfo());
//        }
//
//
//        request.get个人信息().set姓名("周钰坤");
//        url = new URL(ServicePublisher.modifyAddress);
//        service = new StudentInfoManagementService(url);
//        ModifyStudentInfoInterface modifyService = service.getModifyStudentInfoEndpoint();
//        try {
//            System.out.println("modify");
//            modifyService.modifyStudentInfoOperation(request);
//            showPersonInfo(searchService.searchStudentInfoOperation("171250674"));
//        } catch (InvalidRequestFault invalidRequestFault) {
//            System.out.println("invalidRequestFault: " + invalidRequestFault.getFaultInfo());
//        } catch (CannotFindFault cannotFindFault) {
//            System.out.println("cannotFindFault: " + cannotFindFault.getFaultInfo());
//        }
//
//        url = new URL(ServicePublisher.deleteAddress);
//        service = new StudentInfoManagementService(url);
//        DeleteStudentInfoInterface deleteService = service.getDeleteStudentInfoEndpoint();
//        try {
//            System.out.println("delete");
//            showPersonInfo(deleteService.deleteStudentInfoOperation("171250674"));
//            showPersonInfo(searchService.searchStudentInfoOperation("171250674"));
//        } catch (InvalidRequestFault invalidRequestFault) {
//            System.out.println("invalidRequestFault: " + invalidRequestFault.getFaultInfo());
//        } catch (CannotFindFault cannotFindFault) {
//            System.out.println("cannotFindFault: " + cannotFindFault.getFaultInfo());
//        }
//
//    }
//
//    public static 学生类型 getRequest() {
//        学生类型 student = new 学生类型();
//        student.set学号("171250674");
//        个人信息类型 personInfo = new 个人信息类型();
//        personInfo.set姓名("zyk");
//        personInfo.set年龄(new BigInteger("22"));
//        personInfo.set性别(性别类型.男);
//        personInfo.set电话(new BigInteger("18888888888"));
//        部门列表 department = new 部门列表();
//        department.get院系And行政部门().add(院系类型.软件学院);
//        department.get院系And行政部门().add(行政部门类型.团委);
//        personInfo.set单位(department);
//        student.set个人信息(personInfo);
//        student.set课程成绩列表(new 课程成绩列表类型());
//        return student;
//    }
//
//    public static void showPersonInfo(个人信息类型 personInfo) {
//        System.out.println("----------------------");
//        System.out.println("姓名：" + personInfo.get姓名());
//        System.out.println("性别：" + personInfo.get性别());
//        System.out.println("年龄：" + personInfo.get年龄());
//        System.out.println("电话：" + personInfo.get电话());
//        System.out.println("部门：");
//        for (Object department : personInfo.get单位().get院系And行政部门()) {
//            if (department instanceof 院系类型) {
//                院系类型 school = (院系类型) department;
//                System.out.println("    " + school.value());
//            } else if (department instanceof 行政部门类型) {
//                行政部门类型 administration = (行政部门类型) department;
//                System.out.println("    " + administration.value());
//            }
//        }
//        System.out.println("----------------------");
//    }
//
//}
