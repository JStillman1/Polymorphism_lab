package exercises.Vehicles;

public class Car extends MotorVehicle implements SteeringWheel{

    private String body = "Metal Box";

    public Car(int numberOfPassengers, VehicleColour vehicleColour) {
        super(4, numberOfPassengers, vehicleColour);
    }

    public Car(int numberOfPassengers) {
        super(4, numberOfPassengers);
    }

    public VehicleColour getColour() {
        return this.vehicleColour;
    }

    @Override
    public boolean startEngine() {
        return true;
    }

    @Override
    public String honk() {
        return "Beep beep!";
    }

    @Override
    public String toString() {
        return "Car{" +
                "body='" + body + '\'' +
                '}';
    }

    @Override
    public String rotateLeft() {
        return"Car turning left.";
    }

    public String rotateLeft(int degrees) {
        if (degrees < 135) {
            return("Car turning left.");
        }
        else {
            return("Car turning left sharply! Hold on!");
        }
    }

    @Override
    public String rotateRight() {
        return("Car turning right.");
    }

    public String rotateRight(int degrees) {
        if (degrees < 135) {
            return("Car turning right.");
        }
        else {
            return("Car turning right sharply! Hold on!");
        }
    }
}
