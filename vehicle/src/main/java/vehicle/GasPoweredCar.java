package vehicle;

abstract class GasPoweredCar extends Car {
    
    public GasPoweredCar(String make, String model, double startingMileage, double mpg, double fuelCapacityGallons);

    public GasPoweredCar(String make, String model, double mpg, double fuelCapacityGallons);

    public void drive(double miles) {
        return
    }
    
    public double getMPG() {

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
