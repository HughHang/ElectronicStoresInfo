public class Laptop extends OfficeProduct{
    private double          screenSize; //The size of the screen in inches

    //Constructor
    public Laptop(double price, int stockQuantity, double cpuSpeed, int ram, boolean ssd, int storage, double screenSize) {
        super(price, stockQuantity, cpuSpeed, ram, ssd, storage);
        this.screenSize = screenSize;
    }

    //toString
    public String toString() {
        String SSDString;
        if (getSsd() == true){
            SSDString = "SSD";
        }else {
            SSDString = "HDD";
        }
        return screenSize + " inch Laptop PC with " + getCpuSpeed() + "ghz CPU, " + getRam() + "GB RAM, " + getStorage() + "GB " + SSDString + " Drive. \n" +
            "(" + getPrice() + " dollars each, " + getStockQuantity() + " in stock, " + getSoldQuantity() + " sold)";
    }

}
