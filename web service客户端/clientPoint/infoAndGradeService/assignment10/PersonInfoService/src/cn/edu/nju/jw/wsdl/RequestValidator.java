package cn.edu.nju.jw.wsdl;

import cn.edu.nju.jw.schema.ObjectFactory;
import cn.edu.nju.jw.schema.学生类型;
import cn.edu.nju.jw.schema.课程成绩列表类型;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.ByteArrayOutputStream;
import java.io.File;

public class RequestValidator {

    // 用于生成一些schema的对象以及对象包装
    private ObjectFactory factory = new ObjectFactory();

    // 借用其marshall和schema验证功能，用于验证输入
    private Marshaller courseGradeListMarshaller = null;

    public RequestValidator() throws Exception {
        // 获取JAXB的上下文环境，需要传入具体的 Java bean
        JAXBContext context = JAXBContext.newInstance(学生类型.class);
        // 创建 Marshaller 实例
        courseGradeListMarshaller = context.createMarshaller();
        // 设置转换参数 -> 这里举例是告诉序列化器是否格式化输出
        courseGradeListMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // 设置jaxb的schema验证
        SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
        File schemaLocation = new File("schemas/Student.xsd");
        Schema schema = factory.newSchema(schemaLocation);
        courseGradeListMarshaller.setSchema(schema);
    }

    public String isValid(学生类型 studentInfo) {
        try {
            ByteArrayOutputStream ba = new ByteArrayOutputStream();
            courseGradeListMarshaller.marshal(factory.create学生(studentInfo), ba);
            return null;
        } catch (JAXBException e) {
            return e.toString();
        }
    }

    public String isValid(String studentNumber) {
        return studentNumber.length() == 9 ? null : "invalid param";
    }

}
