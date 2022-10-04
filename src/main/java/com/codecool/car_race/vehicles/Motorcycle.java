package main.java.com.codecool.car_race.vehicles;

import main.java.com.codecool.car_race.Race;
import main.java.com.codecool.car_race.util.RandomHelper;

public class Motorcycle extends Vehicle{

    private static final int NORMAL_SPEED = 100;

    public Motorcycle(){
        super(NORMAL_SPEED);
    }

    private static int motorcycleNumber = 1;
    @Override
    void prepareForLap(Race race) {
        actualSpeed = normalSpeed;

        if (race.isRaining()) {
            int slowDown = RandomHelper.nextInt(5, 50+1);
            actualSpeed -= slowDown;
        }

    }

    @Override
    protected String generateName() {
        return "Motorcycle " + motorcycleNumber++;
    }

}
