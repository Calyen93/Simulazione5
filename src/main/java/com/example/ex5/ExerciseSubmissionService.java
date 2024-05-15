package com.example.ex5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseSubmissionService {

    @Autowired ExerciseSubmissionRepository exerciseSubmissionRepository;

    public ExerciseSubmission addExerciseSubmission(ExerciseSubmission exerciseSubmission){
        if(exerciseSubmission.getMarks() <= 0 && exerciseSubmission.getMarks() > 5 ){
            throw new IllegalArgumentException("");
        }
        return exerciseSubmissionRepository.save(exerciseSubmission);
    }

    public List<ExerciseSubmission> retrieveAllExercisesSubmitted(){
       return exerciseSubmissionRepository.findAll();

    }




}
