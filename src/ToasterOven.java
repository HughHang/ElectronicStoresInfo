public class ToasterOven extends KitchenProduct{
    private boolean         convection; //Whether the toaster has convection heating or not

    //Constructor
    public ToasterOven(double price, int stockQuantity, int wattage, String color, String brand, boolean convection){
        super(price, stockQuantity, wattage, color, brand);
        this.convection = convection;
    }

    //toString
    public String toString() {
        String convectionString;
        if (convection == true){
            convectionString = " with convection";
        }else {
            convectionString = "";
        }
        return getBrand() + " Toaster" + convectionString + " (" + getColor() + ", " + getWattage() + " watts) \n" +
                "(" + getPrice() + " dollars each, " + getStockQuantity() + " in stock, " + getSoldQuantity() + " sold)";
    }
}
