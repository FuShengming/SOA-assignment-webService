
package com.example.webService.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>updateStudentInfoParamType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="updateStudentInfoParamType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="学生" type="{http://jw.nju.edu.cn/schema}学生信息类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateStudentInfoParamType", propOrder = {
    "student"
})
public class UpdateStudentInfoParamType {

    @XmlElement(required = true,name="学生")
    protected Student student;

    /**
     * 获取学生属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 学生信息类型 }
     *     
     */
    public Student getStudent() {
        return student;
    }

    /**
     * 设置学生属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 学生信息类型 }
     *     
     */
    public void setStudent(Student value) {
        this.student = value;
    }

}
