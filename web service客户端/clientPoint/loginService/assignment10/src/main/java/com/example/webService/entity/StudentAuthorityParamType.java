
package com.example.webService.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StudentAuthorityParamType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StudentAuthorityParamType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="认证信息" type="{http://www.nju.edu.cn/security/schema}学生认证信息类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentAuthorityParamType", namespace = "http://www.nju.edu.cn/security/schema", propOrder = {
    "studentAuthenticationInfo"
})
public class StudentAuthorityParamType {

    @XmlElement(required = true,name = "认证信息")
    protected StudentAuthenticationInfo studentAuthenticationInfo;

    /**
     * 获取认证信息属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StudentAuthenticationInfo }
     *     
     */
    public StudentAuthenticationInfo getStudentAuthenticationInfo() {
        return studentAuthenticationInfo;
    }

    /**
     * 设置认证信息属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StudentAuthenticationInfo }
     *     
     */
    public void setStudentAuthenticationInfo(StudentAuthenticationInfo value) {
        this.studentAuthenticationInfo = value;
    }

}
