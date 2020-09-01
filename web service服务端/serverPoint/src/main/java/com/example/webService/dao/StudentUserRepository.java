package com.example.webService.dao;

import com.example.webService.JpaEntity.StudentUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentUserRepository extends JpaRepository<StudentUserEntity,Integer> {
    public StudentUserEntity findStudentUserEntitiesByStudentId(String studentId);
}


