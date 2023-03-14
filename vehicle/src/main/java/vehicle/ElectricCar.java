package vehicle;

abstract class ElectricCar extends Car {
    private double milesOnMaxCharge;
    private double milesLeft;
    /** Note: Car begins with a full charge (and thus range).
    @throws IllegalArgumentException if milesOnMaxCharge is nonpositive.*/
    public ElectricCar(String make, String model, double startingMileage, double onMaxCharge) {
        super(make, model, startingMileage);
        if (onMaxCharge <= 0) {
            throw new IllegalArgumentException("Max Charge mileage is nonpositive");
        }
        milesOnMaxCharge = onMaxCharge;
    }

    /** Defaults mileage to 0.
    @throws IllegalArgumentException if milesOnMaxCharge is nonpositive.*/
    public ElectricCar (String make, String model, double onMaxCharge) {
        super(make, model);
        if (onMaxCharge <= 0) {
            throw new IllegalArgumentException("Max Charge mileage is nonpositive");
        }
        milesOnMaxCharge = onMaxCharge;
    }

    /** Drives the full given number of miles.
    @throws IllegalArgumentException if miles is negative.
    @throws IllegalArgumentException if miles is too high given the
    current charge.*/
    public void drive(double miles) {
        if (miles > milesLeft || miles < 0) {
            throw new IllegalArgumentException("Invalid Miles");
        }
        decreaseCharge(miles);
        addMileage(miles);
        
    }

    /** Returns how many more miles the car can currently go without
    recharging. */
    public double getRemainingRange() {
        return milesLeft;
    }

    /** Returns how many miles the car could go on a full charge. */
    public double getMaxRange() {
        return milesOnMaxCharge;
    }

    /** Recharges the car to max range capability. */
    public void recharge() {
        milesLeft = milesOnMaxCharge;
    }

    /** Decreases the amount of energy in the battery based by the number
    of miles passed as an argument. */
    protected void decreaseCharge(double miles) {
        milesLeft -= miles;
    }
}
