package com.example.webService.JpaEntity;

import javax.persistence.*;

@Entity
@Table(name = "course_score")
public class ScoreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "student_id")
    String studentId;
    @Column(name = "score_value")
    int scoreValue;
    @Column(name = "course_id")
    String courseId;
    @Column(name = "score_character")
    String scoreCharacter;

    public ScoreEntity() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(int scoreValue) {
        this.scoreValue = scoreValue;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getScoreCharacter() {
        return scoreCharacter;
    }

    public void setScoreCharacter(String scoreCharacter) {
        this.scoreCharacter = scoreCharacter;
    }
}
