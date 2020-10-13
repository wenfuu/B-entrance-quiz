package com.thoughtworks.capability.gtb.entrancequiz.model;

public class TraineeBuilder {
    private String name;

    public TraineeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Trainee creatTrainee() {
        return new Trainee(name);
    }
}
