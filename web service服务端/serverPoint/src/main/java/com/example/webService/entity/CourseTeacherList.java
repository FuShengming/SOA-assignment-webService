
package com.example.webService.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>任课教师列表类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="任课教师列表类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="任课教师信息" type="{http://jw.nju.edu.cn/schema}任课教师信息类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "任课教师列表", propOrder = {
        "courseTeachers"
})
public class CourseTeacherList {

    @XmlElement(name="任课教师信息",required = true)
    protected List<TeacherInfo> courseTeachers;

    /**
     * Gets the value of the 任课教师信息 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the 任课教师信息 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get任课教师信息().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeacherInfo }
     * 
     * 
     */
    public List<TeacherInfo> getCourseTeachers() {
        if (courseTeachers == null) {
            courseTeachers = new ArrayList<TeacherInfo>();
        }
        return this.courseTeachers;
    }

}
