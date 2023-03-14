package vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Driver;

import org.junit.jupiter.api.Test;
public class Group3_1_ChevyBird {
    @Test
    public void chevyConstructorTest1() {
        ChevroletBird bird = new ChevroletBird(250);
        assertEquals(0, bird.getMileage(), 0.1, "Default mileage should be zero.");
        assertEquals(14.5, bird.getFuelCapacity(),  0.1, "Initial fuel capacity not correct.");
        assertEquals(33.2, bird.getMPG(), 0.1, "Initial mpg not correct.");
        assertEquals(bird.getFuelCapacity() * bird.getMPG(), bird.getRemainingRange(), 0.1,
                "Remaining range of car not correct at creation.");
    }

    @Test
    public void chevyConstructorTest2() {
        ChevroletBird bird = new ChevroletBird(2018);

        assertThrows(IllegalArgumentException.class, () -> {
            bird.drive(-1);
        }, "Driving mileage cannot be negative.");

       assertTrue(bird.canDrive(30), "canDrive should be true");
       bird.drive(30);
        assertEquals(30, bird.getMileage(), .1, "Mileage should be 30 after first drive.");

        bird.drive(200);
        assertEquals(230, bird.getMileage(), .1, "Mileage should be 230 after second drive.");

        assertEquals(bird.getFuelCapacity() * bird.getMPG() - 230, bird.getRemainingRange(), .1,
                "Remaining range of car not correct after driving twice.");

        assertFalse(bird.canDrive(252), "Driving 252 should fail.");
        assertTrue(bird.canDrive(251), "Driving 251 should succeed.");

        bird.drive(251);
        assertEquals(481, bird.getMileage(), .1, "Mileage should be 481 after third drive.");

        assertThrows(IllegalArgumentException.class, () -> {
            bird.drive(5);
        }, "Driving beyond empty should fail.");
    }
    public void chevyWingsTest() {
    }
    public void chevyDriveTest() {
    }
    public void chevyCanFlyTest() {
        ChevroletBird bird = new ChevroletBird(-1);

        assertThrows(IllegalArgumentException.class, () -> {
            bird.drive(-1);
        }, "Driving mileage cannot be negative.");
    }
    public void chevyFlyingTest() {
    }
}
