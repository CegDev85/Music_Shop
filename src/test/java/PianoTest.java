import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("Extra Large",300,"White","Big Mofo Peeanas",649,1200);
    }

    @Test
    public void hasMake(){
        assertEquals("Big Mofo Peeanas",piano.getMake());
    }

    @Test
    public void hasWeight(){
        assertEquals(300, piano.getWeight(),0.0);
    }

    @Test
    public void hasBuyCost(){
        assertEquals(649, piano.getBuyCost(),0.0);
    }
}
