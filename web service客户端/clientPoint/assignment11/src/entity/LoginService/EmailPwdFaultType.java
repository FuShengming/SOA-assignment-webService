
package entity.LoginService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EmailPwdFaultType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EmailPwdFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="email" type="{http://www.nju.edu.cn/schema}联系邮箱类型"/>
 *         &lt;element name="fault" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailPwdFaultType", namespace = "http://jw.nju.edu.cn/wsdl/fault", propOrder = {
    "email",
    "fault"
})
public class EmailPwdFaultType {

    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true, defaultValue = "密码错误")
    protected Object fault;


    public String getEmail() {
        return email;
    }


    public void setEmail(String value) {
        this.email = value;
    }

    public Object getFault() {
        return fault;
    }

    public void setFault(Object value) {
        this.fault = value;
    }

}
