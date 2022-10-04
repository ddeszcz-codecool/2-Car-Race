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

    protected Vehicle(int normalSpeed){
        this.name = generateName();
        this.normalSpeed = normalSpeed;
    }

    abstract void prepareForLap(Race race);
    protected abstract String generateName();

    private void moveForAnHour(){

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{")
                .append("distance travelled: ")
                .append(distanceTravelled)
                .append(", ")
                .append("type: ")
                .append(getClass().getSimpleName())
                .append(", ")
                .append("name: ")
                .append(name)
                .append(", ")
                .append("Normal Speed: ")
                .append(normalSpeed)
                .append("}");
        return sb.toString();
    }
}
