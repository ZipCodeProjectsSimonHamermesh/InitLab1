import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by simonhamermesh on 1/21/16.
 */


public class testColorfulThing {

    ColorfulThing ct1 = new ColorfulThing("asdf");
    ColorfulThing ct2 = new ColorfulThing(Color.BLUE);


    @Test
    public void testColorfulThing_getColor_checkReturnsString(){

        assertEquals("This didnt work dummy",ct1.getStrColor(),"asdf");

    }

    @Test
    public void testColorfulThing_getEnumColor_checkReturnsColorEnumObject(){

        assertEquals("This didn't work dummy", "BLUE", ct2.getEnumColor().toString() );


    }

}
