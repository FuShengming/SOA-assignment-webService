
package entity.StudentService.GradeService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>院系类型的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="院系类型">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="软件学院"/>
 *     &lt;enumeration value="商学院"/>
 *     &lt;enumeration value="文学院"/>
 *     &lt;enumeration value="外国语学院"/>
 *     &lt;enumeration value="计算机科学与技术系"/>
 *     &lt;enumeration value="电子学院"/>
 *     &lt;enumeration value="物理学院"/>
 *     &lt;enumeration value="数学院"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "\u9662\u7cfb\u7c7b\u578b", namespace = "http://www.nju.edu.cn/schema")
@XmlEnum
public enum 院系类型 {

    软件学院,
    商学院,
    文学院,
    外国语学院,
    计算机科学与技术系,
    电子学院,
    物理学院,
    数学院;

    public String value() {
        return name();
    }

    public static 院系类型 fromValue(String v) {
        return valueOf(v);
    }

}
