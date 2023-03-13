package vehicle;

public abstract class GasPoweredCar extends Car {

    private double fuelCapacityGallons;
    private double mpg;

    public GasPoweredCar(String mo, String ma, double startingMileage, double m, double fuel) {
        super(mo, ma, startingMileage);
        fuelCapacityGallons = fuel;
        mpg = m;
    }

    /**
     * Defaults mileage to 0.
     * 
     * @throws IllegalArgumentException if mpg or fuelCapacityGallons are
     *                                  non-positive.
     */
    public GasPoweredCar(String make, String model, double mpg, double fuelCapacityGallons) {
        super()
    }

    public void drive(double miles) {
        if (miles < 1 || miles > this.getFuelLevel())
            throw new IllegalArgumentException();
        System.out.println(this.getMake() + " " + this.getModel() + " " + this.getMileage() + " mi");

        this.addMileage(miles);
    }

    public double getMPG() {
        this.drive(1);

        return this.getMileage() / this.getFuelCapacity();
    }

    public double getFuelLevel() {
        return 0.0;
    }

    public double getFuelCapacity() {
        return this.fuelCapacityGallons;
    }

    public void refillTank(double gallons) {
        if (gallons < 0 || gallons > this.fuelCapacityGallons)
            throw new IllegalArgumentException();
        double x = this.getFuelLevel();
        x += gallons;
    }

}
