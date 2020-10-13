package com.thoughtworks.capability.gtb.entrancequiz.controller.dto;

import com.thoughtworks.capability.gtb.entrancequiz.model.Trainee;

public class TraineeRequest {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trainee toTrainee() {
        return new Trainee(this.name);
    }
}
