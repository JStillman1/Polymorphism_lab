package exercises.Parking;

import exercises.Vehicles.Truck;

public class TruckStop extends Parking{

    public TruckStop(String name) {
        super(name);
    }

    public void parkTruck(Truck truck) {
        this.vehicles.add(truck);
    }

}
