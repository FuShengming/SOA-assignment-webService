
package entity.LoginService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>个人信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="个人信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="姓名" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="性别" type="{http://www.nju.edu.cn/schema}性别类型"/>
 *         &lt;element name="民族" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="出生日期" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="国籍" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="身份标识" type="{http://www.nju.edu.cn/schema}身份标识类型"/>
 *         &lt;element name="联系电话" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="联系邮箱" type="{http://www.nju.edu.cn/schema}联系邮箱类型"/>
 *         &lt;element name="所属部门列表" type="{http://www.nju.edu.cn/schema}所属部门列表类型"/>
 *         &lt;element name="家庭住址" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="政治面貌" type="{http://www.nju.edu.cn/schema}政治面貌类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u4e2a\u4eba\u4fe1\u606f\u7c7b\u578b", namespace = "http://www.nju.edu.cn/schema", propOrder = {
    "\u59d3\u540d",
    "\u6027\u522b",
    "\u6c11\u65cf",
    "\u51fa\u751f\u65e5\u671f",
    "\u56fd\u7c4d",
    "\u8eab\u4efd\u6807\u8bc6",
    "\u8054\u7cfb\u7535\u8bdd",
    "\u8054\u7cfb\u90ae\u7bb1",
    "\u6240\u5c5e\u90e8\u95e8\u5217\u8868",
    "\u5bb6\u5ead\u4f4f\u5740",
    "\u653f\u6cbb\u9762\u8c8c"
})
public class 个人信息类型 {

    @XmlElement(required = true)
    protected String 姓名;
    @XmlElement(required = true)
    protected 性别类型 性别;
    @XmlElement(required = true)
    protected String 民族;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar 出生日期;
    @XmlElement(required = true)
    protected String 国籍;
    @XmlElement(required = true)
    protected 身份标识类型 身份标识;
    @XmlElement(required = true)
    protected String 联系电话;
    @XmlElement(required = true)
    protected String 联系邮箱;
    @XmlElement(required = true)
    protected 所属部门列表类型 所属部门列表;
    @XmlElement(required = true, defaultValue = "")
    protected String 家庭住址;
    @XmlElement(required = true)
    protected 政治面貌类型 政治面貌;

    /**
     * 获取姓名属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get姓名() {
        return 姓名;
    }

    /**
     * 设置姓名属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set姓名(String value) {
        this.姓名 = value;
    }

    /**
     * 获取性别属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 性别类型 }
     *     
     */
    public 性别类型 get性别() {
        return 性别;
    }

    /**
     * 设置性别属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 性别类型 }
     *     
     */
    public void set性别(性别类型 value) {
        this.性别 = value;
    }

    /**
     * 获取民族属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get民族() {
        return 民族;
    }

    /**
     * 设置民族属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set民族(String value) {
        this.民族 = value;
    }

    /**
     * 获取出生日期属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar get出生日期() {
        return 出生日期;
    }

    /**
     * 设置出生日期属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void set出生日期(XMLGregorianCalendar value) {
        this.出生日期 = value;
    }

    /**
     * 获取国籍属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get国籍() {
        return 国籍;
    }

    /**
     * 设置国籍属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set国籍(String value) {
        this.国籍 = value;
    }

    /**
     * 获取身份标识属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 身份标识类型 }
     *     
     */
    public 身份标识类型 get身份标识() {
        return 身份标识;
    }

    /**
     * 设置身份标识属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 身份标识类型 }
     *     
     */
    public void set身份标识(身份标识类型 value) {
        this.身份标识 = value;
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

    /**
     * 获取所属部门列表属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 所属部门列表类型 }
     *     
     */
    public 所属部门列表类型 get所属部门列表() {
        return 所属部门列表;
    }

    /**
     * 设置所属部门列表属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 所属部门列表类型 }
     *     
     */
    public void set所属部门列表(所属部门列表类型 value) {
        this.所属部门列表 = value;
    }

    /**
     * 获取家庭住址属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get家庭住址() {
        return 家庭住址;
    }

    /**
     * 设置家庭住址属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set家庭住址(String value) {
        this.家庭住址 = value;
    }

    /**
     * 获取政治面貌属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 政治面貌类型 }
     *     
     */
    public 政治面貌类型 get政治面貌() {
        return 政治面貌;
    }

    /**
     * 设置政治面貌属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 政治面貌类型 }
     *     
     */
    public void set政治面貌(政治面貌类型 value) {
        this.政治面貌 = value;
    }

}
