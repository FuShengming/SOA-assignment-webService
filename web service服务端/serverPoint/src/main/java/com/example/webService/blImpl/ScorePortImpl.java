package com.example.webService.blImpl;

import com.example.webService.JpaEntity.ScoreEntity;
import com.example.webService.bl.ScorePort;
import com.example.webService.dao.CourseScoreRepository;
import com.example.webService.entity.*;
import org.apache.cxf.staxutils.StaxUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

@WebService(name = "ScorePort", targetNamespace = "http://jw.nju.edu.cn/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class ScorePortImpl implements ScorePort {
    @PostConstruct
    public void init(){
        System.setProperty(StaxUtils.ALLOW_INSECURE_PARSER, "true");
    }

    @Autowired
    CourseScoreRepository courseScoreRepository;

    @Override
    public CourseScoreList getScoreListById(GetScoreListParamType getScoreListParamType) throws InvalidDataFault, ScoreDoNotExistFault, StudentDoNotExistFault {
        String studentId = getScoreListParamType.getStudentId();
        List<ScoreEntity> courseScores = courseScoreRepository.findScoreEntitiesByStudentId(studentId);

        if(courseScores.size()==0){
            throw new ScoreDoNotExistFault("student "+studentId+" does not has any score",
                    "student "+studentId+" does not has any score");
        }
        else{
            CourseScoreList courseScoreList = entityList2CourseScoreList(courseScores);
            return courseScoreList;
        }



    }

    @Override
    public CourseScoreList addScoreList(AddScoreListParamType addScoreListParamType) throws InvalidDataFault, ScoreExistedFault, StudentDoNotExistFault {
        CourseScoreList courseScoreList = addScoreListParamType.getCourseScoreList();
        List<ScoreEntity> scoreEntities = courseScoreList2EntityList(courseScoreList);
        for(ScoreEntity cur:scoreEntities){
            ScoreEntity existed = courseScoreRepository.findScoreEntityByCourseIdAndScoreCharacterAndStudentId(
                    cur.getCourseId(),cur.getScoreCharacter(),cur.getStudentId()
            );
            if(existed!=null){
                String message = "student "+cur.getStudentId()+" course "+cur.getCourseId()+" "+cur.getScoreCharacter()+" has existed";
                throw new ScoreExistedFault(message,message);
            }
        }
        courseScoreRepository.save(scoreEntities);


        return courseScoreList;
    }

    @Override
    public CourseScoreList deleteScoreListById(DeleteScoreListParamType deleteScoreListParamType) throws InvalidDataFault, ScoreDoNotExistFault, StudentDoNotExistFault {
        String studentId = deleteScoreListParamType.getStudentId();
        List<ScoreEntity> scoreEntities = courseScoreRepository.findScoreEntitiesByStudentId(studentId);
        if(scoreEntities.size()==0){
            String message="student "+studentId+" does not have any score";
            throw new ScoreDoNotExistFault(message,message);
        }
        else{
            courseScoreRepository.deleteScoreEntitiesByStudentId(studentId);
            CourseScoreList res = entityList2CourseScoreList(scoreEntities);
            return res;

        }

    }

    @Override
    public CourseScoreList updateScoreList(UpdateScoreListParamType updateScoreListParamType) throws InvalidDataFault, StudentDoNotExistFault,ScoreDoNotExistFault {
        CourseScoreList courseScoreList = updateScoreListParamType.getCourseScoreList();
        List<ScoreEntity> scoreEntities = courseScoreList2EntityList(courseScoreList);
        for(ScoreEntity cur:scoreEntities){
            ScoreEntity existed = courseScoreRepository.findScoreEntityByCourseIdAndScoreCharacterAndStudentId(
                    cur.getCourseId(),cur.getScoreCharacter(),cur.getStudentId());
            if(existed==null){
                String message = "student "+cur.getStudentId()+" course "+cur.getCourseId()+" "+cur.getScoreCharacter()+" does not exist";
                throw new ScoreDoNotExistFault(message,message);
            }
        }
        courseScoreRepository.save(scoreEntities);
        return courseScoreList;
    }

    private CourseScoreList entityList2CourseScoreList(List<ScoreEntity> scoreEntities){
        CourseScoreList res = new CourseScoreList();
        List<CourseScore> courseScores = new ArrayList<CourseScore>();

        for(ScoreEntity curScoreEntity:scoreEntities){
            boolean existed = false;
            CourseScore existedCourseScore = null;
            for(CourseScore curCourseScore:courseScores){
                if(curScoreEntity.getCourseId().equals(curCourseScore.getCourseId())
                &&curScoreEntity.getScoreCharacter().equals(curCourseScore.getScoreCharacter().toString())){
                    existed = true;
                    existedCourseScore = curCourseScore;
                    break;
                }
            }
            if(existed){

                Score score = new Score();
                score.setStudentId(curScoreEntity.getStudentId());
                score.setValue(curScoreEntity.getScoreValue());
                existedCourseScore.addScore(score);
            }
            else{
                CourseScore newCourseScore = new CourseScore();
                courseScores.add(newCourseScore);
                List<Score> scores = new ArrayList<Score>();
                newCourseScore.setCourseId(curScoreEntity.getCourseId());
                newCourseScore.setScoreCharacter(ScoreCharacter.fromValue(curScoreEntity.getScoreCharacter()));
                Score score = new Score();
                score.setStudentId(curScoreEntity.getStudentId());
                score.setValue(curScoreEntity.getScoreValue());
                scores.add(score);
                newCourseScore.setScores(scores);
            }
        }
        res.setCourseScore(courseScores);
        return res;
    }

    private List<ScoreEntity> courseScoreList2EntityList(CourseScoreList courseScoreList){
        List<ScoreEntity> res = new ArrayList<ScoreEntity>();
        List<CourseScore> courseScores = courseScoreList.getCourseScore();
        for(CourseScore curCourseScore:courseScores){
            List<Score> scores = curCourseScore.getScores();
            for(Score curScore:scores){
                ScoreEntity entity = new ScoreEntity();
                entity.setCourseId(curCourseScore.getCourseId());
                entity.setScoreCharacter(curCourseScore.getScoreCharacter().toString());
                entity.setScoreValue(curScore.getValue());
                entity.setStudentId(curScore.getStudentId());
                res.add(entity);
            }
        }
        return res;
    }
}
