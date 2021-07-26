public class Guitar extends Instrument implements ISell{

    private String colour;
    private int numOfStrings;
    private String name;

    public Guitar(String colour, int numOfStrings, String name, String make, double buyCost, double sellCost) {
        super(make, buyCost, sellCost);
        this.colour = colour;
        this.numOfStrings = numOfStrings;
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public void setNumOfStrings(int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String tune(){
        return "dum dum duuummmmmm";
    }

    public double calculateMarkup() {
        return getSellCost() - getBuyCost();
    }

}
