public class Desktop extends OfficeProduct{
    private String      profile; //A string describing the size of the desktop case

    public Desktop(double price, int stockQuantity, double cpuSpeed, int ram, boolean ssd, int storage, String profile){
        super(price, stockQuantity, cpuSpeed, ram, ssd, storage);
        this.profile = profile;
    }

    public String toString() {
        String SSDString;
        if (getSsd() == true){
            SSDString = "SSD";
        }else {
            SSDString = "HDD";
        }
        return profile + " Desktop PC with " + getCpuSpeed() + "ghz CPU, " + getRam() + "GB RAM, " + getStorage() + "GB " + SSDString + " drive.\n" +
                    "(" + getPrice() + " dollars each, " + getStockQuantity() + " in stock, " + getSoldQuantity() + " sold)";
    }
}
