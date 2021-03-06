
package entity.LoginService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>开设院系列表类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="开设院系列表类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="开设院系" type="{http://jw.nju.edu.cn/schema}开设院系类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5f00\u8bbe\u9662\u7cfb\u5217\u8868\u7c7b\u578b", propOrder = {
    "\u5f00\u8bbe\u9662\u7cfb"
})
public class 开设院系列表类型 {

    @XmlElement(required = true)
    protected List<开设院系类型> 开设院系;

    /**
     * Gets the value of the 开设院系 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the 开设院系 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get开设院系().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link 开设院系类型 }
     * 
     * 
     */
    public List<开设院系类型> get开设院系() {
        if (开设院系 == null) {
            开设院系 = new ArrayList<开设院系类型>();
        }
        return this.开设院系;
    }

}
