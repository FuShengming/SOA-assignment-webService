//package com.example.webService.JpaEntity;
//
//import com.example.webService.entity.Student;
//
//import javax.persistence.*;
//import javax.xml.datatype.XMLGregorianCalendar;
//import java.util.Date;
//import java.util.GregorianCalendar;
//
//@Entity
//@Table(name = "student_info")
//public class StudentInfoEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    int id;
//    @Column(name = "student_id")
//    String studentId;
//    @Column(name = "name")
//    String name;
//    @Column(name = "birthday")
//    Date birthday;
//
//    @Column(name = "gender")
//    String gender;
//
//    @Column(name = "phone")
//    String phone;
//    @Column(name = "email")
//    String email;
//    @Column(name = "apartment_id")
//    String apartmentId;
//    @Column(name = "apartment_name")
//    String apartmentName;
//    @Column(name = "address")
//    String address;
//    @Column(name = "grade")
//    String grade;
//    @Column(name = "student_status")
//    String studentStatus;
//    @Column(name = "political_status")
//    String politicalStatus;
//
//    public StudentInfoEntity() {
//    }
//
//    public StudentInfoEntity(Student student){
//        this.studentId = student.getId();
//        this.name = student.getName();
//        this.gender=student.getGender().toString();
//        this.phone = student.getPhone();
//        this.email = student.getEmail();
//        this.birthday = convertToDate(student.getBirthday());
//        this.apartmentId = student.getApartment().getApartmentId();
//        this.apartmentName = student.getApartment().getApartmentName();
//        this.grade = student.getGrade();
//        this.politicalStatus = student.getPoliticalStatus().toString();
//        this.studentStatus = student.getStudentStatus().toString();
//        this.address = student.getAddress();
//    }
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public  Date convertToDate(XMLGregorianCalendar cal){
//        GregorianCalendar ca = null;
//        if(cal!=null && cal.toGregorianCalendar()!=null){
//            ca = cal.toGregorianCalendar();
//            return ca.getTime();
//        }
//        return null;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getStudentId() {
//        return studentId;
//    }
//
//    public void setStudentId(String studentId) {
//        this.studentId = studentId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Date getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(Date birthday) {
//        this.birthday = birthday;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getApartmentId() {
//        return apartmentId;
//    }
//
//    public void setApartmentId(String apartmentId) {
//        this.apartmentId = apartmentId;
//    }
//
//    public String getApartmentName() {
//        return apartmentName;
//    }
//
//    public void setApartmentName(String apartmentName) {
//        this.apartmentName = apartmentName;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getGrade() {
//        return grade;
//    }
//
//    public void setGrade(String grade) {
//        this.grade = grade;
//    }
//
//    public String getStudentStatus() {
//        return studentStatus;
//    }
//
//    public void setStudentStatus(String studentStatus) {
//        this.studentStatus = studentStatus;
//    }
//
//    public String getPoliticalStatus() {
//        return politicalStatus;
//    }
//
//    public void setPoliticalStatus(String politicalStatus) {
//        this.politicalStatus = politicalStatus;
//    }
//}
