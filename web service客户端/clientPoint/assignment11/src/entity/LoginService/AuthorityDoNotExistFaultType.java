
package entity.LoginService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AuthorityDoNotExistFaultType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AuthorityDoNotExistFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="权限编号" type="{http://www.nju.edu.cn/security/schema}权限分类类型"/>
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
@XmlType(name = "AuthorityDoNotExistFaultType", namespace = "http://jw.nju.edu.cn/wsdl/fault", propOrder = {
    "\u6743\u9650\u7f16\u53f7",
    "\u9519\u8bef"
})
public class AuthorityDoNotExistFaultType {

    @XmlElement(required = true)
    protected 权限分类类型 权限编号;
    @XmlElement(required = true, defaultValue = "\u6743\u9650\u7f16\u53f7\u4e0d\u5b58\u5728")
    protected Object 错误;

    /**
     * 获取权限编号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 权限分类类型 }
     *     
     */
    public 权限分类类型 get权限编号() {
        return 权限编号;
    }

    /**
     * 设置权限编号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 权限分类类型 }
     *     
     */
    public void set权限编号(权限分类类型 value) {
        this.权限编号 = value;
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
