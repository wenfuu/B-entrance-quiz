package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.controller.dto.TraineeRequest;
import com.thoughtworks.capability.gtb.entrancequiz.controller.dto.TraineeResponse;
import com.thoughtworks.capability.gtb.entrancequiz.model.Trainee;
import com.thoughtworks.capability.gtb.entrancequiz.service.TraineeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

@RequestMapping(value = "/trainees")
public class TraineeResource {
    private TraineeService traineeService;

    public TraineeResource(TraineeService traineeService) {
        this.traineeService = traineeService;
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody TraineeRequest request) {
        this.traineeService.create(request.toTrainee());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<TraineeResponse> getTrainees() {
        ArrayList<Trainee> trainees = this.traineeService.getTrainees();
        TraineeResponse traineeResponseEntity = new TraineeResponse(trainees);

        return ResponseEntity.ok(traineeResponseEntity);
    }
}
