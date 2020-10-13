package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.model.Trainee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TraineeService {
    private final ArrayList<Trainee> trainees = new ArrayList<>();

    public void create(Trainee trainee) {
        this.trainees.add(trainee);
    }

    public ArrayList<Trainee> getTrainees() {
        return this.trainees;
    }
}
