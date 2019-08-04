package Accessories;

import StockItems.StockItem;

public class GuitarStrings extends Accessory {

    private String material;
    private String guitarType;

    public GuitarStrings(int buyingPrice, int sellingPrice, String description, String manufacturer, String material, String guitarType) {
        super(buyingPrice, sellingPrice, description, manufacturer);
        this.material = material;
        this.guitarType = guitarType;
    }

    public String getMaterial() {
        return material;
    }

    public String getGuitarType() {
        return guitarType;
    }
}
