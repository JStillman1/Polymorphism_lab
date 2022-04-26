package exercises.Vehicles;

public abstract class MotorVehicle extends Vehicle {

    public MotorVehicle(int numberOfWheels,
                        int numberOfPassengers,
                        VehicleColour vehicleColour) {
        super(numberOfWheels, numberOfPassengers, vehicleColour);
    }

    public MotorVehicle(int numberOfWheels, int numberOfPassengers) {
        super(numberOfWheels, numberOfPassengers);
    }

    public abstract boolean startEngine();

    @Override
    public String park() {
        return("I've parked.");
    }

    @Override
    public abstract String honk();

    @Override
    public void accelerate() {
        System.out.println("Speeding up!");
    }

    @Override
    public void brake() {
        System.out.println("Slowing down!");
    }
}
