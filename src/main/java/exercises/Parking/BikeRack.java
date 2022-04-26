package exercises.Parking;

import exercises.Vehicles.Bike;

public class BikeRack extends Parking {

    public BikeRack(String name) {
        super(name);
    }

    public void parkBike(Bike bike) {
        this.vehicles.add(bike);
    }
}
