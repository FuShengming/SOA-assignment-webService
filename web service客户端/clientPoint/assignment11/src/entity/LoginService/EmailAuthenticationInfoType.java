
package entity.LoginService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailAuthenticationInfoType", namespace = "http://www.nju.edu.cn/schema", propOrder = {
    "email",
    "pwd"
})
public class EmailAuthenticationInfoType {

    @XmlElement(required = true,name = "邮箱")
    protected String email;
    @XmlElement(required = true,name = "密码")
    protected String pwd;


    public String getEmail() {
        return email;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String value) {
        this.pwd = value;
    }

}
