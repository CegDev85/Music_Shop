public class StringSets extends Instrument implements ISell {

    private int stringAmount;

    public StringSets(int stringAmount,String make, double buyCost, double sellCost) {
        super(make, buyCost, sellCost);
        this.stringAmount = stringAmount;
    }

    public int getStringAmount() {
        return stringAmount;
    }

    public void setStringAmount(int stringAmount) {
        this.stringAmount = stringAmount;
    }

    public double calculateMarkup() {
        return getSellCost() - getBuyCost();
    }
}
