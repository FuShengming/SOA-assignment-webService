
package com.example.webService.entity;

import javax.xml.bind.annotation.*;


/**
 * <p>权限编号类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="权限编号类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="编号" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="权限类别" type="{http://www.nju.edu.cn/security/schema}权限分类类型" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "权限编号类型", namespace = "http://www.nju.edu.cn/security/schema", propOrder = {
    "id"
})
public class AuthorityId {

    @XmlElement(required = true,name = "编号")
    protected String id;
    @XmlAttribute
    protected AuthorityCharacter authorityCharacter;

    /**
     * 获取编号属性的值。
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
     * 设置编号属性的值。
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
     * 获取权限类别属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AuthorityCharacter }
     *     
     */
    public AuthorityCharacter getAuthorityCharacter() {
        return authorityCharacter;
    }

    /**
     * 设置权限类别属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityCharacter }
     *     
     */
    public void setAuthorityCharacter(AuthorityCharacter value) {
        this.authorityCharacter = value;
    }

}
