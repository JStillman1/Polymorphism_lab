package exercises.Parking;

import exercises.Vehicles.Truck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckStopTest {

    @Test
    void countTrucks() {
        TruckStop truckStop = new TruckStop("TruckStop");
        Truck truck = new Truck(8, 1);
        truckStop.parkTruck(truck);
        assertEquals(1, truckStop.countVehicle());
    }

}