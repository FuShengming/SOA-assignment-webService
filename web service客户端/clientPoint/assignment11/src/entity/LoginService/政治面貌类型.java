
package entity.LoginService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>政治面貌类型的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="政治面貌类型">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="中共党员"/>
 *     &lt;enumeration value="中共预备党员"/>
 *     &lt;enumeration value="共青团员"/>
 *     &lt;enumeration value="民革党员"/>
 *     &lt;enumeration value="民盟盟员"/>
 *     &lt;enumeration value="民建会员"/>
 *     &lt;enumeration value="民进会员"/>
 *     &lt;enumeration value="农工党党员"/>
 *     &lt;enumeration value="致公党党员"/>
 *     &lt;enumeration value="九三学社社员"/>
 *     &lt;enumeration value="台盟盟员"/>
 *     &lt;enumeration value="无党派人士"/>
 *     &lt;enumeration value="群众"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "\u653f\u6cbb\u9762\u8c8c\u7c7b\u578b", namespace = "http://www.nju.edu.cn/schema")
@XmlEnum
public enum 政治面貌类型 {

    中共党员,
    中共预备党员,
    共青团员,
    民革党员,
    民盟盟员,
    民建会员,
    民进会员,
    农工党党员,
    致公党党员,
    九三学社社员,
    台盟盟员,
    无党派人士,
    群众;

    public String value() {
        return name();
    }

    public static 政治面貌类型 fromValue(String v) {
        return valueOf(v);
    }

}
