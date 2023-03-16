package vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/*
 * Need to test Car methods:
 * canDrive
 * toString
 * getMileage
 * getMake
 * getModel
 * roadTrip
 */

public class Group3_1_ChevyS1 {
    @Test
    public void chevyScenario1() {
        ChevroletBird bird = new ChevroletBird(0);
        double range = bird.getRemainingRange();

        // canDrive
        assertTrue(bird.canDrive(range), "You should be able to drive this amount");
        assertFalse(bird.canDrive(range + 1), "You should not be able to drive this amount");
        assertFalse(bird.canDrive(-1), "You should not be able to drive this amount");
        // toString
        assertEquals("Chevrolet Bird (0.0 mi)", bird.toString(), "this is the toString test");
        // getMileage
        assertEquals(0, bird.getMileage(), "Your mileage should be 0");
        // getMake
        assertEquals("Chevrolet", bird.getMake(), "Your make should be Chevrolet");
        // getModel
        assertEquals("Bird", bird.getModel(), "Your model should be Bird");
        // roadTrip
        List<Double> roadtrip = new ArrayList<Double>();
        roadtrip.add(range);
        roadtrip.add(1.0);

        assertEquals(1, bird.roadTrip(roadtrip), "you drive full range 1st day, unable to drive second day");
    }
}
