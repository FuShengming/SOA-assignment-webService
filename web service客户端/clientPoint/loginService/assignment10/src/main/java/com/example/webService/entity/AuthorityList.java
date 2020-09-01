
package com.example.webService.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>权限列表类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="权限列表类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="权限编号" type="{http://www.nju.edu.cn/security/schema}权限编号类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "权限列表类型", namespace = "http://www.nju.edu.cn/security/schema", propOrder = {
    "authorityIds"
})
public class AuthorityList {

    public void setAuthorityIds(List<AuthorityId> authorityIds) {
        this.authorityIds = authorityIds;
    }

    @XmlElement(required = true,name = "权限编号")
    protected List<AuthorityId> authorityIds;

    /**
     * Gets the value of the 权限编号 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the 权限编号 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get权限编号().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorityId }
     * 
     * 
     */
    public List<AuthorityId> getAuthorityIds() {
        if (authorityIds == null) {
            authorityIds = new ArrayList<AuthorityId>();
        }
        return this.authorityIds;
    }

}
