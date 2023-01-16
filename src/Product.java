public abstract class Product {
    private double price; //Represents how much the product costs
    private int stockQuantity; //Represents how many units of this product there are in stock
    private int soldQuantity = 0; //Represents how many units of this product have been sold
    private Product products;

    public Product(double price, int stockQuantity) {
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    //Get/Set methods
    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    public int getStockQuantity() {return stockQuantity;}
    public void setStockQuantity(int stockQuantity) {this.stockQuantity = stockQuantity;}

    public int getSoldQuantity() {return soldQuantity;}
    public void setSoldQuantity(int soldQuantity) {this.soldQuantity = soldQuantity;}

    //Selling amount units
    public double sellUnits(int amount) {
        if (amount > 0 && amount <= stockQuantity) {
            stockQuantity -= amount;
            soldQuantity += amount;
            double revenue = (amount * price);
            return revenue;
        } else {
            return 0;
        }
    }
}
