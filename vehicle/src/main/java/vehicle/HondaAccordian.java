package vehicle;

public class HondaAccordian extends GasPoweredCar {
    /** modelYear specifies the year this car was made. Honda cares about
that stuff. All Honda Accordian models have 14.5 gallon tanks and
33.2 MPG. */
    private double startingMileage;
    private int modelYear;
    private double mpg;
    // private double gallons;
    // private double mpg;

    public HondaAccordian(double sm, int my) {
        super("Honda", "Accordian", sm, 14.5);
        startingMileage = sm;
        modelYear = my;
        mpg = 33.2;
    }
/** Defaults mileage to 0. */
    public HondaAccordian(int year) {
        super("Honda", "Accordian", 0, 14.5);
        year = this.modelYear;
    }
/** Prints out the model year, make and model, and mileage.
Ex: "2019 Honda Accordian (<mileage> mi)"
Coding tip: Write this method to re-use the behavior of the
superclass toString. Don’t copy-and-paste the same code here. */
    public String toString() {
        return super.toString();
    }
}