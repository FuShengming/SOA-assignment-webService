
package com.example.webService.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>验证结果类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="验证结果类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="学号" type="{http://jw.nju.edu.cn/schema}学号类型"/>
 *         &lt;element name="权限列表" type="{http://www.nju.edu.cn/security/schema}权限列表类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "验证结果类型", namespace = "http://www.nju.edu.cn/security/schema", propOrder = {
    "studentId",
    "authorityList"
})
public class authenticationResult {

    @XmlElement(required = true,name = "学号")
    protected String studentId;
    @XmlElement(required = true,name="权限列表")
    protected AuthorityList authorityList;

    /**
     * 获取学号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * 设置学号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentId(String value) {
        this.studentId = value;
    }

    /**
     * 获取权限列表属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AuthorityList }
     *     
     */
    public AuthorityList getAuthorityList() {
        return authorityList;
    }

    /**
     * 设置权限列表属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityList }
     *     
     */
    public void setAuthorityList(AuthorityList value) {
        this.authorityList = value;
    }

}
