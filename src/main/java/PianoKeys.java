public class PianoKeys extends Instrument implements ISell {

    private int blackKeys;

    public PianoKeys(int blackKeys, String make, double buyCost, double sellCost) {
        super(make, buyCost, sellCost);
        this.blackKeys = blackKeys;
    }

    public int getBlackKeys() {
        return blackKeys;
    }

    public void setBlackKeys(int blackKeys) {
        this.blackKeys = blackKeys;
    }

    public double calculateMarkup() {
        return getSellCost() - getBuyCost();
    }
}
