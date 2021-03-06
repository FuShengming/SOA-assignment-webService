
package ServerService;

import java.net.MalformedURLException;
import java.net.URL;
import javax.jws.HandlerChain;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@HandlerChain(file = "allocation/message-handler.xml")
@WebServiceClient(name = "StudentInfoManagementService", targetNamespace = "http://jw.nju.edu.cn/wsdl", wsdlLocation = "file:/C:/Users/82582/Desktop/assignment11/back/assignment11/xml/wsdl/StudentInfoService.wsdl")
public class StudentInfoManagementService
    extends Service
{

    private final static URL STUDENTINFOMANAGEMENTSERVICE_WSDL_LOCATION;
    private final static WebServiceException STUDENTINFOMANAGEMENTSERVICE_EXCEPTION;
    private final static QName STUDENTINFOMANAGEMENTSERVICE_QNAME = new QName("http://jw.nju.edu.cn/wsdl", "StudentInfoManagementService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/82582/Desktop/assignment11/back/assignment11/xml/wsdl/StudentInfoService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STUDENTINFOMANAGEMENTSERVICE_WSDL_LOCATION = url;
        STUDENTINFOMANAGEMENTSERVICE_EXCEPTION = e;
    }

    public StudentInfoManagementService() {
        super(__getWsdlLocation(), STUDENTINFOMANAGEMENTSERVICE_QNAME);
    }

    public StudentInfoManagementService(WebServiceFeature... features) {
        super(__getWsdlLocation(), STUDENTINFOMANAGEMENTSERVICE_QNAME, features);
    }

    public StudentInfoManagementService(URL wsdlLocation) {
        super(wsdlLocation, STUDENTINFOMANAGEMENTSERVICE_QNAME);
    }

    public StudentInfoManagementService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STUDENTINFOMANAGEMENTSERVICE_QNAME, features);
    }

    public StudentInfoManagementService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StudentInfoManagementService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SearchStudentInfoInterface
     */
    @WebEndpoint(name = "searchStudentInfoEndpoint")
    public SearchStudentInfoInterface getSearchStudentInfoEndpoint() {
        return super.getPort(new QName("http://jw.nju.edu.cn/wsdl", "searchStudentInfoEndpoint"), SearchStudentInfoInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SearchStudentInfoInterface
     */
    @WebEndpoint(name = "searchStudentInfoEndpoint")
    public SearchStudentInfoInterface getSearchStudentInfoEndpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://jw.nju.edu.cn/wsdl", "searchStudentInfoEndpoint"), SearchStudentInfoInterface.class, features);
    }

    /**
     *
     * @return
     *     returns AddStudentInfoInterface
     */
    @WebEndpoint(name = "addStudentInfoEndpoint")
    public AddStudentInfoInterface getAddStudentInfoEndpoint() {
        return super.getPort(new QName("http://jw.nju.edu.cn/wsdl", "addStudentInfoEndpoint"), AddStudentInfoInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AddStudentInfoInterface
     */
    @WebEndpoint(name = "addStudentInfoEndpoint")
    public AddStudentInfoInterface getAddStudentInfoEndpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://jw.nju.edu.cn/wsdl", "addStudentInfoEndpoint"), AddStudentInfoInterface.class, features);
    }

    /**
     *
     * @return
     *     returns ModifyStudentInfoInterface
     */
    @WebEndpoint(name = "modifyStudentInfoEndpoint")
    public ModifyStudentInfoInterface getModifyStudentInfoEndpoint() {
        return super.getPort(new QName("http://jw.nju.edu.cn/wsdl", "modifyStudentInfoEndpoint"), ModifyStudentInfoInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ModifyStudentInfoInterface
     */
    @WebEndpoint(name = "modifyStudentInfoEndpoint")
    public ModifyStudentInfoInterface getModifyStudentInfoEndpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://jw.nju.edu.cn/wsdl", "modifyStudentInfoEndpoint"), ModifyStudentInfoInterface.class, features);
    }

    /**
     *
     * @return
     *     returns DeleteStudentInfoInterface
     */
    @WebEndpoint(name = "deleteStudentInfoEndpoint")
    public DeleteStudentInfoInterface getDeleteStudentInfoEndpoint() {
        return super.getPort(new QName("http://jw.nju.edu.cn/wsdl", "deleteStudentInfoEndpoint"), DeleteStudentInfoInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DeleteStudentInfoInterface
     */
    @WebEndpoint(name = "deleteStudentInfoEndpoint")
    public DeleteStudentInfoInterface getDeleteStudentInfoEndpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://jw.nju.edu.cn/wsdl", "deleteStudentInfoEndpoint"), DeleteStudentInfoInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STUDENTINFOMANAGEMENTSERVICE_EXCEPTION!= null) {
            throw STUDENTINFOMANAGEMENTSERVICE_EXCEPTION;
        }
        return STUDENTINFOMANAGEMENTSERVICE_WSDL_LOCATION;
    }

}
