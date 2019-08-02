package Instruments;

import enums.SaxaphoneType;

public class Saxaphone extends Instrument {

    private SaxaphoneType saxaphoneType;

    public Saxaphone(int buyingPrice, int sellingPrice, String make, String model, String instrumentType, SaxaphoneType saxaphoneType) {
        super(buyingPrice, sellingPrice, make, model, instrumentType);
        this.saxaphoneType = saxaphoneType;
    }

    public SaxaphoneType getSaxaphoneType() {
        return this.saxaphoneType;
    }

}
