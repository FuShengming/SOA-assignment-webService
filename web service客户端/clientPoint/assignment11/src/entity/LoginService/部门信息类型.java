
package entity.LoginService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>部门信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="部门信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="部门编号" type="{http://www.nju.edu.cn/schema}部门编号类型"/>
 *         &lt;element name="部门名称" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="联系电话" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="办公地点" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="联系邮箱" type="{http://www.nju.edu.cn/schema}联系邮箱类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u90e8\u95e8\u4fe1\u606f\u7c7b\u578b", namespace = "http://www.nju.edu.cn/schema", propOrder = {
    "\u90e8\u95e8\u7f16\u53f7",
    "\u90e8\u95e8\u540d\u79f0",
    "\u8054\u7cfb\u7535\u8bdd",
    "\u529e\u516c\u5730\u70b9",
    "\u8054\u7cfb\u90ae\u7bb1"
})
public class 部门信息类型 {

    @XmlElement(required = true)
    protected String 部门编号;
    @XmlElement(required = true)
    protected String 部门名称;
    @XmlElement(required = true, defaultValue = "\u65e0")
    protected String 联系电话;
    @XmlElement(required = true, defaultValue = "\u65e0")
    protected String 办公地点;
    @XmlElement(required = true)
    protected String 联系邮箱;

    /**
     * 获取部门编号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get部门编号() {
        return 部门编号;
    }

    /**
     * 设置部门编号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set部门编号(String value) {
        this.部门编号 = value;
    }

    /**
     * 获取部门名称属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get部门名称() {
        return 部门名称;
    }

    /**
     * 设置部门名称属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set部门名称(String value) {
        this.部门名称 = value;
    }

    /**
     * 获取联系电话属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get联系电话() {
        return 联系电话;
    }

    /**
     * 设置联系电话属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set联系电话(String value) {
        this.联系电话 = value;
    }

    /**
     * 获取办公地点属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get办公地点() {
        return 办公地点;
    }

    /**
     * 设置办公地点属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set办公地点(String value) {
        this.办公地点 = value;
    }

    /**
     * 获取联系邮箱属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get联系邮箱() {
        return 联系邮箱;
    }

    /**
     * 设置联系邮箱属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set联系邮箱(String value) {
        this.联系邮箱 = value;
    }

}
