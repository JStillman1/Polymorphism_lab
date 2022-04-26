package exercises.Vehicles;

public abstract class Vehicle {

    enum VehicleColour {
        RED,
        GREEN,
        BLUE
    }

    protected int numberOfWheels;
    protected int numberOfPassengers;
    protected VehicleColour vehicleColour;

    public Vehicle(int numberOfWheels, int numberOfPassengers, VehicleColour vehicleColour) {
        this.numberOfWheels = numberOfWheels;
        this.numberOfPassengers = numberOfPassengers;
        this.vehicleColour = vehicleColour;
    }

    public Vehicle(int numberOfWheels, int numberOfPassengers) {
        this.numberOfWheels = numberOfWheels;
        this.numberOfPassengers = numberOfPassengers;
    }

    public abstract String park();
    public abstract String honk();
    public abstract void accelerate();
    public abstract void brake();
}
