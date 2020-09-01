
package entity.LoginService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>学生认证信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="学生认证信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="学号" type="{http://jw.nju.edu.cn/schema}学号类型"/>
 *         &lt;element name="密码" type="{http://www.nju.edu.cn/security/schema}密码类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5b66\u751f\u8ba4\u8bc1\u4fe1\u606f\u7c7b\u578b", namespace = "http://www.nju.edu.cn/security/schema", propOrder = {
    "\u5b66\u53f7",
    "\u5bc6\u7801"
})
public class 学生认证信息类型 {

    @XmlElement(required = true)
    protected String 学号;
    @XmlElement(required = true)
    protected String 密码;

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
     * 获取密码属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get密码() {
        return 密码;
    }

    /**
     * 设置密码属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set密码(String value) {
        this.密码 = value;
    }

}
