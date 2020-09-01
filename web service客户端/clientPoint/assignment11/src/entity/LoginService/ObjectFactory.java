
package entity.LoginService;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the main.java.example.suck3 package. 
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

    private final static QName _选课学生列表_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u9009\u8bfe\u5b66\u751f\u5217\u8868");
    private final static QName _ScoreExistedFaultEle_QNAME = new QName("http://jw.nju.edu.cn/wsdl/fault", "ScoreExistedFaultEle");
    private final static QName _开课学期_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5f00\u8bfe\u5b66\u671f");
    private final static QName _UpdateStudentInfoParam_QNAME = new QName("http://jw.nju.edu.cn/schema", "updateStudentInfoParam");
    private final static QName _StudentAuthorityParam_QNAME = new QName("http://www.nju.edu.cn/security/schema", "StudentAuthorityParam");
    private final static QName _PwdFaultEle_QNAME = new QName("http://jw.nju.edu.cn/wsdl/fault", "PwdFaultEle");
    private final static QName _InvalidDataFaultEle_QNAME = new QName("http://jw.nju.edu.cn/wsdl/fault", "InvalidDataFaultEle");
    private final static QName _学生_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5b66\u751f");
    private final static QName _CourseDoNotExistFaultEle_QNAME = new QName("http://jw.nju.edu.cn/wsdl/fault", "CourseDoNotExistFaultEle");
    private final static QName _验证结果_QNAME = new QName("http://www.nju.edu.cn/security/schema", "\u9a8c\u8bc1\u7ed3\u679c");
    private final static QName _EmailPwdFaultEle_QNAME = new QName("http://jw.nju.edu.cn/wsdl/fault", "EmailPwdFaultEle");
    private final static QName _任课教师列表_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u4efb\u8bfe\u6559\u5e08\u5217\u8868");
    private final static QName _学分_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5b66\u5206");
    private final static QName _EmailAuthenticationInfo_QNAME = new QName("http://www.nju.edu.cn/schema", "EmailAuthenticationInfo");
    private final static QName _认证信息_QNAME = new QName("http://www.nju.edu.cn/security/schema", "\u8ba4\u8bc1\u4fe1\u606f");
    private final static QName _课程名称_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u540d\u79f0");
    private final static QName _个人信息_QNAME = new QName("http://www.nju.edu.cn/schema", "\u4e2a\u4eba\u4fe1\u606f");
    private final static QName _ScoreDoNotExistFaultEle_QNAME = new QName("http://jw.nju.edu.cn/wsdl/fault", "ScoreDoNotExistFaultEle");
    private final static QName _开设院系列表_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5f00\u8bbe\u9662\u7cfb\u5217\u8868");
    private final static QName _课程成绩_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u6210\u7ee9");
    private final static QName _DeleteScoreListParam_QNAME = new QName("http://jw.nju.edu.cn/schema", "deleteScoreListParam");
    private final static QName _选课人数_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u9009\u8bfe\u4eba\u6570");
    private final static QName _UpdateScoreListParam_QNAME = new QName("http://jw.nju.edu.cn/schema", "updateScoreListParam");
    private final static QName _课程性质_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u6027\u8d28");
    private final static QName _DeleteStudentInfoParam_QNAME = new QName("http://jw.nju.edu.cn/schema", "deleteStudentInfoParam");
    private final static QName _课程编号_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u7f16\u53f7");
    private final static QName _选课人数上限_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u9009\u8bfe\u4eba\u6570\u4e0a\u9650");
    private final static QName _部门信息_QNAME = new QName("http://www.nju.edu.cn/schema", "\u90e8\u95e8\u4fe1\u606f");
    private final static QName _GetScoreListParam_QNAME = new QName("http://jw.nju.edu.cn/schema", "getScoreListParam");
    private final static QName _AddStudentInfoParam_QNAME = new QName("http://jw.nju.edu.cn/schema", "addStudentInfoParam");
    private final static QName _上课时间列表_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u4e0a\u8bfe\u65f6\u95f4\u5217\u8868");
    private final static QName _StudentDoNotExistFaultEle_QNAME = new QName("http://jw.nju.edu.cn/wsdl/fault", "StudentDoNotExistFaultEle");
    private final static QName _NotNjuFaultEle_QNAME = new QName("http://jw.nju.edu.cn/wsdl/fault", "NotNjuFaultEle");
    private final static QName _AddScoreListParam_QNAME = new QName("http://jw.nju.edu.cn/schema", "addScoreListParam");
    private final static QName _AuthorityDoNotExistFaultEle_QNAME = new QName("http://jw.nju.edu.cn/wsdl/fault", "AuthorityDoNotExistFaultEle");
    private final static QName _GetStudentInfoParam_QNAME = new QName("http://jw.nju.edu.cn/schema", "getStudentInfoParam");
    private final static QName _StudentExistedFaultEle_QNAME = new QName("http://jw.nju.edu.cn/wsdl/fault", "StudentExistedFaultEle");
    private final static QName _课程成绩列表_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u6210\u7ee9\u5217\u8868");
    private final static QName _EmailAuthenticationResult_QNAME = new QName("http://www.nju.edu.cn/schema", "EmailAuthenticationResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: main.java.example.suck3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmailPwdFaultType }
     * 
     */
    public EmailPwdFaultType createEmailPwdFaultType() {
        return new EmailPwdFaultType();
    }

    /**
     * Create an instance of {@link StudentExistedFaultType }
     * 
     */
    public StudentExistedFaultType createStudentExistedFaultType() {
        return new StudentExistedFaultType();
    }

    /**
     * Create an instance of {@link AuthorityDoNotExistFaultType }
     * 
     */
    public AuthorityDoNotExistFaultType createAuthorityDoNotExistFaultType() {
        return new AuthorityDoNotExistFaultType();
    }

    /**
     * Create an instance of {@link PwdFaultType }
     * 
     */
    public PwdFaultType createPwdFaultType() {
        return new PwdFaultType();
    }

    /**
     * Create an instance of {@link StudentDoNotExistFaultType }
     * 
     */
    public StudentDoNotExistFaultType createStudentDoNotExistFaultType() {
        return new StudentDoNotExistFaultType();
    }

    /**
     * Create an instance of {@link 课程成绩列表类型 }
     * 
     */
    public 课程成绩列表类型 create课程成绩列表类型() {
        return new 课程成绩列表类型();
    }

    /**
     * Create an instance of {@link GetStudentInfoParamType }
     * 
     */
    public GetStudentInfoParamType createGetStudentInfoParamType() {
        return new GetStudentInfoParamType();
    }

    /**
     * Create an instance of {@link 上课时间列表 }
     * 
     */
    public 上课时间列表 create上课时间列表() {
        return new 上课时间列表();
    }

    /**
     * Create an instance of {@link AddScoreListParamType }
     * 
     */
    public AddScoreListParamType createAddScoreListParamType() {
        return new AddScoreListParamType();
    }

    /**
     * Create an instance of {@link GetScoreListParamType }
     * 
     */
    public GetScoreListParamType createGetScoreListParamType() {
        return new GetScoreListParamType();
    }

    /**
     * Create an instance of {@link 任课教师列表类型 }
     * 
     */
    public 任课教师列表类型 create任课教师列表类型() {
        return new 任课教师列表类型();
    }

    /**
     * Create an instance of {@link AddStudentInfoParamType }
     * 
     */
    public AddStudentInfoParamType createAddStudentInfoParamType() {
        return new AddStudentInfoParamType();
    }

    /**
     * Create an instance of {@link 学生信息类型 }
     * 
     */
    public 学生信息类型 create学生信息类型() {
        return new 学生信息类型();
    }

    /**
     * Create an instance of {@link UpdateScoreListParamType }
     * 
     */
    public UpdateScoreListParamType createUpdateScoreListParamType() {
        return new UpdateScoreListParamType();
    }

    /**
     * Create an instance of {@link DeleteStudentInfoParamType }
     * 
     */
    public DeleteStudentInfoParamType createDeleteStudentInfoParamType() {
        return new DeleteStudentInfoParamType();
    }

    /**
     * Create an instance of {@link UpdateStudentInfoParamType }
     * 
     */
    public UpdateStudentInfoParamType createUpdateStudentInfoParamType() {
        return new UpdateStudentInfoParamType();
    }

    /**
     * Create an instance of {@link DeleteScoreListParamType }
     * 
     */
    public DeleteScoreListParamType createDeleteScoreListParamType() {
        return new DeleteScoreListParamType();
    }

    /**
     * Create an instance of {@link 选课学生列表 }
     * 
     */
    public 选课学生列表 create选课学生列表() {
        return new 选课学生列表();
    }

    /**
     * Create an instance of {@link 开设院系列表类型 }
     * 
     */
    public 开设院系列表类型 create开设院系列表类型() {
        return new 开设院系列表类型();
    }

    /**
     * Create an instance of {@link 课程成绩类型 }
     * 
     */
    public 课程成绩类型 create课程成绩类型() {
        return new 课程成绩类型();
    }

    /**
     * Create an instance of {@link 开设院系类型 }
     * 
     */
    public 开设院系类型 create开设院系类型() {
        return new 开设院系类型();
    }

    /**
     * Create an instance of {@link 任课教师信息类型 }
     * 
     */
    public 任课教师信息类型 create任课教师信息类型() {
        return new 任课教师信息类型();
    }

    /**
     * Create an instance of {@link 成绩类型 }
     * 
     */
    public 成绩类型 create成绩类型() {
        return new 成绩类型();
    }

    /**
     * Create an instance of {@link 学生身份 }
     * 
     */
    public 学生身份 create学生身份() {
        return new 学生身份();
    }

    /**
     * Create an instance of {@link 部门信息类型 }
     * 
     */
    public 部门信息类型 create部门信息类型() {
        return new 部门信息类型();
    }

    /**
     * Create an instance of {@link EmailAuthenticationResultType }
     * 
     */
    public EmailAuthenticationResultType createEmailAuthenticationResultType() {
        return new EmailAuthenticationResultType();
    }

    /**
     * Create an instance of {@link 个人信息类型 }
     * 
     */
    public 个人信息类型 create个人信息类型() {
        return new 个人信息类型();
    }

    /**
     * Create an instance of {@link EmailAuthenticationInfoType }
     * 
     */
    public EmailAuthenticationInfoType createEmailAuthenticationInfoType() {
        return new EmailAuthenticationInfoType();
    }

    /**
     * Create an instance of {@link 所属部门列表类型 }
     * 
     */
    public 所属部门列表类型 create所属部门列表类型() {
        return new 所属部门列表类型();
    }

    /**
     * Create an instance of {@link 所属部门类型 }
     * 
     */
    public 所属部门类型 create所属部门类型() {
        return new 所属部门类型();
    }

    /**
     * Create an instance of {@link 身份标识类型 }
     * 
     */
    public 身份标识类型 create身份标识类型() {
        return new 身份标识类型();
    }

    /**
     * Create an instance of {@link 验证结果类型 }
     * 
     */
    public 验证结果类型 create验证结果类型() {
        return new 验证结果类型();
    }

    /**
     * Create an instance of {@link 学生认证信息类型 }
     * 
     */
    public 学生认证信息类型 create学生认证信息类型() {
        return new 学生认证信息类型();
    }

    /**
     * Create an instance of {@link StudentAuthorityParamType }
     * 
     */
    public StudentAuthorityParamType createStudentAuthorityParamType() {
        return new StudentAuthorityParamType();
    }

    /**
     * Create an instance of {@link 权限列表类型 }
     * 
     */
    public 权限列表类型 create权限列表类型() {
        return new 权限列表类型();
    }

    /**
     * Create an instance of {@link 权限编号类型 }
     * 
     */
    public 权限编号类型 create权限编号类型() {
        return new 权限编号类型();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 选课学生列表 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u9009\u8bfe\u5b66\u751f\u5217\u8868")
    public JAXBElement<选课学生列表> create选课学生列表(选课学生列表 value) {
        return new JAXBElement<选课学生列表>(_选课学生列表_QNAME, 选课学生列表.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/wsdl/fault", name = "ScoreExistedFaultEle")
    public JAXBElement<String> createScoreExistedFaultEle(String value) {
        return new JAXBElement<String>(_ScoreExistedFaultEle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u5f00\u8bfe\u5b66\u671f")
    public JAXBElement<String> create开课学期(String value) {
        return new JAXBElement<String>(_开课学期_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentInfoParamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "updateStudentInfoParam")
    public JAXBElement<UpdateStudentInfoParamType> createUpdateStudentInfoParam(UpdateStudentInfoParamType value) {
        return new JAXBElement<UpdateStudentInfoParamType>(_UpdateStudentInfoParam_QNAME, UpdateStudentInfoParamType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentAuthorityParamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/security/schema", name = "StudentAuthorityParam")
    public JAXBElement<StudentAuthorityParamType> createStudentAuthorityParam(StudentAuthorityParamType value) {
        return new JAXBElement<StudentAuthorityParamType>(_StudentAuthorityParam_QNAME, StudentAuthorityParamType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PwdFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/wsdl/fault", name = "PwdFaultEle")
    public JAXBElement<PwdFaultType> createPwdFaultEle(PwdFaultType value) {
        return new JAXBElement<PwdFaultType>(_PwdFaultEle_QNAME, PwdFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/wsdl/fault", name = "InvalidDataFaultEle", defaultValue = "Invalid Data")
    public JAXBElement<String> createInvalidDataFaultEle(String value) {
        return new JAXBElement<String>(_InvalidDataFaultEle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 学生信息类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u5b66\u751f")
    public JAXBElement<学生信息类型> create学生(学生信息类型 value) {
        return new JAXBElement<学生信息类型>(_学生_QNAME, 学生信息类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/wsdl/fault", name = "CourseDoNotExistFaultEle")
    public JAXBElement<String> createCourseDoNotExistFaultEle(String value) {
        return new JAXBElement<String>(_CourseDoNotExistFaultEle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 验证结果类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/security/schema", name = "\u9a8c\u8bc1\u7ed3\u679c")
    public JAXBElement<验证结果类型> create验证结果(验证结果类型 value) {
        return new JAXBElement<验证结果类型>(_验证结果_QNAME, 验证结果类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailPwdFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/wsdl/fault", name = "EmailPwdFaultEle")
    public JAXBElement<EmailPwdFaultType> createEmailPwdFaultEle(EmailPwdFaultType value) {
        return new JAXBElement<EmailPwdFaultType>(_EmailPwdFaultEle_QNAME, EmailPwdFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 任课教师列表类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u4efb\u8bfe\u6559\u5e08\u5217\u8868")
    public JAXBElement<任课教师列表类型> create任课教师列表(任课教师列表类型 value) {
        return new JAXBElement<任课教师列表类型>(_任课教师列表_QNAME, 任课教师列表类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u5b66\u5206")
    public JAXBElement<Integer> create学分(Integer value) {
        return new JAXBElement<Integer>(_学分_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailAuthenticationInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/schema", name = "EmailAuthenticationInfo")
    public JAXBElement<EmailAuthenticationInfoType> createEmailAuthenticationInfo(EmailAuthenticationInfoType value) {
        return new JAXBElement<EmailAuthenticationInfoType>(_EmailAuthenticationInfo_QNAME, EmailAuthenticationInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 学生认证信息类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/security/schema", name = "\u8ba4\u8bc1\u4fe1\u606f")
    public JAXBElement<学生认证信息类型> create认证信息(学生认证信息类型 value) {
        return new JAXBElement<学生认证信息类型>(_认证信息_QNAME, 学生认证信息类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8bfe\u7a0b\u540d\u79f0", defaultValue = "\u65e0")
    public JAXBElement<String> create课程名称(String value) {
        return new JAXBElement<String>(_课程名称_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/wsdl/fault", name = "ScoreDoNotExistFaultEle")
    public JAXBElement<String> createScoreDoNotExistFaultEle(String value) {
        return new JAXBElement<String>(_ScoreDoNotExistFaultEle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 开设院系列表类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u5f00\u8bbe\u9662\u7cfb\u5217\u8868")
    public JAXBElement<开设院系列表类型> create开设院系列表(开设院系列表类型 value) {
        return new JAXBElement<开设院系列表类型>(_开设院系列表_QNAME, 开设院系列表类型.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteScoreListParamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "deleteScoreListParam")
    public JAXBElement<DeleteScoreListParamType> createDeleteScoreListParam(DeleteScoreListParamType value) {
        return new JAXBElement<DeleteScoreListParamType>(_DeleteScoreListParam_QNAME, DeleteScoreListParamType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u9009\u8bfe\u4eba\u6570")
    public JAXBElement<BigInteger> create选课人数(BigInteger value) {
        return new JAXBElement<BigInteger>(_选课人数_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateScoreListParamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "updateScoreListParam")
    public JAXBElement<UpdateScoreListParamType> createUpdateScoreListParam(UpdateScoreListParamType value) {
        return new JAXBElement<UpdateScoreListParamType>(_UpdateScoreListParam_QNAME, UpdateScoreListParamType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 课程性质类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8bfe\u7a0b\u6027\u8d28")
    public JAXBElement<课程性质类型> create课程性质(课程性质类型 value) {
        return new JAXBElement<课程性质类型>(_课程性质_QNAME, 课程性质类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentInfoParamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "deleteStudentInfoParam")
    public JAXBElement<DeleteStudentInfoParamType> createDeleteStudentInfoParam(DeleteStudentInfoParamType value) {
        return new JAXBElement<DeleteStudentInfoParamType>(_DeleteStudentInfoParam_QNAME, DeleteStudentInfoParamType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u9009\u8bfe\u4eba\u6570\u4e0a\u9650")
    public JAXBElement<BigInteger> create选课人数上限(BigInteger value) {
        return new JAXBElement<BigInteger>(_选课人数上限_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 部门信息类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/schema", name = "\u90e8\u95e8\u4fe1\u606f")
    public JAXBElement<部门信息类型> create部门信息(部门信息类型 value) {
        return new JAXBElement<部门信息类型>(_部门信息_QNAME, 部门信息类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScoreListParamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "getScoreListParam")
    public JAXBElement<GetScoreListParamType> createGetScoreListParam(GetScoreListParamType value) {
        return new JAXBElement<GetScoreListParamType>(_GetScoreListParam_QNAME, GetScoreListParamType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudentInfoParamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "addStudentInfoParam")
    public JAXBElement<AddStudentInfoParamType> createAddStudentInfoParam(AddStudentInfoParamType value) {
        return new JAXBElement<AddStudentInfoParamType>(_AddStudentInfoParam_QNAME, AddStudentInfoParamType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 上课时间列表 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u4e0a\u8bfe\u65f6\u95f4\u5217\u8868")
    public JAXBElement<上课时间列表> create上课时间列表(上课时间列表 value) {
        return new JAXBElement<上课时间列表>(_上课时间列表_QNAME, 上课时间列表.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentDoNotExistFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/wsdl/fault", name = "StudentDoNotExistFaultEle")
    public JAXBElement<StudentDoNotExistFaultType> createStudentDoNotExistFaultEle(StudentDoNotExistFaultType value) {
        return new JAXBElement<StudentDoNotExistFaultType>(_StudentDoNotExistFaultEle_QNAME, StudentDoNotExistFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/wsdl/fault", name = "NotNjuFaultEle")
    public JAXBElement<String> createNotNjuFaultEle(String value) {
        return new JAXBElement<String>(_NotNjuFaultEle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddScoreListParamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "addScoreListParam")
    public JAXBElement<AddScoreListParamType> createAddScoreListParam(AddScoreListParamType value) {
        return new JAXBElement<AddScoreListParamType>(_AddScoreListParam_QNAME, AddScoreListParamType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorityDoNotExistFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/wsdl/fault", name = "AuthorityDoNotExistFaultEle")
    public JAXBElement<AuthorityDoNotExistFaultType> createAuthorityDoNotExistFaultEle(AuthorityDoNotExistFaultType value) {
        return new JAXBElement<AuthorityDoNotExistFaultType>(_AuthorityDoNotExistFaultEle_QNAME, AuthorityDoNotExistFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentInfoParamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "getStudentInfoParam")
    public JAXBElement<GetStudentInfoParamType> createGetStudentInfoParam(GetStudentInfoParamType value) {
        return new JAXBElement<GetStudentInfoParamType>(_GetStudentInfoParam_QNAME, GetStudentInfoParamType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentExistedFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/wsdl/fault", name = "StudentExistedFaultEle")
    public JAXBElement<StudentExistedFaultType> createStudentExistedFaultEle(StudentExistedFaultType value) {
        return new JAXBElement<StudentExistedFaultType>(_StudentExistedFaultEle_QNAME, StudentExistedFaultType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailAuthenticationResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/schema", name = "EmailAuthenticationResult")
    public JAXBElement<EmailAuthenticationResultType> createEmailAuthenticationResult(EmailAuthenticationResultType value) {
        return new JAXBElement<EmailAuthenticationResultType>(_EmailAuthenticationResult_QNAME, EmailAuthenticationResultType.class, null, value);
    }

}
