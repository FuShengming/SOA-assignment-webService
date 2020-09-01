
package entity.LoginService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "EmailIdentity", namespace = "http://www.nju.edu.cn/schema")
@XmlEnum
public enum EmailIdentity {

    老师,
    本科生,
    研究生;

    public String value() {
        return name();
    }

    public static EmailIdentity fromValue(String v) {
        return valueOf(v);
    }

}
