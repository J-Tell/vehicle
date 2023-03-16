package vehicle;

import javax.lang.model.util.ElementScanner14;
import javax.sound.sampled.SourceDataLine;

/*
 * toString
 * both constructors
 */

public class Group3_1_HondaS3 {
    HondaAccordian honda = new HondaAccordian(2018);
    String tostring = honda.toString();
    if(tostring != honda.modelYear + honda.super.toString())
        System.out.println("fail (bad toString())");
    else
        System.out.println("pass");

    HondaAccordian honda2 = new HondaAccordian(12, 2018);
    System.out.println(honda2);
}
 