import Instruments.Saxaphone;
import behaviours.ISell;

import java.util.ArrayList;

public class MusicShop {

    private String name;
    private ArrayList<ISell> items;

    public MusicShop(String name) {
        this.name = name;
        this.items = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getItems() {
        return items;
    }

    public int itemCount(){
        return this.items.size();
    }

    public void addItem(ISell item) {
        this.items.add(item);
    }

    public void removeAllItems() {
        this.items.clear();
    }



}
