
package com.example.webService.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>所属部门列表类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="所属部门列表类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="所属部门" type="{http://www.nju.edu.cn/schema}所属部门类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "所属部门列表类型", namespace = "http://www.nju.edu.cn/schema", propOrder = {
        "apartments"
})
public class ApartmentList {

    protected List<Apartment> apartments;

    /**
     * Gets the value of the 所属部门 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the 所属部门 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get所属部门().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Apartment }
     * 
     * 
     */
    public List<Apartment> getApartments() {
        if (apartments == null) {
            apartments = new ArrayList<Apartment>();
        }
        return this.apartments;
    }

}
