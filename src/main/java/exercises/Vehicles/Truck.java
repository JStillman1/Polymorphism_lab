package exercises.Vehicles;

public class Truck extends MotorVehicle implements SteeringWheel{

    private String load = "dirt";

    public Truck(int numberOfWheels, int numberOfPassengers) {
        super(numberOfWheels, numberOfPassengers);
    }

    @Override
    public boolean startEngine() {
        return true;
    }

    @Override
    public String honk() {
        return "Honk!";
    }

    @Override
    public String toString() {
        return "Truck{" +
                "load='" + load + '\'' +
                '}';
    }

    @Override
    public String rotateLeft() {
        return("Truck turning left.");
    }

    @Override
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
        return("Truck turning right.");
    }

    @Override
    public String rotateRight(int degrees) {
        if (degrees < 135) {
            return("Car turning right.");
        }
        else {
            return("Car turning right sharply! Hold on!");
        }
    }
}
