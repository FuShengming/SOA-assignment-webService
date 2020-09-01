package com.example.webService.blImpl;

import com.example.webService.JpaEntity.StudentInfoEntity;

import com.example.webService.dao.StudentInfoRepository;
import com.example.webService.entity.*;
import org.apache.cxf.staxutils.StaxUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.webService.bl.*;
import javax.annotation.PostConstruct;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Component
@WebService(name = "StudentInfoPort", targetNamespace = "http://jw.nju.edu.cn/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class StudentInfoPortImpl implements StudentInfoPort {
    @Autowired
    StudentInfoRepository studentInfoRepository;

    @PostConstruct

    public void init(){
        System.setProperty(StaxUtils.ALLOW_INSECURE_PARSER, "true");
    }

    @Override
    public Student addStudentInfo(AddStudentInfoParamType addStudentInfoParamType) throws InvalidDataFault, StudentExistedFault {
        Student studentInfo = addStudentInfoParamType.getStudent();

        StudentInfoEntity existed = studentInfoRepository.findStudentInfoEntityByStudentId(studentInfo.getId());
        if(existed!=null){
            throw new StudentExistedFault("student existed",new StudentExistedFaultType());
        }
        else{
            StudentInfoEntity entity = new StudentInfoEntity(studentInfo);

            studentInfoRepository.save(entity);

        }

        return studentInfo;
    }

    @Override
    public Student deleteStudentInfoById(DeleteStudentInfoParamType deleteStudentInfoParamType) throws InvalidDataFault, StudentDoNotExistFault {
        String studentId = deleteStudentInfoParamType.getStudentId();
        StudentInfoEntity existed = studentInfoRepository.findStudentInfoEntityByStudentId(studentId);
        if(existed==null){
            throw new StudentDoNotExistFault("student do not exist",new StudentDoNotExistFaultType());
        }
        else{
            studentInfoRepository.deleteStudentInfoEntityByStudentId(studentId);
            return entity2Student(existed);
        }

    }

    @Override
    public Student getStudentInfoById(GetStudentInfoParamType getStudentInfoParamType) throws InvalidDataFault, StudentDoNotExistFault {
        String studentId = getStudentInfoParamType.getStudentId();
        StudentInfoEntity existed = studentInfoRepository.findStudentInfoEntityByStudentId(studentId);
        if(existed==null){
            throw new StudentDoNotExistFault("student do not exist",new StudentDoNotExistFaultType());
        }
        else{
            return entity2Student(existed);
        }

    }

    @Override
    public Student updateStudentInfo(UpdateStudentInfoParamType updateStudentInfoParamType) throws InvalidDataFault, StudentDoNotExistFault {
        //System.out.println("up-----------------------------------------");
        Student studentInfo = updateStudentInfoParamType.getStudent();

        StudentInfoEntity existed = studentInfoRepository.findStudentInfoEntityByStudentId(studentInfo.getId());
        System.out.println(existed==null);
        if(existed==null){
            throw new StudentDoNotExistFault("student do not exist",new StudentDoNotExistFaultType());
        }
        else{

            existed = student2Entity(studentInfo,existed);
            studentInfoRepository.save(existed);
            return entity2Student(existed);
        }
    }

    public Student entity2Student(StudentInfoEntity entity){
        Student res = new Student();
        res.setId(entity.getStudentId());
        res.setAddress(entity.getAddress());
        Apartment apartment = new Apartment();
        apartment.setApartmentId(entity.getApartmentId());
        apartment.setApartmentName(entity.getApartmentName());
        res.setApartment(apartment);
        Date date = entity.getBirthday();
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        XMLGregorianCalendar gc = null;
        try {
            gc = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
            gc.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
        } catch (Exception e) {

            e.printStackTrace();
        }
        res.setBirthday(gc);

        //-----------------------------------
        res.setCourseScoreList(new CourseScoreList());
        //-----------------------------------

        res.setEmail(entity.getEmail());
        res.setGender(Gender.fromValue(entity.getGender()));
        res.setGrade(entity.getGrade());
        res.setName(entity.getName());
        res.setPhone(entity.getPhone());
        res.setPoliticalStatus(PoliticalStatus.fromValue(entity.getPoliticalStatus()));
        res.setStudentStatus(StudentStatus.fromValue(entity.getStudentStatus()));
        return res;
    }

    public StudentInfoEntity student2Entity(Student student,StudentInfoEntity entity){
        entity.setName(student.getName());
        entity.setGender(student.getGender().toString());
        entity.setPhone(student.getPhone());
        entity.setEmail(student.getEmail());
        entity.setBirthday(convertToDate(student.getBirthday()));
        entity.setApartmentId(student.getApartment().getApartmentId());
        entity.setApartmentName (student.getApartment().getApartmentName());
        entity.setGrade(student.getGrade());
        entity.setPoliticalStatus(student.getPoliticalStatus().toString());
        entity.setStudentStatus (student.getStudentStatus().toString());
        entity.setAddress(student.getAddress());
        return entity;
    }

    public  Date convertToDate(XMLGregorianCalendar cal){
        GregorianCalendar ca = null;
        if(cal!=null && cal.toGregorianCalendar()!=null){
            ca = cal.toGregorianCalendar();
            return ca.getTime();
        }
        return null;
    }
}
