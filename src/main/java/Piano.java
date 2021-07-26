public class Piano extends Instrument implements ISell {

    private String size;
    private double weight;
    private String colour;

    public Piano(String size, double weight, String colour, String make, double buyCost, double sellCost) {
        super(make, buyCost, sellCost);
        this.size = size;
        this.weight = weight;
        this.colour = colour;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double calculateMarkup() {
        return getSellCost() - getBuyCost();
    }
}
