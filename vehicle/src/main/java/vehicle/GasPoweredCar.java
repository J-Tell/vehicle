package vehicle;
public abstract class GasPoweredCar extends Car {

    private double fuelCapacityGallons;
    private double fuelLeft;
    private double mpg;

    /**
     * @throws IllegalArgumentException if mpg or fuelCapacityGallons are non-positive.
     */
    public GasPoweredCar(String model, String make, double startingMileage, double mpg, double fuel) {
        super(model, make, startingMileage);
        this.fuelCapacityGallons = fuel;
        this.fuelLeft = fuel;
        this.mpg = mpg;
    }

    /**
     * Defaults mileage to 0.
     * @throws IllegalArgumentException if mpg or fuelCapacityGallons are non-positive.
     */
    public GasPoweredCar(String model, String make, double mpg, double fuel) {
        super(model, make);
        this.fuelCapacityGallons = fuel;
        this.fuelLeft = fuel;
        this.mpg = mpg;
    }

    /**
     * Drives the full given number of miles.
     * @throws IllegalArgumentException if miles is negative.
     * @throws IllegalArgumentException if miles is too high given the current fuel.
     */
    public void drive(double miles) {
        if (miles < 0 || miles > getRemainingRange()) {
            throw new IllegalArgumentException("bad quantity");
        }
        addMileage(miles);
        decreaseFuelLevel(miles / this.mpg);
    }

    /** Returns how many miles can be driven on one gallon of gas. */
    public double getMPG() {
        return this.mpg;
    }

    /** Returns how many gallons of fuel are currently in the car. */
    public double getFuelLevel() {
        return fuelCapacityGallons;
    }

    /** Returns how many gallons of fuel the car can hold at max. */
    public double getFuelCapacity() {
        return this.fuelCapacityGallons;
    }

    /** Refuels the car to max fuel capacity. */
    public void refillTank() {
        this.fuelLeft = this.fuelCapacityGallons;
    }

    /**
     * Returns how many more miles the car can currently go without
     * refueling.
     */
    public double getRemainingRange() {
        return this.mpg * this.fuelLeft;
    }

    /**
     * Attempt to refuel the car with additional gallons.
     * @throws IllegalArgumentException if gallons is negative OR gallons would overfill the tank.
     */
    public void refillTank(double gallons) {
        if (this.fuelLeft + gallons > this.fuelCapacityGallons || gallons < 0) {
            throw new IllegalArgumentException("Bad gallons");
        }
        this.fuelLeft += gallons;
    }

    /**
     * Decreases the amount of fuel in the gas tank based upon
     * mpg and the number of miles passed as an argument.
     */
    protected void decreaseFuelLevel(double miles) {
        this.fuelLeft -= miles;
    }
}
