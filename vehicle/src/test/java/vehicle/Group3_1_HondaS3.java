package vehicle;

import org.junit.jupiter.api.Test;

/*
 * toString
 * both constructors
 */

public class Group3_1_HondaS3 {

    @Test
    public void testConstructor1() {
        HondaAccordian honda = new HondaAccordian(34, 2018);
    }

    @Test
    public void testConstructor2() {
        HondaAccordian honda = new HondaAccordian(2018);
    }

    @Test
    public void testToString() {
        HondaAccordian honda = new HondaAccordian(2018);
        String toString = honda.toString();
    }

}
 