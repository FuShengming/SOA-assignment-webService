
package entity.LoginService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>权限编号类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="权限编号类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="编号" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="权限类别" type="{http://www.nju.edu.cn/security/schema}权限分类类型" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u6743\u9650\u7f16\u53f7\u7c7b\u578b", namespace = "http://www.nju.edu.cn/security/schema", propOrder = {
    "\u7f16\u53f7"
})
public class 权限编号类型 {

    @XmlElement(required = true)
    protected String 编号;
    @XmlAttribute
    protected 权限分类类型 权限类别;

    /**
     * 获取编号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get编号() {
        return 编号;
    }

    /**
     * 设置编号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set编号(String value) {
        this.编号 = value;
    }

    /**
     * 获取权限类别属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 权限分类类型 }
     *     
     */
    public 权限分类类型 get权限类别() {
        return 权限类别;
    }

    /**
     * 设置权限类别属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 权限分类类型 }
     *     
     */
    public void set权限类别(权限分类类型 value) {
        this.权限类别 = value;
    }

}
