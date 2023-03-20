package vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.sql.Driver;
import org.junit.jupiter.api.Test;


/*
 * toString
 * both constructors
 */

public class Group3_1_HondaS3 {

    @Test
    public void testConstructor1() {
        HondaAccordian honda = new HondaAccordian(34, 2018);
        assertEquals(34, honda.getMileage(), "Bad constructor");
    }

    @Test
    public void testConstructor2() {
        HondaAccordian honda = new HondaAccordian(2018);
        assertEquals(2018, honda.getModel(), "Bad constructor");
    }

    @Test
    public void testToString() {
        HondaAccordian honda = new HondaAccordian(2018);
        String toString = honda.toString();
        assertEquals("", toString, "Bad toString()");
    }

}
 