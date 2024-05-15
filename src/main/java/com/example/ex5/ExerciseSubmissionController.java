package com.example.ex5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exercises")
public class ExerciseSubmissionController {

    @Autowired
    private ExerciseSubmissionService exerciseSubmissionService;

    @PostMapping
    public ResponseEntity<ExerciseSubmission> addSubmission(@RequestBody ExerciseSubmission exerciseSubmission) {


        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(exerciseSubmissionService.addExerciseSubmission(exerciseSubmission));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.
                    status(HttpStatus.BAD_REQUEST).build();
        }


    }

    @GetMapping
    public List<ExerciseSubmission> getAllExercisesSubmission() {
        return exerciseSubmissionService.retrieveAllExercisesSubmitted();
    }
}
