package com.example.ex5;

import jakarta.persistence.*;

@Entity
public class ExerciseSubmission {

    @Id
    @GeneratedValue
    private long submissionId;

    private long exerciseId;

    @ManyToOne
    private Student student;

    private byte marks;

    public ExerciseSubmission() {
    }

    public ExerciseSubmission(long submissionId, long exerciseId, Student student, byte marks) {
        this.submissionId = submissionId;
        this.exerciseId = exerciseId;
        this.student = student;
        this.marks = marks;
    }

    public long getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(long submissionId) {
        this.submissionId = submissionId;
    }

    public long getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(long exerciseId) {
        this.exerciseId = exerciseId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public byte getMarks() {
        return marks;
    }

    public void setMarks(byte marks) {
        this.marks = marks;
    }
}
