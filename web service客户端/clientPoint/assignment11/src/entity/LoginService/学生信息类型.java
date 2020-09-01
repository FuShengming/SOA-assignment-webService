
package entity.LoginService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>学生信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="学生信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="学号" type="{http://jw.nju.edu.cn/schema}学号类型"/>
 *         &lt;element name="学生姓名" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="学生性别" type="{http://www.nju.edu.cn/schema}性别类型"/>
 *         &lt;element name="出生日期" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="联系电话" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="联系邮箱" type="{http://www.nju.edu.cn/schema}联系邮箱类型"/>
 *         &lt;element name="所属院系" type="{http://www.nju.edu.cn/schema}所属部门类型"/>
 *         &lt;element name="家庭住址" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="课程成绩列表" type="{http://jw.nju.edu.cn/schema}课程成绩列表类型"/>
 *         &lt;element name="入学年级" type="{http://jw.nju.edu.cn/schema}入学年级类型"/>
 *         &lt;element name="学籍性质" type="{http://jw.nju.edu.cn/schema}学籍性质类型"/>
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
@XmlType(name = "\u5b66\u751f\u4fe1\u606f\u7c7b\u578b", propOrder = {
    "\u5b66\u53f7",
    "\u5b66\u751f\u59d3\u540d",
    "\u5b66\u751f\u6027\u522b",
    "\u51fa\u751f\u65e5\u671f",
    "\u8054\u7cfb\u7535\u8bdd",
    "\u8054\u7cfb\u90ae\u7bb1",
    "\u6240\u5c5e\u9662\u7cfb",
    "\u5bb6\u5ead\u4f4f\u5740",
    "\u8bfe\u7a0b\u6210\u7ee9\u5217\u8868",
    "\u5165\u5b66\u5e74\u7ea7",
    "\u5b66\u7c4d\u6027\u8d28",
    "\u653f\u6cbb\u9762\u8c8c"
})
public class 学生信息类型 {

    @XmlElement(required = true)
    protected String 学号;
    @XmlElement(required = true)
    protected String 学生姓名;
    @XmlElement(required = true)
    protected 性别类型 学生性别;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar 出生日期;
    @XmlElement(required = true, defaultValue = "\u65e0")
    protected String 联系电话;
    @XmlElement(required = true)
    protected String 联系邮箱;
    @XmlElement(required = true)
    protected 所属部门类型 所属院系;
    @XmlElement(required = true, defaultValue = "\u65e0")
    protected String 家庭住址;
    @XmlElement(required = true)
    protected 课程成绩列表类型 课程成绩列表;
    @XmlElement(required = true)
    protected String 入学年级;
    @XmlElement(required = true)
    protected 学籍性质类型 学籍性质;
    @XmlElement(required = true)
    protected 政治面貌类型 政治面貌;

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
     * 获取学生姓名属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get学生姓名() {
        return 学生姓名;
    }

    /**
     * 设置学生姓名属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set学生姓名(String value) {
        this.学生姓名 = value;
    }

    /**
     * 获取学生性别属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 性别类型 }
     *     
     */
    public 性别类型 get学生性别() {
        return 学生性别;
    }

    /**
     * 设置学生性别属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 性别类型 }
     *     
     */
    public void set学生性别(性别类型 value) {
        this.学生性别 = value;
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
     * 获取所属院系属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 所属部门类型 }
     *     
     */
    public 所属部门类型 get所属院系() {
        return 所属院系;
    }

    /**
     * 设置所属院系属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 所属部门类型 }
     *     
     */
    public void set所属院系(所属部门类型 value) {
        this.所属院系 = value;
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
     * 获取课程成绩列表属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 课程成绩列表类型 }
     *     
     */
    public 课程成绩列表类型 get课程成绩列表() {
        return 课程成绩列表;
    }

    /**
     * 设置课程成绩列表属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 课程成绩列表类型 }
     *     
     */
    public void set课程成绩列表(课程成绩列表类型 value) {
        this.课程成绩列表 = value;
    }

    /**
     * 获取入学年级属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get入学年级() {
        return 入学年级;
    }

    /**
     * 设置入学年级属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set入学年级(String value) {
        this.入学年级 = value;
    }

    /**
     * 获取学籍性质属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 学籍性质类型 }
     *     
     */
    public 学籍性质类型 get学籍性质() {
        return 学籍性质;
    }

    /**
     * 设置学籍性质属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 学籍性质类型 }
     *     
     */
    public void set学籍性质(学籍性质类型 value) {
        this.学籍性质 = value;
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
