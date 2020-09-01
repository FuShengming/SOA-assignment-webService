//package com.example.webService.dao;
//
//import com.example.webService.JpaEntity.ScoreEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Repository
//public interface CourseScoreRepository extends JpaRepository<ScoreEntity,Integer> {
//    List<ScoreEntity> findScoreEntitiesByStudentId(String studentId);
//    ScoreEntity findScoreEntityByCourseIdAndScoreCharacterAndStudentId(String courseId,String scoreCharacter,String studentId);
//    @Modifying
//    @Transactional
//    public void deleteScoreEntitiesByStudentId(String studentId);
//}
