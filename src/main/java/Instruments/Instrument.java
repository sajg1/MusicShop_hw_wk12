package Instruments;

import StockItems.StockItem;
import behaviours.IPlay;
import behaviours.ISell;
import enums.InstrumentType;

public abstract class Instrument extends StockItem implements IPlay, ISell {

    private String make;
    private String model;
    private InstrumentType instrumentType;

    public Instrument(int buyingPrice, int sellingPrice, String make, String model, InstrumentType instrumentType) {
        super(buyingPrice, sellingPrice);
        this.make = make;
        this.model = model;
        this.instrumentType = instrumentType;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public String play() {
        return "I'm playing the " + getMake() + " " + getModel() + ".";
    }

    public int calculateMarkup() {
        return getSellingPrice() - getBuyingPrice();
    }

}
