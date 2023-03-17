package vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.lang.model.util.ElementScanner14;
import javax.sound.sampled.SourceDataLine;

/*
 * toString
 * both constructors
 */

public class Group3_1_HondaS3 {

    public void testConstructor1() {
        HondaAccordian honda = new HondaAccordian(34, 2018);
        assertEquals(34, honda.startingMileage, "Bad constructor");
    }

    public void testConstructor2() {
        HondaAccordian honda = new HondaAccordian(2018);
        assertEquals(2018, honda.modelYear, "Bad constructor");
    }

    public void testToString() {
        HondaAccordian honda = new HondaAccordian(2018);
        String toString = honda.toString();
        assertEquals("", toString, "Bad toString()");
    }

}
 