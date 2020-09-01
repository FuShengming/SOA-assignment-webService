
package entity.LoginService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>验证结果类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="验证结果类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="学号" type="{http://jw.nju.edu.cn/schema}学号类型"/>
 *         &lt;element name="权限列表" type="{http://www.nju.edu.cn/security/schema}权限列表类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u9a8c\u8bc1\u7ed3\u679c\u7c7b\u578b", namespace = "http://www.nju.edu.cn/security/schema", propOrder = {
    "\u5b66\u53f7",
    "\u6743\u9650\u5217\u8868"
})
public class 验证结果类型 {

    @XmlElement(required = true)
    protected String 学号;
    @XmlElement(required = true)
    protected 权限列表类型 权限列表;

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
     * 获取权限列表属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 权限列表类型 }
     *     
     */
    public 权限列表类型 get权限列表() {
        return 权限列表;
    }

    /**
     * 设置权限列表属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 权限列表类型 }
     *     
     */
    public void set权限列表(权限列表类型 value) {
        this.权限列表 = value;
    }

}
