
package entity.LoginService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>选课学生列表 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="选课学生列表">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="选课学生信息" type="{http://jw.nju.edu.cn/schema}学生身份"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u9009\u8bfe\u5b66\u751f\u5217\u8868", propOrder = {
    "\u9009\u8bfe\u5b66\u751f\u4fe1\u606f"
})
public class 选课学生列表 {

    protected List<学生身份> 选课学生信息;

    /**
     * Gets the value of the 选课学生信息 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the 选课学生信息 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get选课学生信息().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link 学生身份 }
     * 
     * 
     */
    public List<学生身份> get选课学生信息() {
        if (选课学生信息 == null) {
            选课学生信息 = new ArrayList<学生身份>();
        }
        return this.选课学生信息;
    }

}
