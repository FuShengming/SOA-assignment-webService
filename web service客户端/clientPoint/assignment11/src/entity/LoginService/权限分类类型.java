
package entity.LoginService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>权限分类类型的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="权限分类类型">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="门禁编号"/>
 *     &lt;enumeration value="书籍编号"/>
 *     &lt;enumeration value="院系编号"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "\u6743\u9650\u5206\u7c7b\u7c7b\u578b", namespace = "http://www.nju.edu.cn/security/schema")
@XmlEnum
public enum 权限分类类型 {

    门禁编号,
    书籍编号,
    院系编号;

    public String value() {
        return name();
    }

    public static 权限分类类型 fromValue(String v) {
        return valueOf(v);
    }

}
