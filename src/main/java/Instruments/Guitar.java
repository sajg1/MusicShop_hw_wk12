package Instruments;


import enums.InstrumentType;

public class Guitar extends Instrument {

    private int noOfStrings;

    public Guitar(int buyingPrice, int sellingPrice, String make, String model, InstrumentType instrumentType, int noOfStrings) {
        super(buyingPrice, sellingPrice, make, model, instrumentType);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }
}
