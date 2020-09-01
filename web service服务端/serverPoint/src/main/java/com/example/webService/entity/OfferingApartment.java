
package com.example.webService.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>开设院系类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="开设院系类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="院系编号" type="{http://www.nju.edu.cn/schema}部门编号类型"/>
 *         &lt;element name="院系名称" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "开设院系类型", propOrder = {
    "apartmentId",
    "apartmentName"
})
public class OfferingApartment {

    @XmlElement(required = true, defaultValue = "000000",name="院系编号")
    protected String apartmentId;
    @XmlElement(required = true, defaultValue = "无",name="院系名称")
    protected String apartmentName;

    /**
     * 获取院系编号属性的值。
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
     * 设置院系编号属性的值。
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
     * 获取院系名称属性的值。
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
     * 设置院系名称属性的值。
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
