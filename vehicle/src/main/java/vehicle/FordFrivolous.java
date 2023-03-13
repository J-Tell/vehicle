package vehicle;

class FordFrivolous extends GasPoweredCar implements SelfDriving, Flying {
    /** FordFrivolous has a gas tank of 20 gallons and an MPG of 23.6. */
    public FordFrivolous(double startingMileage) {
        super("Honda", "Accordian", startingMileage, 23.6, 20);
    }

    /** Defaults mileage to 0. */
    public FordFrivolous() {
        super("Honda", "Accordian", 23.6, 20);
    }

    /** @throws IllegalArgumentException if miles is negative.*/
    public boolean canFly(double miles) {
        return false;
    }

    /** @throws IllegalArgumentException if miles is negative.
    @throws IllegalArgumentException if miles exceeds the remaining
    range of the car.
    */
    public void fly(double miles) {
        
    }
    /** IllegalArgumentException if miles is negative. */
    public void driveAutonomously(double miles) {

    }
}