import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(300, 500,"Fender", "Stratocaster", "String", 6);
    }

    @Test
    public void hasbuyingPrice() {
        assertEquals(300, guitar.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(500, guitar.getSellingPrice());
    }

    @Test
    public void hasMake() {
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Stratocaster", guitar.getModel());
    }

    @Test
    public void hasAnInstrumentType() {
        assertEquals("String", guitar.getInstrumentType());
    }

    @Test
    public void hasNoOfStrings() {
        assertEquals(6, guitar.getNoOfStrings());
    }

    @Test
    public void canPlayGuitar() {
        assertEquals("I'm playing a Fender Stratocaster.", guitar.play());
    }
}
