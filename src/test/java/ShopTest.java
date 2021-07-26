import com.sun.tools.javac.jvm.Items;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    HashMap<ISell, Integer> items;
    Piano piano;
    Guitar guitar;



    @Before
    public void setUp(){
        shop = new Shop(items,"Store",50000,50000);
        piano = new Piano("Large",50,"Black","Pro",399,599);
        guitar = new Guitar("Red",8,"Chugger","Mayones",459,759);
    }

    @Test
    public void hasItems(){
        assertEquals(0,shop.getItems().size());
        }

    @Test
    public void canAddItem(){
        shop.addItem(piano,1);
        assertEquals(1,shop.getItems().size());
    }

    @Test
    public void canRemoveItem(){
        shop.addItem(piano,1);
        shop.removeItem(piano,1);
        assertEquals(0,shop.getItems().size());
    }

    @Test
    public void canAdjustStock(){
        shop.addItem(piano,2);
        shop.addItem(guitar,8);
        assertEquals(2,shop.getItems().size());
    }

    @Test
    public void canCalculateProfit(){
        shop.addItem(guitar,8);
        assertEquals(300.0,guitar.calculateMarkup(),0.0);
    }

    @Test
    public void hasStock(){
        shop.addItem(piano,3);
        assertEquals(3,shop.amountOfEach(piano));
    }



}






