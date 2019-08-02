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

}
