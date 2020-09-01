
package com.example.webService.entity;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>个人信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="个人信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="姓名" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="性别" type="{http://www.nju.edu.cn/schema}性别类型"/>
 *         &lt;element name="民族" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="出生日期" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="国籍" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="身份标识" type="{http://www.nju.edu.cn/schema}身份标识类型"/>
 *         &lt;element name="联系电话" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="联系邮箱" type="{http://www.nju.edu.cn/schema}联系邮箱类型"/>
 *         &lt;element name="所属部门列表" type="{http://www.nju.edu.cn/schema}所属部门列表类型"/>
 *         &lt;element name="家庭住址" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "\u4e2a\u4eba\u4fe1\u606f\u7c7b\u578b", namespace = "http://www.nju.edu.cn/schema", propOrder = {
        "name",
        "gender",
        "ethnic",
        "birthday",
        "nationality",
        "identity",
        "phone",
        "email",
        "apartmentList",
        "address",
        "politicalStatus"
})
public class PersonalInfo {

    @XmlElement(required = true,name = "姓名")
    protected String name;
    @XmlElement(required = true,name = "性别")
    protected Gender gender;
    @XmlElement(required = true,name = "民族")
    protected String ethnic;
    @XmlElement(required = true,name = "出生日期")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthday;
    @XmlElement(required = true,name = "国籍")
    protected String nationality;
    @XmlElement(required = true,name = "身份标识")
    protected Identify identity;
    @XmlElement(required = true,name = "联系电话")
    protected String phone;
    @XmlElement(required = true,name = "联系邮箱")
    protected String email;
    @XmlElement(required = true,name = "所属部门列表")
    protected ApartmentList apartmentList;
    @XmlElement(required = true, defaultValue = "",name = "家庭住址")
    protected String address;
    @XmlElement(required = true,name = "政治面貌")
    protected PoliticalStatus politicalStatus;

    /**
     * 获取姓名属性的值。
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
     * 设置姓名属性的值。
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
     * 获取性别属性的值。
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
     * 设置性别属性的值。
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
     * 获取民族属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthnic() {
        return ethnic;
    }

    /**
     * 设置民族属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthnic(String value) {
        this.ethnic = value;
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
     * 获取国籍属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * 设置国籍属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * 获取身份标识属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Identify }
     *     
     */
    public Identify getIdentity() {
        return identity;
    }

    /**
     * 设置身份标识属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Identify }
     *     
     */
    public void setIdentity(Identify value) {
        this.identity = value;
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
     * 获取所属部门列表属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ApartmentList }
     *     
     */
    public ApartmentList getApartmentList() {
        return apartmentList;
    }

    /**
     * 设置所属部门列表属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ApartmentList }
     *     
     */
    public void setApartmentList(ApartmentList value) {
        this.apartmentList = value;
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
