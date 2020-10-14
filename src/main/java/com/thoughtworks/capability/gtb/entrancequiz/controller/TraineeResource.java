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

//TODO GTB：缺少自动分组接口，缺少查找分组接口
@RequestMapping(value = "/trainees")
//TODO GTB：一般项目上（使用了常规三层架构），在controller这一层class的命名，以xxxController命名。如果是用了其他必须要按照特定规则命名框架，那就按照项目要求来。
public class TraineeResource {
    private TraineeService traineeService;

    public TraineeResource(TraineeService traineeService) {
        this.traineeService = traineeService;
    }

    //TODO GTB：自增id的需求，没有实现
    @PostMapping
    public ResponseEntity<Void> create(@RequestBody TraineeRequest request) {
        this.traineeService.create(request.toTrainee());
        //TODO GTB：看下@ResponseStatus的用法
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<TraineeResponse> getTrainees() {
        ArrayList<Trainee> trainees = this.traineeService.getTrainees();
        TraineeResponse traineeResponseEntity = new TraineeResponse(trainees);

        return ResponseEntity.ok(traineeResponseEntity);
    }
}
