
package com.example.webService.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>课程成绩列表类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="课程成绩列表类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="课程成绩" type="{http://jw.nju.edu.cn/schema}课程成绩类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourseScoreList", propOrder = {
    "CourseScore"
})
public class CourseScoreList {
    public void setCourseScore(List<com.example.webService.entity.CourseScore> courseScore) {
        CourseScore = courseScore;
    }

    @XmlElement(name="课程成绩",required = true)
    protected List<CourseScore> CourseScore;

    /**
     * Gets the value of the 课程成绩 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the 课程成绩 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get课程成绩().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link main.java.example.webService.CourseScore }
     * 
     * 
     */
    public List<CourseScore> getCourseScore() {
        if (CourseScore == null) {
            CourseScore = new ArrayList<CourseScore>();
        }
        return this.CourseScore;
    }

}
