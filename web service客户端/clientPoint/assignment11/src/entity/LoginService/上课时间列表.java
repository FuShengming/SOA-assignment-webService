
package entity.LoginService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>上课时间列表 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="上课时间列表">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="上课时间" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u4e0a\u8bfe\u65f6\u95f4\u5217\u8868", propOrder = {
    "\u4e0a\u8bfe\u65f6\u95f4"
})
public class 上课时间列表 {

    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> 上课时间;

    /**
     * Gets the value of the 上课时间 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the 上课时间 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get上课时间().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> get上课时间() {
        if (上课时间 == null) {
            上课时间 = new ArrayList<XMLGregorianCalendar>();
        }
        return this.上课时间;
    }

}
