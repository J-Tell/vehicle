package vehicle;

public class ChevroletBird extends ElectricCar{
    /** Chevrolet Birds have a 250 mile range on a full charge. They
    start with their wings retracted.*/
    private double startingMileage;
    private boolean openWings;
    public ChevroletBird(double startingMileage) {
        super("Chevrolet", "Bird", 250);
        startingMileage = 250;
        openWings = false;
    }
/** Defaults mileage to 0. */
    public ChevroletBird() {
        super("Chevrolet", "Bird", milesOnMaxCharge);
        startingMileage = 0;
    }
/** Returns whether the wings are currently extended. */
    public boolean checkWingsExtended() {
        return openWings;
    }
/** Drives just like all other Electric Cars, except make sure that
you retract your wings first (duh).
Coding tip: Write this method to re-use the behavior of the
superclass drive. Don’t copy-and-paste the same code here.*/
    public void drive(double miles) {
        openWings = false;
        super.drive(); 
    }
}
