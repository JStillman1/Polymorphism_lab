package exercises.Parking;

import exercises.Vehicles.Bike;
import exercises.Vehicles.Car;
import exercises.Vehicles.Truck;
import exercises.Vehicles.Vehicle;

public class AirportParking extends Parking{
    public AirportParking(String name) {
        super(name);
    }

    public boolean park(Car car) {
        return availability(car);
    }

    public boolean park(Bike bike) {
        return availability(bike);
    }

    public boolean park(Truck truck) {
        return availability(truck);
    }

    public boolean availability(Vehicle vehicle) {
        if (this.vehicles.size() < 2) {
            this.vehicles.add(vehicle);
            return true;
        }
        return false;
    }

//    public void printAllVehicles() {
//        for (Vehicle veh: vehicles) {
//            System.out.println(veh.toString());
//        }
//    }
}
