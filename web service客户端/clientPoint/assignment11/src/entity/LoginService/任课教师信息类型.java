
package entity.LoginService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>任课教师信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="任课教师信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="教师编号" type="{http://jw.nju.edu.cn/schema}教师编号类型"/>
 *         &lt;element name="教师姓名" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u4efb\u8bfe\u6559\u5e08\u4fe1\u606f\u7c7b\u578b", propOrder = {
    "\u6559\u5e08\u7f16\u53f7",
    "\u6559\u5e08\u59d3\u540d"
})
public class 任课教师信息类型 {

    @XmlElement(required = true)
    protected String 教师编号;
    @XmlElement(required = true, defaultValue = "\u65e0")
    protected String 教师姓名;

    /**
     * 获取教师编号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get教师编号() {
        return 教师编号;
    }

    /**
     * 设置教师编号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set教师编号(String value) {
        this.教师编号 = value;
    }

    /**
     * 获取教师姓名属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get教师姓名() {
        return 教师姓名;
    }

    /**
     * 设置教师姓名属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set教师姓名(String value) {
        this.教师姓名 = value;
    }

}
