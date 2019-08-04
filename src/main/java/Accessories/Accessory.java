package Accessories;

import StockItems.StockItem;
import behaviours.ISell;

public abstract class Accessory extends StockItem implements ISell {

    private String description;
    private String manufacturer;

    public Accessory(int buyingPrice, int sellingPrice, String description, String manufacturer) {
        super(buyingPrice, sellingPrice);
        this.description = description;
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int calculateMarkup() {
        return getSellingPrice() - getBuyingPrice();
    }
}
