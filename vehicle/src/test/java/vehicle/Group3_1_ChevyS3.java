package vehicle;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

/*
 * Both constructors
 * checkWingExtended
 * drive
 */
public class Group3_1_ChevyS3 {
    @Test
    public void chevyConstructorTest3() {

        ChevroletBird bird = new ChevroletBird(0);

        HondaAccordian bird = new HondaAccordian(34, 2018);
        assertEquals(34, bird.getMileage(), "Bad constructor");
    }

    @Test
    public void chevyCheckWingExtendedTest() {
    ChevroletBird bird = new ChevroletBird(0);

    assertFalse(bird.checkWingsExtended(), "checkWingsExtended should be false");
    }

    @Test
    public void chevyDriveTest() {
        ChevroletBird bird = new ChevroletBird(0);

        assertFalse(bird.checkWingsExtended(), "checkWingsExtended should be false");
        //copy and paste honda accordian drive method

    }

}
