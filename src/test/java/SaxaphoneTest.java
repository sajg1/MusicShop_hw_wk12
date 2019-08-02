import Instruments.Saxaphone;
import enums.InstrumentType;
import enums.SaxaphoneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxaphoneTest {

    Saxaphone saxaphone;

    @Before
    public void before() {
        saxaphone = new Saxaphone(350, 599, "Elkhart", "100TS", InstrumentType.BRASS, SaxaphoneType.SOPRANO);
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
        assertEquals(InstrumentType.BRASS, saxaphone.getInstrumentType());
    }

    @Test
    public void hasASaxaphoneType() {
        assertEquals(SaxaphoneType.SOPRANO, saxaphone.getSaxaphoneType());
    }

    @Test
    public void canPlayTheSaxaphone() {
        assertEquals("I'm playing the Elkhart 100TS.", saxaphone.play());
    }
}
