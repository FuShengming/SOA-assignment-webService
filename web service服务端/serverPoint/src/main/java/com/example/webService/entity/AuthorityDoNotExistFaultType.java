
package com.example.webService.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AuthorityDoNotExistFaultType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AuthorityDoNotExistFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="权限编号" type="{http://www.nju.edu.cn/security/schema}权限分类类型"/>
 *         &lt;element name="错误" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorityDoNotExistFaultType", namespace = "http://jw.nju.edu.cn/wsdl/fault", propOrder = {
    "authorityCharacter",
    "fault"
})
public class AuthorityDoNotExistFaultType {

    @XmlElement(required = true)
    protected AuthorityCharacter authorityCharacter;
    @XmlElement(required = true, defaultValue = "\u6743\u9650\u7f16\u53f7\u4e0d\u5b58\u5728")
    protected String fault;

    /**
     * 获取权限编号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 权限分类类型 }
     *     
     */
    public AuthorityCharacter getAuthorityCharacter() {
        return authorityCharacter;
    }

    /**
     * 设置权限编号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 权限分类类型 }
     *     
     */
    public void setAuthorityCharacter(AuthorityCharacter value) {
        this.authorityCharacter = value;
    }

    /**
     * 获取错误属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public String getFault() {
        return fault;
    }

    /**
     * 设置错误属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFault(String value) {
        this.fault = value;
    }

}
