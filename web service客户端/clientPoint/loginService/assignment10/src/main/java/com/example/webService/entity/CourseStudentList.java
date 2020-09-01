
package com.example.webService.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>选课学生列表 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="选课学生列表">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="选课学生信息" type="{http://jw.nju.edu.cn/schema}学生身份"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "选课学生列表", propOrder = {
    "studentIdentities"
})
public class CourseStudentList {

    protected List<StudentIdentity> studentIdentities;

    /**
     * Gets the value of the 选课学生信息 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the 选课学生信息 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get选课学生信息().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentIdentity }
     * 
     * 
     */
    public List<StudentIdentity> getStudentIdentities() {
        if (studentIdentities == null) {
            studentIdentities = new ArrayList<StudentIdentity>();
        }
        return this.studentIdentities;
    }

}
