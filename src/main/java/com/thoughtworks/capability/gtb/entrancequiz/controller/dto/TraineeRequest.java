package com.thoughtworks.capability.gtb.entrancequiz.controller.dto;

import com.thoughtworks.capability.gtb.entrancequiz.model.Trainee;
import com.thoughtworks.capability.gtb.entrancequiz.model.TraineeBuilder;

public class TraineeRequest {
    private String name;

    public TraineeRequest() {
    }

    public TraineeRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trainee toTrainee() {
        return new TraineeBuilder().setName(this.name).creatTrainee();
    }
}
