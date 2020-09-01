
package com.example.webService.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>身份标识类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="身份标识类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="身份证号" type="{http://www.nju.edu.cn/schema}身份证号类型"/>
 *         &lt;element name="护照编号" type="{http://www.nju.edu.cn/schema}护照编号类型"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "身份标识类型", namespace = "http://www.nju.edu.cn/schema", propOrder = {
    "creditId",
    "passportId"
})
public class Identify {
    @XmlElement(name = "身份证号")
    protected String creditId;
    @XmlElement(name = "护照编号")
    protected String passportId;

    /**
     * 获取身份证号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditId() {
        return creditId;
    }

    /**
     * 设置身份证号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditId(String value) {
        this.creditId = value;
    }

    /**
     * 获取护照编号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportId() {
        return passportId;
    }

    /**
     * 设置护照编号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportId(String value) {
        this.passportId = value;
    }

}
