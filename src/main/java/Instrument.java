public abstract class Instrument {


    private String make;
    private double buyCost;
    private double sellCost;

    public Instrument(String make, double buyCost, double sellCost) {
        this.make = make;
        this.buyCost = buyCost;
        this.sellCost = sellCost;
    }

    public String getMake() {
        return make;
    }

    public double getBuyCost() {
        return buyCost;
    }

    public double getSellCost() {
        return sellCost;
    }



}
