package exercises.Parking;

import exercises.Vehicles.Vehicle;

import java.util.ArrayList;

public abstract class Parking {

    protected String name;
    protected ArrayList<Vehicle> vehicles;

    public Parking(String name) {
        this.name = name;
        this.vehicles = new ArrayList<>();
    }

    public int countVehicle() {
        return this.vehicles.size();
    }

}
