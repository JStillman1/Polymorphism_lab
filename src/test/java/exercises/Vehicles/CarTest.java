package exercises.Vehicles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;

    @BeforeEach
    void reset() {
        car = new Car( 2);
    }

    @Test
    void startEngineTest() {
        assertTrue(car.startEngine());
    }

    @Test
    void honkTest() {
        assertEquals("Beep beep!", car.honk());
    }

    @Test
    void canTurnLeft_NoArgs(){
        assertEquals("Car turning left.",car.rotateLeft());
    }

    @Test
    void canTurnLeft_WithSharpTurn(){
        assertEquals("Car turning left sharply! Hold on!",car.rotateLeft(160));
    }
    @Test
    void canTurnLeft_WithNormalTurn(){
        assertEquals("Car turning left.",car.rotateLeft(60));
    }

    @Test
    void canTurnRight_NoArgs(){
        assertEquals("Car turning right.",car.rotateRight());
    }

    @Test
    void canTurnRight_WithSharpTurn(){
        assertEquals("Car turning right sharply! Hold on!",car.rotateRight(160));
    }
    @Test
    void canTurnRight_WithNormalTurn(){
        assertEquals("Car turning right.",car.rotateRight(60));
    }

    @Test
    void colourTest_isRed() {
        Car redCar = new Car(2, Vehicle.VehicleColour.RED);
        assertEquals(Vehicle.VehicleColour.RED, redCar.getColour());
    }
}