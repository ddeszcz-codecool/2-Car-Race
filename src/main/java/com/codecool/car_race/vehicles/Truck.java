package main.java.com.codecool.car_race.vehicles;

import main.java.com.codecool.car_race.Race;
import main.java.com.codecool.car_race.util.RandomHelper;

public class Truck extends Vehicle{
    @Override
    void prepareForLap(Race race) {

    }

    @Override
    protected String generateName() {
        return Integer.toString(RandomHelper.nextInt(1001));
    }
}
