
package com.example.webService.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>学籍性质类型的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="学籍性质类型">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="本科"/>
 *     &lt;enumeration value="研究生"/>
 *     &lt;enumeration value="博士生"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "学籍性质类型")
@XmlEnum
public enum StudentStatus {

    本科,
    研究生,
    博士生;

    public String value() {
        return name();
    }

    public static StudentStatus fromValue(String v) {
        return valueOf(v);
    }

}
