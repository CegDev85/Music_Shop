import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void setUp(){
        drums = new Drums(true,2,3,"Pearl",399,699);
    }

    @Test
    public void hasMake(){
        assertEquals("Pearl", drums.getMake());
    }

    @Test
    public void hasSticks(){
        assertEquals(true, drums.getSticks());
    }

    @Test
    public void hasToms(){
        assertEquals(2, drums.getToms());
    }

}
