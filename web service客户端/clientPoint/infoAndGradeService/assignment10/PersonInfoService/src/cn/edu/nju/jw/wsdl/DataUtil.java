package cn.edu.nju.jw.wsdl;

import cn.edu.nju.jw.schema.学生类型;
import cn.edu.nju.schema.个人信息类型;

import java.util.LinkedList;
import java.util.List;

public class DataUtil {

    private static List<学生类型> data = new LinkedList<>();

    // 获取内存中的学生个人信息，如果无则返回null
    public static 学生类型 get(String studentNumber) {
        for (学生类型 student : data) {
            if (student.get学号().equals(studentNumber)) {
                return student;
            }
        }
        return null;
    }

    // 添加学生信息，如果已存在该学生信息，则返回false，否则插入信息并返回true
    public static boolean add(学生类型 studentTarget) {
        for (学生类型 student : data) {
            if (student.get学号().equals(studentTarget.get学号())) {
                return false;
            }
        }
        data.add(studentTarget);
        return true;
    }

    // 修改学生信息，若存在该学生信息，则作修改，返回true，否则返回false
    public static boolean modify(学生类型 studentTarget) {
        for (学生类型 student : data) {
            if (student.get学号().equals(studentTarget.get学号())) {
                student.set个人信息(studentTarget.get个人信息());
                student.set课程成绩列表(studentTarget.get课程成绩列表());
                return true;
            }
        }
        return false;
    }

    // 删除学生信息，若存在该学生信息，则作删除，返回被删除的个人信息，否则返回null
    public static 学生类型 delete(String studentNumber) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).get学号().equals(studentNumber)) {
                学生类型 student = data.remove(i);
                return student;
            }
        }
        return null;
    }
}
