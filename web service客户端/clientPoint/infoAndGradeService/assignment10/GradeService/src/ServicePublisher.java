
import cn.edu.nju.jw.wsdl.GradeServiceInterface;
import cn.edu.nju.jw.wsdl.GradeService_GradeServiceEndpointImpl;

import javax.xml.ws.Endpoint;

public class ServicePublisher {

    public static String address = "http://localhost:8088/StudentGradeManagement";

    public static void main(String[] args) {
        try {
            GradeServiceInterface implementor = new GradeService_GradeServiceEndpointImpl();
            Endpoint endpoint = Endpoint.publish(address, implementor);
            System.out.println("Successfully publish GradeService");
//        endpoint.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
