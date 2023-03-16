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
    public void chevyConstructorTest1() {
        ChevroletBird bird = new ChevroletBird(0);
        double range = bird.getRemainingRange();

        // canDrive
        assertTrue(bird.canDrive(range), "You should be able to drive this amount");
        assertFalse(bird.canDrive(range + 1), "You should not be able to drive this amount");
        assertFalse(bird.canDrive(-1), "You should not be able to drive this amount");
        // toString
        assertEquals("", bird.toString(), "this is the toString test");
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


        // assertFalse(bird.canFly(30), "canFly should be false");
        // assertThrows(IllegalArgumentException.class, () -> {
        //     bird.canFly(-1);
        // }, "Flying mileage cannot be negative.");

        // bird.fly(230);
        // assertEquals(250, bird.getMileage(), 0.1, "fly should be positive");
        // assertThrows(IllegalArgumentException.class, () -> {
        //     bird.fly(-1);
        // }, "Flying mileage cannot be negative.");
        // assertThrows(IllegalArgumentException.class, () -> {
        //     bird.fly(251);
        // }, "Flying mileage cannot be over the remaining range of the car.");
        
        // assertFalse(bird.canFly(-1), "Flying -1 should fail.");
        // assertTrue(bird.canFly(1), "1 should succeed.");

        assertFalse(bird.canDrive(252), "Driving 252 should fail.");
        assertTrue(bird.canDrive(251), "Driving 251 should succeed.");

        bird.drive(251);
        assertEquals(481, bird.getMileage(), .1, "Mileage should be 481 after third drive.");

        assertThrows(IllegalArgumentException.class, () -> {
            bird.drive(5);
        }, "Driving beyond empty should fail.");
    }
}
