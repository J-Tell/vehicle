package vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.sql.Driver;
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
    }

    @Test
    public void chevyConstructorTest2() {
        ChevroletBird bird = new ChevroletBird(0);

        assertFalse(bird.canFly(30), "canFly should be false");
        assertThrows(IllegalArgumentException.class, () -> {
            bird.canFly(-1);
        }, "Flying mileage cannot be negative.");

        bird.fly(230);
        assertEquals(250, 249, 0.1, "fly should be positive");
        assertThrows(IllegalArgumentException.class, () -> {
            bird.fly(-1);
        }, "Flying mileage cannot be negative.");
        assertThrows(IllegalArgumentException.class, () -> {
            bird.fly(500);
        }, "Flying mileage cannot be over the remaining range of the car.");
        


        bird.drive(200);
        assertEquals(230, bird.getMileage(), .1, "Mileage should be 230 after second drive.");


        assertFalse(bird.canDrive(252), "Driving 252 should fail.");
        assertTrue(bird.canDrive(251), "Driving 251 should succeed.");

        bird.drive(251);
        assertEquals(481, bird.getMileage(), .1, "Mileage should be 481 after third drive.");

        assertThrows(IllegalArgumentException.class, () -> {
            bird.drive(5);
        }, "Driving beyond empty should fail.");
    }
}
