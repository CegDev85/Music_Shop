public class Drums extends Instrument implements ISell{

    private Boolean sticks;
    private int toms;
    private int cymbals;

    public Drums(Boolean sticks, int toms, int cymbals, String make, double buyCost, double sellCost) {
        super(make, buyCost, sellCost);
        this.sticks = sticks;
        this.toms = toms;
        this.cymbals = cymbals;
    }

    public Boolean getSticks() {
        return sticks;
    }

    public int getToms() {
        return toms;
    }

    public int getCymbals() {
        return cymbals;
    }

    public double calculateMarkup() {
        return getSellCost() - getBuyCost();
    }
}
