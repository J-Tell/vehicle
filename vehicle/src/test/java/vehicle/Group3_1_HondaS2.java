package vehicle;

/*
 * Need to test methods:
 * getMPG
 * getFuelCapacity
 * getFuelLevel
 * refillTank (both no param and when passed double)
 * drive
 * getRemainingRange
 */

public class Group3_1_HondaS2 {
    public void hondaDriveTest() {
        HondaAccordian honda = new HondaAccordian(70, 2018);
        //assertEquals(0, honda.getMileage(), 0.1, "Default mileage should be zero.");
        double mile = honda.getMileage();

    }
}
