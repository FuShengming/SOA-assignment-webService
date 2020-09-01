
package com.example.webService.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailAuthenticationResultType", namespace = "http://www.nju.edu.cn/schema", propOrder = {
    "email",
    "emailIdentity"
})
public class EmailAuthenticationResultType {

    @XmlElement(required = true,name = "邮箱")
    protected String email;
    @XmlElement(required = true,name="身份")
    protected EmailIdentity emailIdentity;

    public String getEmail() {
        return email;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    public EmailIdentity getEmailIdentity() {
        return emailIdentity;
    }

    public void setEmailIdentity(EmailIdentity value) {
        this.emailIdentity = value;
    }

}
