package vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
 * getRemainingRange
 * getMaxRange
 * recharge
 */

public class Group3_1_ChevyS2 {
    @Test
    public void chevyScenario2() {
        ChevroletBird bird = new ChevroletBird(0);
        bird.drive(bird.getRemainingRange());
        
        // recharge
        bird.recharge();
        // getRemainingRange
        assertEquals(250, bird.getRemainingRange(), "Should have 250 miles of range");
        // getMaxRange
        assertEquals(250, bird.getMaxRange(), "Should be 250 miles");
        //

    }
    
}
