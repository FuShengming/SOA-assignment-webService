
package com.example.webService.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>所属部门类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="所属部门类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="部门编号" type="{http://www.nju.edu.cn/schema}部门编号类型"/>
 *         &lt;element name="部门名称" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u6240\u5c5e\u90e8\u95e8\u7c7b\u578b", namespace = "http://www.nju.edu.cn/schema", propOrder = {
    "apartmentId",
    "apartmentName"
})
public class Apartment {

    @XmlElement(name="部门编号",required = true, defaultValue = "000000")
    protected String apartmentId;
    @XmlElement(name="部门名称",required = true, defaultValue = "无")
    protected String apartmentName;

    /**
     * 获取部门编号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartmentId() {
        return apartmentId;
    }

    /**
     * 设置部门编号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartmentId(String value) {
        this.apartmentId = value;
    }

    /**
     * 获取部门名称属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartmentName() {
        return apartmentName;
    }

    /**
     * 设置部门名称属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartmentName(String value) {
        this.apartmentName = value;
    }

}
