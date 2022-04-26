package exercises.Parking;

import exercises.Vehicles.Bike;
import exercises.Vehicles.Car;
import exercises.Vehicles.Truck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportParkingTest {

    @Test
    void countTrucks() {
        AirportParking airportParking = new AirportParking("AirportParking");
        Truck truck = new Truck(8, 1);
        airportParking.park(truck);
        assertEquals(1, airportParking.countVehicle());
    }

    @Test
    void countCars() {
        AirportParking airportParking = new AirportParking("AirportParking");
        Car car = new Car(1);
        airportParking.park(car);
        assertEquals(1, airportParking.countVehicle());
    }

    @Test
    void countBikes() {
        AirportParking airportParking = new AirportParking("AirportParking");
        Bike bike = new Bike( 1);
        airportParking.park(bike);
        assertEquals(1, airportParking.countVehicle());
    }

    @Test
    void parkAvailabilityTest__true() {
        AirportParking airportParking = new AirportParking("AirportParking");
        Bike bike = new Bike( 1);
        assertTrue(airportParking.park(bike));
    }

    @Test
    void parkAvailabilityTest__false() {
        AirportParking airportParking = new AirportParking("AirportParking");
        for(int i = 0; i < 11; i++) {
            Bike bike = new Bike(1);
            airportParking.park(bike);
        }
        Car car = new Car( 1);
        assertFalse(airportParking.park(car));
    }
}