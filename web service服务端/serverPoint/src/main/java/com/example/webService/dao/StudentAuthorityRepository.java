package com.example.webService.dao;

import com.example.webService.JpaEntity.StudentAuthorityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentAuthorityRepository extends JpaRepository<StudentAuthorityEntity,Integer> {
   public List<StudentAuthorityEntity> findStudentAuthorityEntitiesByStudentId(String studentId);
}
