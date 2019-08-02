import Instruments.Saxaphone;
import enums.SaxaphoneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxaphoneTest {

    Saxaphone saxaphone;

    @Before
    public void before() {
        saxaphone = new Saxaphone(350, 599, "Elkhart", "100TS", "Brass", SaxaphoneType.SOPRANO);
    }

    @Test
    public void hasABuyingPrice() {
        assertEquals(350, saxaphone.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(599, saxaphone.getSellingPrice());
    }

    @Test
    public void hasAMake() {
        assertEquals("Elkhart", saxaphone.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("100TS", saxaphone.getModel());
    }

    @Test
    public void hasAnInstrumentType() {
        assertEquals("Brass", saxaphone.getInstrumentType());
    }
}
