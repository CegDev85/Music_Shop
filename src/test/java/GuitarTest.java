import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Purple",7,"Riff Machine 707","Ibanez",299,499);
    }

    @Test
    public void hasColour(){
        assertEquals("Purple", guitar.getColour());
    }

    @Test
    public void hasMake(){
        assertEquals("Ibanez", guitar.getMake());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(299, guitar.getBuyCost(),0.0);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(499, guitar.getSellCost(),0.0);
    }

    @Test
    public void hasName(){
        assertEquals("Riff Machine 707", guitar.getName());
    }

    @Test
    public void canTune(){
        assertEquals("dum dum duuummmmmm", guitar.tune());
    }


}
