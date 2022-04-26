package exercises.Vehicles;

public class Bike extends Vehicle implements Handling{

    private String body = "A rack.";

    public Bike(int numberOfPassengers, VehicleColour vehicleColour) {
        super(2, numberOfPassengers, vehicleColour);
    }

    public Bike(int numberOfPassengers) {
        super(2, numberOfPassengers);
    }

    @Override
    public String park() {
        return("Locked my bike!");
    }

    @Override
    public String honk() {
        return "Ding ding!";
    }

    @Override
    public void accelerate() {
        System.out.println("I'm pedalling faster!");
    }

    @Override
    public void brake() {
        System.out.println("Braking!");
    }

    @Override
    public String toString() {
        return "Bike{" +
                "body='" + body + '\'' +
                '}';
    }

    @Override
    public void turnLeft() {
        System.out.println("Bike turning left.");
    }

    @Override
    public void turnRight() {
        System.out.println("Bike turning right.");
    }
}
