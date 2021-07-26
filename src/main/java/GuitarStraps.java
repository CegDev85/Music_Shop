public class GuitarStraps  extends Instrument implements ISell {

    private int strap;

    public GuitarStraps(int strap,String make, double buyCost, double sellCost) {
        super(make, buyCost, sellCost);
        this.strap = strap;
    }

    public int getStrap() {
        return strap;
    }


    @Override
    public double calculateMarkup() {
        return getSellCost() - getBuyCost();
    }
}
