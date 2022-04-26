package exercises.Parking;

import exercises.Vehicles.Car;

public class CarPark extends Parking {

    public CarPark(String name) {
        super(name);
    }

    public void parkCar(Car car) {
        this.vehicles.add(car);
    }
}
