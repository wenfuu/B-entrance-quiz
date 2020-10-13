package com.thoughtworks.capability.gtb.entrancequiz.controller.dto;

import com.thoughtworks.capability.gtb.entrancequiz.model.Trainee;

import java.util.ArrayList;

public class TraineeResponse {
    private ArrayList<Trainee> trainees;

    public TraineeResponse() {
    }

    public TraineeResponse(ArrayList<Trainee> trainees) {
        this.trainees = trainees;
    }

    public ArrayList<Trainee> getTrainees() {
        return trainees;
    }

    public void setTrainees(ArrayList<Trainee> trainees) {
        this.trainees = trainees;
    }
}
