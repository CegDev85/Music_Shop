import java.util.HashMap;
import java.util.Map;

public class Shop extends Instrument implements ISell{

    private HashMap<ISell, Integer> items;

    public Shop(HashMap<ISell, Integer> items, String make, double buyCost, double sellCost) {
        super(make, buyCost, sellCost);
        this.items = new HashMap<>();
    }

    public HashMap<ISell, Integer> getItems() {
        return items;
    }

    public void addItem(ISell stock, int i){
        items.put(stock,1);
    }

    public void removeItem(ISell stock, int i){
        items.remove(stock,1);
    }

    public double calculateMarkup() {
        return getSellCost() - getBuyCost();
    }

//    public int amountOfEach(ISell item) {
//       if(items.containsKey(item)){
//       } return items.get(item).;
//    }
}
