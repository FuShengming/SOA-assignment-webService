
package entity.StudentService.GradeService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the entity.StudentService.GradeService package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteRequest_QNAME = new QName("http://jw.nju.edu.cn/schema", "deleteRequest");
    private final static QName _课程成绩_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u6210\u7ee9");
    private final static QName _课程_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b");
    private final static QName _学号_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5b66\u53f7");
    private final static QName _SearchResponse_QNAME = new QName("http://jw.nju.edu.cn/schema", "searchResponse");
    private final static QName _DeleteResponse_QNAME = new QName("http://jw.nju.edu.cn/schema", "deleteResponse");
    private final static QName _课程编号_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u7f16\u53f7");
    private final static QName _学生_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5b66\u751f");
    private final static QName _FaultReason_QNAME = new QName("http://jw.nju.edu.cn/schema", "faultReason");
    private final static QName _所属部门_QNAME = new QName("http://www.nju.edu.cn/schema", "\u6240\u5c5e\u90e8\u95e8");
    private final static QName _ModifyRequest_QNAME = new QName("http://jw.nju.edu.cn/schema", "modifyRequest");
    private final static QName _AddResponse_QNAME = new QName("http://jw.nju.edu.cn/schema", "addResponse");
    private final static QName _ModifyResponse_QNAME = new QName("http://jw.nju.edu.cn/schema", "modifyResponse");
    private final static QName _AddRequest_QNAME = new QName("http://jw.nju.edu.cn/schema", "addRequest");
    private final static QName _个人信息_QNAME = new QName("http://www.nju.edu.cn/schema", "\u4e2a\u4eba\u4fe1\u606f");
    private final static QName _课程名字_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u540d\u5b57");
    private final static QName _课程成绩列表_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u6210\u7ee9\u5217\u8868");
    private final static QName _SearchRequest_QNAME = new QName("http://jw.nju.edu.cn/schema", "searchRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: entity.StudentService.GradeService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link 课程成绩列表类型 }
     * 
     */
    public 课程成绩列表类型 create课程成绩列表类型() {
        return new 课程成绩列表类型();
    }

    /**
     * Create an instance of {@link 学生类型 }
     * 
     */
    public 学生类型 create学生类型() {
        return new 学生类型();
    }

    /**
     * Create an instance of {@link 课程类型 }
     * 
     */
    public 课程类型 create课程类型() {
        return new 课程类型();
    }

    /**
     * Create an instance of {@link 课程成绩类型 }
     * 
     */
    public 课程成绩类型 create课程成绩类型() {
        return new 课程成绩类型();
    }

    /**
     * Create an instance of {@link 成绩类型 }
     * 
     */
    public 成绩类型 create成绩类型() {
        return new 成绩类型();
    }

    /**
     * Create an instance of {@link 个人信息类型 }
     * 
     */
    public 个人信息类型 create个人信息类型() {
        return new 个人信息类型();
    }

    /**
     * Create an instance of {@link 部门列表 }
     * 
     */
    public 部门列表 create部门列表() {
        return new 部门列表();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 课程成绩列表类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "deleteRequest")
    public JAXBElement<课程成绩列表类型> createDeleteRequest(课程成绩列表类型 value) {
        return new JAXBElement<课程成绩列表类型>(_DeleteRequest_QNAME, 课程成绩列表类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 课程成绩类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8bfe\u7a0b\u6210\u7ee9")
    public JAXBElement<课程成绩类型> create课程成绩(课程成绩类型 value) {
        return new JAXBElement<课程成绩类型>(_课程成绩_QNAME, 课程成绩类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 课程类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8bfe\u7a0b")
    public JAXBElement<课程类型> create课程(课程类型 value) {
        return new JAXBElement<课程类型>(_课程_QNAME, 课程类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u5b66\u53f7")
    public JAXBElement<String> create学号(String value) {
        return new JAXBElement<String>(_学号_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 课程成绩列表类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "searchResponse")
    public JAXBElement<课程成绩列表类型> createSearchResponse(课程成绩列表类型 value) {
        return new JAXBElement<课程成绩列表类型>(_SearchResponse_QNAME, 课程成绩列表类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 课程成绩列表类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "deleteResponse")
    public JAXBElement<课程成绩列表类型> createDeleteResponse(课程成绩列表类型 value) {
        return new JAXBElement<课程成绩列表类型>(_DeleteResponse_QNAME, 课程成绩列表类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8bfe\u7a0b\u7f16\u53f7")
    public JAXBElement<String> create课程编号(String value) {
        return new JAXBElement<String>(_课程编号_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 学生类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u5b66\u751f")
    public JAXBElement<学生类型> create学生(学生类型 value) {
        return new JAXBElement<学生类型>(_学生_QNAME, 学生类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "faultReason")
    public JAXBElement<String> createFaultReason(String value) {
        return new JAXBElement<String>(_FaultReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 部门列表 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/schema", name = "\u6240\u5c5e\u90e8\u95e8")
    public JAXBElement<部门列表> create所属部门(部门列表 value) {
        return new JAXBElement<部门列表>(_所属部门_QNAME, 部门列表.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 课程成绩列表类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "modifyRequest")
    public JAXBElement<课程成绩列表类型> createModifyRequest(课程成绩列表类型 value) {
        return new JAXBElement<课程成绩列表类型>(_ModifyRequest_QNAME, 课程成绩列表类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 课程成绩列表类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "addResponse")
    public JAXBElement<课程成绩列表类型> createAddResponse(课程成绩列表类型 value) {
        return new JAXBElement<课程成绩列表类型>(_AddResponse_QNAME, 课程成绩列表类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 课程成绩列表类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "modifyResponse")
    public JAXBElement<课程成绩列表类型> createModifyResponse(课程成绩列表类型 value) {
        return new JAXBElement<课程成绩列表类型>(_ModifyResponse_QNAME, 课程成绩列表类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 课程成绩列表类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "addRequest")
    public JAXBElement<课程成绩列表类型> createAddRequest(课程成绩列表类型 value) {
        return new JAXBElement<课程成绩列表类型>(_AddRequest_QNAME, 课程成绩列表类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 个人信息类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/schema", name = "\u4e2a\u4eba\u4fe1\u606f")
    public JAXBElement<个人信息类型> create个人信息(个人信息类型 value) {
        return new JAXBElement<个人信息类型>(_个人信息_QNAME, 个人信息类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8bfe\u7a0b\u540d\u5b57")
    public JAXBElement<String> create课程名字(String value) {
        return new JAXBElement<String>(_课程名字_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 课程成绩列表类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8bfe\u7a0b\u6210\u7ee9\u5217\u8868")
    public JAXBElement<课程成绩列表类型> create课程成绩列表(课程成绩列表类型 value) {
        return new JAXBElement<课程成绩列表类型>(_课程成绩列表_QNAME, 课程成绩列表类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "searchRequest")
    public JAXBElement<String> createSearchRequest(String value) {
        return new JAXBElement<String>(_SearchRequest_QNAME, String.class, null, value);
    }

}
