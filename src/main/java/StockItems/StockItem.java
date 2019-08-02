package StockItems;

public abstract class StockItem {

    private int buyingPrice;
    private int sellingPrice;

    public StockItem(int buyingPrice, int sellingPrice) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(int buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
