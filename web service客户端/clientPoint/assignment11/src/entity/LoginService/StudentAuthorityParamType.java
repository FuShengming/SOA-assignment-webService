
package entity.LoginService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StudentAuthorityParamType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StudentAuthorityParamType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="认证信息" type="{http://www.nju.edu.cn/security/schema}学生认证信息类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentAuthorityParamType", namespace = "http://www.nju.edu.cn/security/schema", propOrder = {
    "\u8ba4\u8bc1\u4fe1\u606f"
})
public class StudentAuthorityParamType {

    @XmlElement(required = true)
    protected 学生认证信息类型 认证信息;

    /**
     * 获取认证信息属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 学生认证信息类型 }
     *     
     */
    public 学生认证信息类型 get认证信息() {
        return 认证信息;
    }

    /**
     * 设置认证信息属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 学生认证信息类型 }
     *     
     */
    public void set认证信息(学生认证信息类型 value) {
        this.认证信息 = value;
    }

}
