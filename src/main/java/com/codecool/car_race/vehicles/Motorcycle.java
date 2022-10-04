package main.java.com.codecool.car_race.vehicles;

import main.java.com.codecool.car_race.Race;

public class Motorcycle extends Vehicle{

    private static int motorcycleNumber = 1;
    @Override
    void prepareForLap(Race race) {

    }

    @Override
    protected String generateName() {
        return "Motorcycle " + motorcycleNumber++;
    }
}
