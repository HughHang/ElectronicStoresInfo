public class Fridge extends KitchenProduct{
    private boolean         hasFreezer; //Whether the fridge has a freezer or not

    //Constructor
    public Fridge(double price, int stockQuantity, int wattage, String color, String brand, boolean hasFreezer){
        super(price, stockQuantity, wattage, color, brand);
        this.hasFreezer = hasFreezer;
    }

    public String toString() {
        String hasFreezerString;
        if (hasFreezer == true){
            hasFreezerString = " with Freezer";
        }else {
            hasFreezerString = "";
        }
        return getBrand() + " Fridge" + hasFreezerString + " (" + getColor() + ", " + getWattage() + " watts) \n" +
                "(" + getPrice() + " dollars each, " + getStockQuantity() + " in stock, " + getSoldQuantity() + " sold)";
    }
}
