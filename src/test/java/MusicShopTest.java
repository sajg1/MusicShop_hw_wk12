import Instruments.Guitar;
import Instruments.Saxaphone;
import enums.InstrumentType;
import enums.SaxaphoneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop shop;
    Guitar guitar;
    Saxaphone saxaphone;

    @Before
    public void before() {
        shop = new MusicShop("Al's axes");
        guitar = new Guitar(300, 500,"Fender", "Stratocaster", InstrumentType.STRING, 6);
        saxaphone = new Saxaphone(350, 599, "Elkhart", "100TS", InstrumentType.BRASS, SaxaphoneType.SOPRANO);
    }

    @Test
    public void hasAName() {
        assertEquals("Al's axes", shop.getName());
    }

    @Test
    public void hasAnEmptyListAtStart() {
        assertEquals(0, shop.itemCount());
    }

    @Test
    public void canAddISellItemToArray() {
        shop.addItem(guitar);
        assertEquals(1, shop.itemCount());
    }

    @Test
    public void canRemoveAllItems() {
        shop.addItem(guitar);
        shop.addItem(saxaphone);
        assertEquals(2, shop.itemCount());
        shop.removeAllItems();
        assertEquals(0, shop.itemCount());

    }

    @Test
    public void canRemoveIndividualItem() {
        shop.addItem(guitar);
        shop.addItem(saxaphone);
        assertEquals(2, shop.itemCount());
        shop.removeItem();
        assertEquals(1, shop.itemCount());
    }

    @Test
    public void canGetTotalProfitOfISellItems() {
        shop.addItem(guitar);
        shop.addItem(saxaphone);
        assertEquals(2, shop.itemCount());
        assertEquals(449, shop.totalPotentialProfit());
    }

}
