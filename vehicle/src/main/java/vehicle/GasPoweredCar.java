package vehicle;

abstract class GasPoweredCar extends Car {
    double mpg;
    double fuelCapacityGallons;
    
    public GasPoweredCar(String make, String model, double startingMileage, double m, double cap) {
        super(make, model, startingMileage);
        mpg = m;
        fuelCapacityGallons = cap;
    }

    public GasPoweredCar(String make, String model, double m, double cap) {
        super(make, model);
        mpg = m;
        fuelCapacityGallons = cap;
    }

    public void drive(double miles) {
        
    }
    
    public double getMPG() {
        return mpg;
    }

    public double getFuelLevel() {

    }

    public double getFuelCapacity() {

    }

    public void refillTank() {

    }

    public double getRemainingRange() {

    }

    public void refillTank(double gallons);

    protected void decreaseFuelLevel();
}
