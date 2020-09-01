
package entity.LoginService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>任课教师列表类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="任课教师列表类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="任课教师信息" type="{http://jw.nju.edu.cn/schema}任课教师信息类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u4efb\u8bfe\u6559\u5e08\u5217\u8868\u7c7b\u578b", propOrder = {
    "\u4efb\u8bfe\u6559\u5e08\u4fe1\u606f"
})
public class 任课教师列表类型 {

    @XmlElement(required = true)
    protected List<任课教师信息类型> 任课教师信息;

    /**
     * Gets the value of the 任课教师信息 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the 任课教师信息 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get任课教师信息().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link 任课教师信息类型 }
     * 
     * 
     */
    public List<任课教师信息类型> get任课教师信息() {
        if (任课教师信息 == null) {
            任课教师信息 = new ArrayList<任课教师信息类型>();
        }
        return this.任课教师信息;
    }

}
