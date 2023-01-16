public class OfficeProduct extends Product{
    private double      cpuSpeed; //The CPU speed in Ghz
    private int         ram; //The amount of RAM in GB
    private boolean     ssd; //Whether the hard-drive is an SSD (true) or HDD (false)
    private int         storage; //The size of the hard-drive in GB

    public OfficeProduct(double price, int stockQuantity, double cpuSpeed, int ram, boolean ssd, int storage){
        super(price, stockQuantity);
        this.cpuSpeed = cpuSpeed;
        this.ram = ram;
        this.ssd = ssd;
        this.storage = storage;
    }

    //Get/Set methods
    public double getCpuSpeed() {return cpuSpeed;}
    public void setCpuSpeed(double cpuSpeed) {this.cpuSpeed = cpuSpeed;}

    public int getRam() {return ram;}
    public void setRam(int ram) {this.ram = ram;}

    public boolean getSsd() {return ssd;}
    public void setSsd(boolean ssd) {this.ssd = ssd;}

    public int getStorage() {return storage;}
    public void setStorage(int storage) {this.storage = storage;}

}
