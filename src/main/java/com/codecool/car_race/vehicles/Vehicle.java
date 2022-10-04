package main.java.com.codecool.car_race.vehicles;
import main.java.com.codecool.car_race.Race;

/**
 * Base class for all vehicles.  It is an abstract class meaning
 *  - Instances of this class can't be created
 *  - Methods can be left unimplemented
 */

public abstract class Vehicle {
    protected final String name;
    protected final int normalSpeed;
    protected int actualSpeed;
    protected int distanceTravelled;

    protected Vehicle(){
        this.name = "Vehicle";
        this.normalSpeed = 100;

    }


    abstract void prepareForLap(Race race);

    private void moveForAnHour(){

    }

}
