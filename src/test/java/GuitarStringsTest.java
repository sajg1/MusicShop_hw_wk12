import Accessories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings(4, 8, "Guitar Strings", "Addagio", "Nickel", "Acoustic");
    }

    @Test
    public void hasABuyingPrice() {
        assertEquals(4, guitarStrings.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(8, guitarStrings.getSellingPrice());
    }
}
