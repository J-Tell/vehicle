package vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.sql.Driver;
import org.junit.jupiter.api.Test;

/*
 * Both constructors
 * checkWingExtended
 * drive
 */
public class Group3_1_ChevyS3 {
    public void chevyConstructorTest3() {

    ChevroletBird bird = new ChevroletBird(0);
    
    assertThrows(IllegalArgumentException.class, () -> {
        bird.fly(-1);
    }, "Flying mileage cannot be negative.");
}
public void chevyConstructorTest4() {
}
public void chevyCheckWingExtendedTest() {
}
public void chevyDriveTest() {
}

}
