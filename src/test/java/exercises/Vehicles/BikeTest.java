package exercises.Vehicles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    private Bike bike;

    @BeforeEach
    void setup(){
       bike = new Bike(1);
    }

    @Test
    void honkTest() {
        assertEquals("Ding ding!", bike.honk());
    }

    @Test
    void canParkBike(){
        assertEquals("Locked my bike!", bike.park());
    }




}