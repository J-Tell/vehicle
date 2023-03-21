package vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        HondaAccordian honda = new HondaAccordian(70, 2018);

        assertEquals(33.2, honda.getMPG(), "Should be 33.2 MPG.");
    }

    @Test
    public void getFuelLevelTest() {
        HondaAccordian honda = new HondaAccordian(2018);

        assertEquals(33.2, honda.getFuelCapacity(), "Should be 33.2 MPG.");
    }

    @Test
    public void refillTankTest() {

    }

    @Test
    public void getRemainingRangeTest() {

    }
}
