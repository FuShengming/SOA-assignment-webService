
package entity.StudentService.GradeService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>部门列表 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="部门列表">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="院系" type="{http://www.nju.edu.cn/schema}院系类型" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="行政部门" type="{http://www.nju.edu.cn/schema}行政部门类型" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u90e8\u95e8\u5217\u8868", namespace = "http://www.nju.edu.cn/schema", propOrder = {
    "\u9662\u7cfbAnd\u884c\u653f\u90e8\u95e8"
})
public class 部门列表 {

    @XmlElements({
        @XmlElement(name = "\u9662\u7cfb", type = 院系类型.class),
        @XmlElement(name = "\u884c\u653f\u90e8\u95e8", type = 行政部门类型.class)
    })
    protected List<Object> 院系And行政部门;

    /**
     * Gets the value of the 院系And行政部门 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the 院系And行政部门 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get院系And行政部门().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link 院系类型 }
     * {@link 行政部门类型 }
     * 
     * 
     */
    public List<Object> get院系And行政部门() {
        if (院系And行政部门 == null) {
            院系And行政部门 = new ArrayList<Object>();
        }
        return this.院系And行政部门;
    }

}
