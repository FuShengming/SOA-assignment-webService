
package entity.LoginService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>身份标识类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="身份标识类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="身份证号" type="{http://www.nju.edu.cn/schema}身份证号类型"/>
 *         &lt;element name="护照编号" type="{http://www.nju.edu.cn/schema}护照编号类型"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u8eab\u4efd\u6807\u8bc6\u7c7b\u578b", namespace = "http://www.nju.edu.cn/schema", propOrder = {
    "\u8eab\u4efd\u8bc1\u53f7",
    "\u62a4\u7167\u7f16\u53f7"
})
public class 身份标识类型 {

    protected String 身份证号;
    protected String 护照编号;

    /**
     * 获取身份证号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get身份证号() {
        return 身份证号;
    }

    /**
     * 设置身份证号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set身份证号(String value) {
        this.身份证号 = value;
    }

    /**
     * 获取护照编号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get护照编号() {
        return 护照编号;
    }

    /**
     * 设置护照编号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set护照编号(String value) {
        this.护照编号 = value;
    }

}
