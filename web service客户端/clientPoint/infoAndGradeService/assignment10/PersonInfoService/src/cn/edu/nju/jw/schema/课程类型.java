
package cn.edu.nju.jw.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import cn.edu.nju.schema.个人信息类型;


/**
 * <p>课程类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="课程类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="课程编号" type="{http://jw.nju.edu.cn/schema}课程编号类型"/>
 *         &lt;element name="课程名字" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="任课老师" type="{http://www.nju.edu.cn/schema}个人信息类型"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u8bfe\u7a0b\u7c7b\u578b", propOrder = {

})
public class 课程类型 {

    @XmlElement(required = true)
    protected String 课程编号;
    @XmlElement(required = true)
    protected String 课程名字;
    @XmlElement(required = true)
    protected 个人信息类型 任课老师;

    /**
     * 获取课程编号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get课程编号() {
        return 课程编号;
    }

    /**
     * 设置课程编号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set课程编号(String value) {
        this.课程编号 = value;
    }

    /**
     * 获取课程名字属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get课程名字() {
        return 课程名字;
    }

    /**
     * 设置课程名字属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set课程名字(String value) {
        this.课程名字 = value;
    }

    /**
     * 获取任课老师属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 个人信息类型 }
     *     
     */
    public 个人信息类型 get任课老师() {
        return 任课老师;
    }

    /**
     * 设置任课老师属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 个人信息类型 }
     *     
     */
    public void set任课老师(个人信息类型 value) {
        this.任课老师 = value;
    }

}
