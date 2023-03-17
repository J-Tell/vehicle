package vehicle;

import org.junit.jupiter.api.Test;

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
    @Test
    public void driveTest() {
        HondaAccordian honda = new HondaAccordian(70, 2018);
        //assertEquals(0, honda.getMileage(), 0.1, "Default mileage should be zero.");
        double mile = honda.getMileage();
    }

    @Test
    public void getMPGTest() {

    }

    @Test
    public void getFuelLevelTest() {

    }

    @Test
    public void refillTankTest() {

    }

    @Test
    public void getRemainingRangeTest() {

    }
}
