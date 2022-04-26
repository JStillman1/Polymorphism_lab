package exercises.Vehicles;

public class Motorbike extends MotorVehicle implements Handling{
    public Motorbike(int numberOfWheels, int numberOfPassengers) {
        super(2, numberOfPassengers);
    }

    @Override
    public boolean startEngine() {
        return true;
    }

    @Override
    public String honk() {
        return "No noise.";
    }

    @Override
    public void turnLeft() {
        System.out.println("Motorbike turning left.");
    }

    @Override
    public void turnRight() {
        System.out.println("Motorbike turning right.");
    }
}
