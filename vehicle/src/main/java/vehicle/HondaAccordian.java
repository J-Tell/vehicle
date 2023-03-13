package vehicle;

public class HondaAccordian extends GasPoweredCar {
    /** modelYear specifies the year this car was made. Honda cares about
that stuff. All Honda Accordian models have 14.5 gallon tanks and
33.2 MPG. */
    private double startingMileage;
    private int modelYear;
    // private double gallons;
    // private double mpg;

    public HondaAccordian(double sm, int my) {
        super(getMake(), getModel(), sm, my);
        startingMileage = sm;
        modelYear = my;
        double gallons = 14.5;
        double mpg = 33.2;
    }
/** Defaults mileage to 0. */
    public HondaAccordian(int year) {
        year = modelYear;
        startingMileage = 0;
    }
/** Prints out the model year, make and model, and mileage.
Ex: "2019 Honda Accordian (<mileage> mi)"
Coding tip: Write this method to re-use the behavior of the
superclass toString. Don’t copy-and-paste the same code here. */
    public String toString() {
        return super.toString();
    }
}