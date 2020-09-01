
package cn.edu.nju.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>行政部门类型的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="行政部门类型">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="教务处"/>
 *     &lt;enumeration value="学工处"/>
 *     &lt;enumeration value="团委"/>
 *     &lt;enumeration value="党委"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "\u884c\u653f\u90e8\u95e8\u7c7b\u578b")
@XmlEnum
public enum 行政部门类型 {

    教务处,
    学工处,
    团委,
    党委;

    public String value() {
        return name();
    }

    public static 行政部门类型 fromValue(String v) {
        return valueOf(v);
    }

}
