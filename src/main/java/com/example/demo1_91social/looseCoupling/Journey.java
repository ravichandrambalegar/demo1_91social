package com.example.demo1_91social.looseCoupling;

public class Journey {
    Travel travel;

    public Travel getTravel() {
        return travel;
    }
    public void setTravel(Travel travel) {
        this.travel = travel;
    }
    public void startJourney(){
        travel.go();
    }
}
