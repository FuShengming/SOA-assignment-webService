
package com.example.webService.entity;

import com.example.webService.JpaEntity.StudentInfoEntity;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>学生信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="学生信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="学号" type="{http://jw.nju.edu.cn/schema}学号类型"/>
 *         &lt;element name="学生姓名" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="学生性别" type="{http://www.nju.edu.cn/schema}性别类型"/>
 *         &lt;element name="出生日期" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="联系电话" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="联系邮箱" type="{http://www.nju.edu.cn/schema}联系邮箱类型"/>
 *         &lt;element name="所属院系" type="{http://www.nju.edu.cn/schema}所属部门类型"/>
 *         &lt;element name="家庭住址" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="课程成绩列表" type="{http://jw.nju.edu.cn/schema}课程成绩列表类型"/>
 *         &lt;element name="入学年级" type="{http://jw.nju.edu.cn/schema}入学年级类型"/>
 *         &lt;element name="学籍性质" type="{http://jw.nju.edu.cn/schema}学籍性质类型"/>
 *         &lt;element name="政治面貌" type="{http://www.nju.edu.cn/schema}政治面貌类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
        "id",
        "name",
        "gender",
        "birthday",
        "phone",
        "email",
        "apartment",
        "address",
        "courseScoreList",
        "grade",
        "studentStatus",
        "politicalStatus"
})
public class Student {

    @XmlElement(name="学号",required = true)
    protected String id;
    @XmlElement(name="学生姓名",required = true)
    protected String name;
    @XmlElement(name="学生性别",required = true)
    protected Gender gender;
    @XmlElement(name="出生日期",required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name="联系电话",required = true, defaultValue = "\u65e0")
    protected String phone;
    @XmlElement(name="联系邮箱",required = true)
    protected String email;
    @XmlElement(name="所属院系",required = true)
    protected Apartment apartment;
    @XmlElement(name="家庭住址",required = true, defaultValue = "\u65e0")
    protected String address;
    @XmlElement(name="课程成绩列表",required = true)
    protected CourseScoreList courseScoreList;
    @XmlElement(name="入学年级",required = true)
    protected String grade;
    @XmlElement(name="学籍性质",required = true)
    protected StudentStatus studentStatus;
    @XmlElement(name="政治面貌",required = true)
    protected PoliticalStatus politicalStatus;





    /**
     * 获取学号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置学号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * 获取学生姓名属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置学生姓名属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取学生性别属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * 设置学生性别属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * 获取出生日期属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * 设置出生日期属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * 获取联系电话属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系电话属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * 获取联系邮箱属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置联系邮箱属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * 获取所属院系属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Apartment }
     *     
     */
    public Apartment getApartment() {
        return apartment;
    }

    /**
     * 设置所属院系属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Apartment }
     *     
     */
    public void setApartment(Apartment value) {
        this.apartment = value;
    }

    /**
     * 获取家庭住址属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置家庭住址属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * 获取课程成绩列表属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CourseScoreList }
     *     
     */
    public CourseScoreList getCourseScoreList() {
        return courseScoreList;
    }

    /**
     * 设置课程成绩列表属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CourseScoreList }
     *     
     */
    public void setCourseScoreList(CourseScoreList value) {
        this.courseScoreList = value;
    }

    /**
     * 获取入学年级属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置入学年级属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrade(String value) {
        this.grade = value;
    }

    /**
     * 获取学籍性质属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StudentStatus }
     *     
     */
    public StudentStatus getStudentStatus() {
        return studentStatus;
    }

    /**
     * 设置学籍性质属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StudentStatus }
     *     
     */
    public void setStudentStatus(StudentStatus value) {
        this.studentStatus = value;
    }

    /**
     * 获取政治面貌属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PoliticalStatus }
     *     
     */
    public PoliticalStatus getPoliticalStatus() {
        return politicalStatus;
    }

    /**
     * 设置政治面貌属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PoliticalStatus }
     *     
     */
    public void setPoliticalStatus(PoliticalStatus value) {
        this.politicalStatus = value;
    }

}
