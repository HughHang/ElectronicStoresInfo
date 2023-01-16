public class KitchenProduct extends Product {
    private int         wattage; //The wattage rating of the product
    private String      color; //The color of the product
    private String      brand; //The brand name of the product

    public KitchenProduct(double price, int stockQuantity, int wattage, String color, String brand) {
        super(price, stockQuantity);
        this.wattage = wattage;
        this.color = color;
        this.brand = brand;
    }

    //Get/Set methods
    public int getWattage() {return wattage;}
    public void setWattage(int wattage) {this.wattage = wattage;}

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}
}
