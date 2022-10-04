package main.java.com.codecool.car_race.vehicles;

import main.java.com.codecool.car_race.Race;
import main.java.com.codecool.car_race.util.RandomHelper;

public class Car extends Vehicle{

    public Car(){
        super(calculateNormalSpeed());
    }

    private static int calculateNormalSpeed() {
        return RandomHelper.nextInt(80, 110+1);
    }

    private static final String[] POSSIBLE_NAMES = {
            "Epiphany",
            "Parallel",
            "Blitz",
            "Eos",
            "Evolution",
            "Wolf",
            "Union",
            "Empyrean",
            "Curiosity",
            "Gallop"
    };
    @Override
    void prepareForLap(Race race) {

    }

    @Override
    protected String generateName() {
        String firstName = RandomHelper.chooseOne(POSSIBLE_NAMES);
        String lastName = RandomHelper.chooseOne(POSSIBLE_NAMES);
        return firstName + " " + lastName;
    }




}
