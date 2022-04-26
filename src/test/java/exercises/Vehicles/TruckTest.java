package exercises.Vehicles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckTest {

    Truck truck;

    @BeforeEach
    void reset() {
        truck = new Truck(8 ,1 );
    }

    @Test
    void startEngineTest() {
        assertTrue(truck.startEngine());
    }

    @Test
    void honkTest() {
        assertEquals("Honk!", truck.honk());
    }

}