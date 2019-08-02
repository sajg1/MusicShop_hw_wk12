package Instruments;

import StockItems.StockItem;

public abstract class Instrument extends StockItem {

    private String make;
    private String model;
    private String instrumentType;

    public Instrument(int buyingPrice, int sellingPrice, String make, String model, String instrumentType) {
        super(buyingPrice, sellingPrice);
        this.make = make;
        this.model = model;
        this.instrumentType = instrumentType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getInstrumentType() {
        return instrumentType;
    }
}
