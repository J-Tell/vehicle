package vehicle;

public abstract class GasPoweredCar extends Car{

    private double fuelCapacityGallons;
    private String make;
    private double startingMileage;
    private String model;

    public GasPoweredCar(String make, String model, double startingMileage, double fuelCapacityGallons) {
        
        super(make, model, startingMileage);
        make = this.make;
        model = this.model;
        startingMileage = this.startingMileage;
        fuelCapacityGallons = this.fuelCapacityGallons;
    }

    public void drive(double miles) {
        if(miles < 1 || miles > this.getFuelLevel())
            throw new IllegalArgumentException();
        this.fuelCapacityGallons = 0;
        
    }

    public double getMPG() {
        return this.startingMileage;
    }

    public double getFuelLevel() {
        return 0.0;
    }

    public double getFuelCapacity() {
        return this.fuelCapacityGallons;
    }

    public void refillTank(double gallons) {
        if(gallons < 0 || gallons > this.fuelCapacityGallons)
            throw new IllegalArgumentException();
        //this.getFuelLevel() += gallons;
    }
    
}
