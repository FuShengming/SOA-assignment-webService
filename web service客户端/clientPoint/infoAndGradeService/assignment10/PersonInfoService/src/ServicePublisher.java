import cn.edu.nju.jw.wsdl.StudentInfoManagementService_addStudentInfoEndpointImpl;
import cn.edu.nju.jw.wsdl.StudentInfoManagementService_deleteStudentInfoEndpointImpl;
import cn.edu.nju.jw.wsdl.StudentInfoManagementService_modifyStudentInfoEndpointImpl;
import cn.edu.nju.jw.wsdl.StudentInfoManagementService_searchStudentInfoEndpointImpl;

import javax.xml.ws.Endpoint;

public class ServicePublisher {

    public static String searchAddress = "http://localhost:8089/searchStudentInfo";
    public static String addAddress = "http://localhost:8089/addStudentInfo";
    public static String modifyAddress = "http://localhost:8089/modifyStudentInfo";
    public static String deleteAddress = "http://localhost:8089/deleteStudentInfo";

    public static void main(String[] args) throws Exception {
        Endpoint searchServiceEndpoint = Endpoint.publish(searchAddress, new StudentInfoManagementService_searchStudentInfoEndpointImpl());
        System.out.println("Successfully publish searchAddress");
        Endpoint addServiceEndpoint = Endpoint.publish(addAddress, new StudentInfoManagementService_addStudentInfoEndpointImpl());
        System.out.println("Successfully publish addAddress");
        Endpoint modifyServiceEndpoint = Endpoint.publish(modifyAddress, new StudentInfoManagementService_modifyStudentInfoEndpointImpl());
        System.out.println("Successfully publish modifyAddress");
        Endpoint deleteServiceEndpoint = Endpoint.publish(deleteAddress, new StudentInfoManagementService_deleteStudentInfoEndpointImpl());
        System.out.println("Successfully publish deleteAddress");

//        searchServiceEndpoint.stop();
//        addServiceEndpoint.stop();
//        modifyServiceEndpoint.stop();
//        deleteServiceEndpoint.stop();

    }

}
