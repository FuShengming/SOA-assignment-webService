package com.example.webService.dao;

import com.example.webService.JpaEntity.StudentInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface StudentInfoRepository extends JpaRepository<StudentInfoEntity,Integer> {
    public StudentInfoEntity findStudentInfoEntityByStudentId(String studentId);
    @Modifying
    @Transactional
    public void deleteStudentInfoEntityByStudentId(String studentId);
}
