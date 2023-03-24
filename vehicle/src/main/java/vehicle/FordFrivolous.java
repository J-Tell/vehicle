package vehicle;
class FordFrivolous extends GasPoweredCar implements SelfDriving, Flying {
    /** FordFrivolous has a gas tank of 20 gallons and an MPG of 23.6. */
    public FordFrivolous(double startingMileage) {
        super("Ford", "Frivolous", startingMileage, 23.6, 20);
    }

    /** Defaults mileage to 0. */
    public FordFrivolous() {
        super("Ford", "Frivolous", 23.6, 20);
        
    }

    /** @throws IllegalArgumentException if miles is negative.*/
    public boolean canFly(double miles) {
        if(miles < 0)
            throw new IllegalArgumentException("invalid argument");
        if (getRemainingRange() / 3 < miles) {
            return false;
        }
        return true;
    }

    /** @throws IllegalArgumentException if miles is negative.
    @throws IllegalArgumentException if miles exceeds the remaining
    range of the car.
    */
    public void fly(double miles) {
        if (miles < 0) {
            throw new IllegalArgumentException("Negative Miles");
        }
        double useableFuel = getFuelLevel() / 3;
        double useableRange = useableFuel * getMPG();
        if (miles > useableRange) {
            throw new IllegalArgumentException("Not Sufficient Fuel");
        }
        decreaseFuelLevel(3 * (miles / getMPG()));
    }
    /** IllegalArgumentException if miles is negative. */
    public void driveAutonomously(double miles) {
        if (miles < 0) {
            throw new IllegalArgumentException("Miles negative");
        }
        double useableFuel = getFuelLevel() / 2;
        double useableRange = useableFuel * getMPG();
        if (useableRange < miles) {
            drive(useableRange);
            decreaseFuelLevel(getFuelLevel());
        } else {
            drive(miles);
            decreaseFuelLevel(miles / getMPG());
        }
    }
}