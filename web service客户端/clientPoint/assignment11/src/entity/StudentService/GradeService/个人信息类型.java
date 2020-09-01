
package entity.StudentService.GradeService;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>个人信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="个人信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="单位" type="{http://www.nju.edu.cn/schema}部门列表" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="姓名" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="年龄" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="性别" type="{http://www.nju.edu.cn/schema}性别类型" />
 *       &lt;attribute name="电话" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u4e2a\u4eba\u4fe1\u606f\u7c7b\u578b", namespace = "http://www.nju.edu.cn/schema", propOrder = {

})
public class 个人信息类型 {

    protected 部门列表 单位;
    @XmlAttribute
    protected String 姓名;
    @XmlAttribute
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger 年龄;
    @XmlAttribute
    protected 性别类型 性别;
    @XmlAttribute
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger 电话;

    /**
     * 获取单位属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 部门列表 }
     *     
     */
    public 部门列表 get单位() {
        return 单位;
    }

    /**
     * 设置单位属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 部门列表 }
     *     
     */
    public void set单位(部门列表 value) {
        this.单位 = value;
    }

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
     * 获取年龄属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger get年龄() {
        return 年龄;
    }

    /**
     * 设置年龄属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void set年龄(BigInteger value) {
        this.年龄 = value;
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
     * 获取电话属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger get电话() {
        return 电话;
    }

    /**
     * 设置电话属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void set电话(BigInteger value) {
        this.电话 = value;
    }

}
