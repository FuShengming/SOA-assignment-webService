
package entity.LoginService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>开设院系类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="开设院系类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="院系编号" type="{http://www.nju.edu.cn/schema}部门编号类型"/>
 *         &lt;element name="院系名称" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5f00\u8bbe\u9662\u7cfb\u7c7b\u578b", propOrder = {
    "\u9662\u7cfb\u7f16\u53f7",
    "\u9662\u7cfb\u540d\u79f0"
})
public class 开设院系类型 {

    @XmlElement(required = true, defaultValue = "000000")
    protected String 院系编号;
    @XmlElement(required = true, defaultValue = "\u65e0")
    protected String 院系名称;

    /**
     * 获取院系编号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get院系编号() {
        return 院系编号;
    }

    /**
     * 设置院系编号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set院系编号(String value) {
        this.院系编号 = value;
    }

    /**
     * 获取院系名称属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get院系名称() {
        return 院系名称;
    }

    /**
     * 设置院系名称属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set院系名称(String value) {
        this.院系名称 = value;
    }

}
