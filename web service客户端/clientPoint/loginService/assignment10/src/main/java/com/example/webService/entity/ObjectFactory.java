
package com.example.webService.entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import java.math.BigInteger;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the main.java.example.webService package. 
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
    private final static QName _开设院系列表_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5f00\u8bbe\u9662\u7cfb\u5217\u8868");
    private final static QName _开课学期_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5f00\u8bfe\u5b66\u671f");
    private final static QName _学号_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5b66\u53f7");
    private final static QName _选课人数_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u9009\u8bfe\u4eba\u6570");
    private final static QName _课程性质_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u6027\u8d28");
    private final static QName _PwdFaultEle_QNAME = new QName("http://jw.nju.edu.cn/wsdl/fault", "PwdFaultEle");
    private final static QName _课程编号_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u7f16\u53f7");
    private final static QName _选课人数上限_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u9009\u8bfe\u4eba\u6570\u4e0a\u9650");
    private final static QName _学生_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5b66\u751f");
    private final static QName _InvalidDataFaultEle_QNAME = new QName("http://jw.nju.edu.cn/wsdl/fault", "InvalidDataFaultEle");
    private final static QName _部门信息_QNAME = new QName("http://www.nju.edu.cn/schema", "\u90e8\u95e8\u4fe1\u606f");
    private final static QName _验证结果_QNAME = new QName("http://www.nju.edu.cn/security/schema", "\u9a8c\u8bc1\u7ed3\u679c");
    private final static QName _任课教师列表_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u4efb\u8bfe\u6559\u5e08\u5217\u8868");
    private final static QName _学分_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5b66\u5206");
    private final static QName _认证信息_QNAME = new QName("http://www.nju.edu.cn/security/schema", "\u8ba4\u8bc1\u4fe1\u606f");
    private final static QName _上课时间列表_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u4e0a\u8bfe\u65f6\u95f4\u5217\u8868");
    private final static QName _课程名称_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u540d\u79f0");
    private final static QName _StudentDoNotExistFaultEle_QNAME = new QName("http://jw.nju.edu.cn/wsdl/fault", "StudentDoNotExistFaultEle");
    private final static QName _个人信息_QNAME = new QName("http://www.nju.edu.cn/schema", "\u4e2a\u4eba\u4fe1\u606f");
    private final static QName _StudentExistedFaultEle_QNAME = new QName("http://jw.nju.edu.cn/wsdl/fault", "StudentExistedFaultEle");
    private final static QName _课程成绩列表_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u6210\u7ee9\u5217\u8868");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: main.java.example.webService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CourseScoreList }
     * 
     */
    public CourseScoreList create课程成绩列表类型() {
        return new CourseScoreList();
    }

    /**
     * Create an instance of {@link CourseTimeList }
     * 
     */
    public CourseTimeList create上课时间列表() {
        return new CourseTimeList();
    }

    /**
     * Create an instance of {@link CourseTeacherList }
     * 
     */
    public CourseTeacherList create任课教师列表类型() {
        return new CourseTeacherList();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student create学生信息类型() {
        return new Student();
    }

    /**
     * Create an instance of {@link CourseStudentList }
     * 
     */
    public CourseStudentList create选课学生列表() {
        return new CourseStudentList();
    }

    /**
     * Create an instance of {@link OfferingApartmentList }
     * 
     */
    public OfferingApartmentList create开设院系列表类型() {
        return new OfferingApartmentList();
    }

    /**
     * Create an instance of {@link CourseScore }
     * 
     */
    public CourseScore create课程成绩类型() {
        return new CourseScore();
    }

    /**
     * Create an instance of {@link TeacherInfo }
     * 
     */
    public TeacherInfo create任课教师信息类型() {
        return new TeacherInfo();
    }

    /**
     * Create an instance of {@link Score }
     * 
     */
    public Score create成绩类型() {
        return new Score();
    }

    /**
     * Create an instance of {@link OfferingApartment }
     * 
     */
    public OfferingApartment create开设院系类型() {
        return new OfferingApartment();
    }

    /**
     * Create an instance of {@link StudentIdentity }
     * 
     */
    public StudentIdentity create学生身份() {
        return new StudentIdentity();
    }

    /**
     * Create an instance of {@link ApartmentInfo }
     * 
     */
    public ApartmentInfo create部门信息类型() {
        return new ApartmentInfo();
    }

    /**
     * Create an instance of {@link PersonalInfo }
     * 
     */
    public PersonalInfo create个人信息类型() {
        return new PersonalInfo();
    }

    /**
     * Create an instance of {@link Identify }
     * 
     */
    public Identify create身份标识类型() {
        return new Identify();
    }

    /**
     * Create an instance of {@link ApartmentList }
     * 
     */
    public ApartmentList create所属部门列表类型() {
        return new ApartmentList();
    }

    /**
     * Create an instance of {@link Apartment }
     * 
     */
    public Apartment create所属部门类型() {
        return new Apartment();
    }

    /**
     * Create an instance of {@link StudentExistedFaultType }
     * 
     */
    public StudentExistedFaultType createStudentExistedFaultType() {
        return new StudentExistedFaultType();
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
     * Create an instance of {@link authenticationResult }
     * 
     */
    public authenticationResult create验证结果类型() {
        return new authenticationResult();
    }

    /**
     * Create an instance of {@link StudentAuthenticationInfo }
     * 
     */
    public StudentAuthenticationInfo create学生认证信息类型() {
        return new StudentAuthenticationInfo();
    }

    /**
     * Create an instance of {@link AuthorityList }
     * 
     */
    public AuthorityList create权限列表类型() {
        return new AuthorityList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CourseStudentList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u9009\u8bfe\u5b66\u751f\u5217\u8868")
    public JAXBElement<CourseStudentList> create选课学生列表(CourseStudentList value) {
        return new JAXBElement<CourseStudentList>(_选课学生列表_QNAME, CourseStudentList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferingApartmentList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u5f00\u8bbe\u9662\u7cfb\u5217\u8868")
    public JAXBElement<OfferingApartmentList> create开设院系列表(OfferingApartmentList value) {
        return new JAXBElement<OfferingApartmentList>(_开设院系列表_QNAME, OfferingApartmentList.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u5b66\u53f7")
    public JAXBElement<String> create学号(String value) {
        return new JAXBElement<String>(_学号_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CourseCharacter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8bfe\u7a0b\u6027\u8d28")
    public JAXBElement<CourseCharacter> create课程性质(CourseCharacter value) {
        return new JAXBElement<CourseCharacter>(_课程性质_QNAME, CourseCharacter.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Student }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u5b66\u751f")
    public JAXBElement<Student> create学生(Student value) {
        return new JAXBElement<Student>(_学生_QNAME, Student.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ApartmentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/schema", name = "\u90e8\u95e8\u4fe1\u606f")
    public JAXBElement<ApartmentInfo> create部门信息(ApartmentInfo value) {
        return new JAXBElement<ApartmentInfo>(_部门信息_QNAME, ApartmentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link authenticationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/security/schema", name = "\u9a8c\u8bc1\u7ed3\u679c")
    public JAXBElement<authenticationResult> create验证结果(authenticationResult value) {
        return new JAXBElement<authenticationResult>(_验证结果_QNAME, authenticationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CourseTeacherList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u4efb\u8bfe\u6559\u5e08\u5217\u8868")
    public JAXBElement<CourseTeacherList> create任课教师列表(CourseTeacherList value) {
        return new JAXBElement<CourseTeacherList>(_任课教师列表_QNAME, CourseTeacherList.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentAuthenticationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/security/schema", name = "\u8ba4\u8bc1\u4fe1\u606f")
    public JAXBElement<StudentAuthenticationInfo> create认证信息(StudentAuthenticationInfo value) {
        return new JAXBElement<StudentAuthenticationInfo>(_认证信息_QNAME, StudentAuthenticationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CourseTimeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u4e0a\u8bfe\u65f6\u95f4\u5217\u8868")
    public JAXBElement<CourseTimeList> create上课时间列表(CourseTimeList value) {
        return new JAXBElement<CourseTimeList>(_上课时间列表_QNAME, CourseTimeList.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentDoNotExistFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/wsdl/fault", name = "StudentDoNotExistFaultEle")
    public JAXBElement<StudentDoNotExistFaultType> createStudentDoNotExistFaultEle(StudentDoNotExistFaultType value) {
        return new JAXBElement<StudentDoNotExistFaultType>(_StudentDoNotExistFaultEle_QNAME, StudentDoNotExistFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/schema", name = "\u4e2a\u4eba\u4fe1\u606f")
    public JAXBElement<PersonalInfo> create个人信息(PersonalInfo value) {
        return new JAXBElement<PersonalInfo>(_个人信息_QNAME, PersonalInfo.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CourseScoreList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8bfe\u7a0b\u6210\u7ee9\u5217\u8868")
    public JAXBElement<CourseScoreList> create课程成绩列表(CourseScoreList value) {
        return new JAXBElement<CourseScoreList>(_课程成绩列表_QNAME, CourseScoreList.class, null, value);
    }

}
