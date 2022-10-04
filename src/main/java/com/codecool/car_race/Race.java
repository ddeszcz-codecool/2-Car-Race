package main.java.com.codecool.car_race;

import main.java.com.codecool.car_race.vehicles.Car;
import main.java.com.codecool.car_race.vehicles.Vehicle;

import java.util.LinkedList;
import java.util.List;

public class Race {

    private final List<Vehicle> vehicles = new LinkedList<>();

    /**
     * Simulates the passing of time by advancing the weather and
     * moving the vehicles for the duration of a whole race.
     */
    public void simulateRace() {
        //TODO: implement
    }

    /**
     * Prints the state of all vehicles. Called at the end of the
     * race.
     */
    public void printRaceResults() {
        System.out.println("Race results");
    }

    public void registerRacer(Vehicle racer) {
        vehicles.add(racer);
    }


}
