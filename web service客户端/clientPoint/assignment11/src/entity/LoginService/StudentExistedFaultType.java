
package entity.LoginService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StudentExistedFaultType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StudentExistedFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="学号" type="{http://jw.nju.edu.cn/schema}学号类型"/>
 *         &lt;element name="错误" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentExistedFaultType", namespace = "http://jw.nju.edu.cn/wsdl/fault", propOrder = {
    "\u5b66\u53f7",
    "\u9519\u8bef"
})
public class StudentExistedFaultType {

    @XmlElement(required = true)
    protected String 学号;
    @XmlElement(required = true, defaultValue = "\u5b66\u751f\u4fe1\u606f\u5df2\u5b58\u5728")
    protected Object 错误;

    /**
     * 获取学号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get学号() {
        return 学号;
    }

    /**
     * 设置学号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set学号(String value) {
        this.学号 = value;
    }

    /**
     * 获取错误属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object get错误() {
        return 错误;
    }

    /**
     * 设置错误属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void set错误(Object value) {
        this.错误 = value;
    }

}
