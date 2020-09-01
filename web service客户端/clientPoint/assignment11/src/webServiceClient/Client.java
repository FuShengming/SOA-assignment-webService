package webServiceClient;

import entity.StudentService.GradeService.*;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.util.List;

public class Client {
    public static void main(String[] args) throws MalformedURLException {
        InfoService infoService = new InfoService();
//-------------------查找不存在的学生信息，返回错误----------------------------------------------------------------
        System.out.println("查找不存在的学生信息，返回错误：");
        infoService.searchStudentInfo("171250640");

//---------------新增学生信息（初始成绩列表为空,个人信息填写姓名性别和电话）------------------
        System.out.println("新增学生信息（初始成绩列表为空,个人信息填写姓名性别和电话）:");
        学生类型 student = new 学生类型();
        student.set学号("171250640");
        课程成绩列表类型 scoreList = new 课程成绩列表类型();
        个人信息类型 info = new 个人信息类型();
        info.set姓名("付圣铭");
        info.set性别(性别类型.男);
        info.set电话(new BigInteger("12345678901"));
        student.set课程成绩列表(scoreList);
        student.set个人信息(info);
        //-----打印添加的学生信息-------------
        printStudent(infoService.addStudentInfo(student));
//-------------------查找学生信息----------------------------------------------------------------
        System.out.println("查找学生信息:");
        printStudent(infoService.searchStudentInfo("171250640"));
//-------------------删除学生信息--------------------------------------------------------
        System.out.println("删除学生信息:");
        printStudent(infoService.deleteStudentInfo("171250640"));
//-------------------查找已删除的学生信息，返回错误--------------------------------------------------------
        System.out.println("查找已删除的学生信息，返回错误");
        infoService.searchStudentInfo("171250640");
//-------------------更新不存在的学生信息，返回错误----------------------------------------------------------------
        System.out.println("更新不存在的学生信息，返回错误:");
        infoService.modifyStudentInfo(student);
//-------------------重新添加学生信息----------------------------------------------------------------
        System.out.println("重新添加学生信息:");
        printStudent(infoService.addStudentInfo(student));
//-------------------重复添加学生信息，返回学生已存在错误----------------------------------------------------------------
        System.out.println("重复添加学生信息，返回学生已存在错误:");
        infoService.addStudentInfo(student);


        ScoreService scoreService = new ScoreService();
//-------------------以学生账号查询空的成绩列表并打印----------------------------------------------------------------
        System.out.println("以学生账号查询空的成绩列表并打印:");
        printScoreList(scoreService.searchScore("171250640","171250640@smail.nju.edu.cn","171250640"),"");
//-------------------以学生账号更新不存在的成绩列表，打印没有权限操作----------------------------------------------------------------
        System.out.println("以学生账号更新不存在的成绩列表，打印没有权限操作:");
        scoreService.updateScore(scoreList,"171250640@smail.nju.edu.cn","171250640");
        System.out.println();
//-------------------以学生账号删除不存在的成绩列表，打印没有权限操作----------------------------------------------------------------
        System.out.println("以学生账号删除不存在的成绩列表，打印没有权限操作:");
        scoreService.deleteScore(scoreList,"171250640@smail.nju.edu.cn","171250640");
        System.out.println();

//-------------------新建成绩列表----------------------------------------------------------------
        课程成绩列表类型 scoreList2 = new 课程成绩列表类型();
        List<课程成绩类型> scores = scoreList2.get课程成绩();
        课程成绩类型 score = new 课程成绩类型();
        score.set成绩性质(成绩性质类型.平时成绩);
        score.set课程编号("123456");
        List<成绩类型> scoreValues = score.get成绩();
        成绩类型 value = new 成绩类型();
        value.set学号("171250640");
        value.set得分(90);
        scoreValues.add(value);
        scores.add(score);
//-------------------以学生账号新增成绩列表，打印没有权限操作----------------------------------------------------------------
        System.out.println("以学生账号新增成绩列表，打印没有权限操作:");
        scoreService.addScore(scoreList2,"171250640@smail.nju.edu.cn","171250640");
        System.out.println();
//-------------------以教师账号新增成绩列表并打印成绩列表与更新后的个人信息----------------------------------------------------------------
        System.out.println("以教师账号新增成绩列表并打印成绩列表与更新后的个人信息:");
        printScoreList(scoreService.addScore(scoreList2,"123456@nju.edu.cn","123456"),"");
        System.out.println("\n更新了成绩列表后的个人信息：");
        printStudent(infoService.searchStudentInfo("171250640"));
//-------------------以学生账号查询成绩列表并打印----------------------------------------------------------------
        System.out.println("以学生账号查询成绩列表并打印:");
        printScoreList(scoreService.searchScore("171250640","171250640@smail.nju.edu.cn","171250640"),"");
        System.out.println();
//-------------------以教师账号修改成绩列表并打印----------------------------------------------------------------
        System.out.println("以教师账号修改成绩列表并打印:");
        value.set得分(60);
        printScoreList(scoreService.updateScore(scoreList2,"123456@nju.edu.cn","123456"),"");
        System.out.println("");
//-------------------以教师账号删除成绩列表并打印成绩列表与更新后的个人信息----------------------------------------------------------------
        System.out.println("以教师账号删除成绩列表并打印:");
        printScoreList(scoreService.deleteScore(scoreList2,"123456@nju.edu.cn","123456"),"");
        System.out.println("\n删除了成绩列表后的个人信息：");
        printStudent(infoService.searchStudentInfo("171250640"));

    }



    public static void printPersonalInfo(个人信息类型 info,String prefix){
        System.out.println(prefix+"姓名："+info.get姓名());
        System.out.println(prefix+"姓别："+info.get性别().toString());
        System.out.println(prefix+"电话："+info.get电话().toString());
    }
    public static void  printScore(成绩类型 score,String prefix){
        System.out.println(prefix+"学号："+score.get学号());
        System.out.println(prefix+"得分："+score.get得分());

    }
    public static void printScoreList(课程成绩列表类型 scoreList,String prefix){
        List<课程成绩类型> courseScores = scoreList.get课程成绩();
        for(课程成绩类型 cur : courseScores){
            System.out.println(prefix+"课程编号："+cur.get课程编号());
            System.out.println(prefix+"成绩性质："+cur.get课程编号());
            List<成绩类型> scores = cur.get成绩();
            for(成绩类型 score : scores){
                System.out.print(prefix);
                printScore(score,prefix);
            }
        }
    }
    public static void printStudent(学生类型 student){
        System.out.println("学生信息：");
        System.out.println("学号："+student.get学号());
        System.out.println("个人信息：");
        printPersonalInfo(student.get个人信息(),"\t");
        System.out.println("成绩列表：");
        printScoreList(student.get课程成绩列表(),"\t");
        System.out.println();
    }
}
