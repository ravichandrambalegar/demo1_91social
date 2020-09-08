package com.example.demo1_91social.tasks.looseCoupling;

public class Journey {
    Travell travel;

    public Travell getTravel() {
        return travel;
    }
    public void setTravel(Travell travel) {
        this.travel = travel;
    }
    public void startJourney(){
        travel.go();
    }
}
