
package entity.LoginService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>课程性质类型的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="课程性质类型">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="通识"/>
 *     &lt;enumeration value="平台"/>
 *     &lt;enumeration value="核心"/>
 *     &lt;enumeration value="选修"/>
 *     &lt;enumeration value="导学"/>
 *     &lt;enumeration value="研讨"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "\u8bfe\u7a0b\u6027\u8d28\u7c7b\u578b")
@XmlEnum
public enum 课程性质类型 {

    通识,
    平台,
    核心,
    选修,
    导学,
    研讨;

    public String value() {
        return name();
    }

    public static 课程性质类型 fromValue(String v) {
        return valueOf(v);
    }

}
