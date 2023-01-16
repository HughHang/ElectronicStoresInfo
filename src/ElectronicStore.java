import java.util.Scanner;

public class ElectronicStore {
    private final int MAX_PRODUCTS = 10; //The maximum number of different product instances that this store can contain
    private String name; //The name of the electronics store
    private double revenue; //The total revenue the store has made through sales. This should initially be 0 but must be updated as products are sold
    private Product[] products;

    //Constructor
    public ElectronicStore(String name) {
        this.name = name;
        products = new Product[MAX_PRODUCTS];
        revenue = 0;
    }

    //Get name of store
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Add products
    public boolean addProduct(Product p) {
        for (int i = 0; i < MAX_PRODUCTS; i++) {
            if (products[i] == null) {
                products[i] = p;
                return true;
            }
        }
        return false;
    }

    //Sell products
    public boolean sellProducts() {
        this.printStock();
        System.out.println("");

        Scanner input = new Scanner(System.in);

        System.out.println("Choose a product:");
        int item = input.nextInt();
        System.out.println("This is the item you've chosen: " + products[item]);
        System.out.println("Choose an amount:");
        int amount = input.nextInt();
        System.out.println("This is the amount you've chosen: " + amount);

        if (item >= 0 && amount < MAX_PRODUCTS) {
            sellProducts(item, amount);
            return true;
        }
        return false;
    }

    //Calculations for selling of products
    public boolean sellProducts(int item, int amount) {
        if(item >= 0 && item <= MAX_PRODUCTS && products[item] != null) {
            revenue += products[item].sellUnits(amount);
            return true;
        } else {
            return false;
        }
    }

    //Get method
    public double getRevenue() {return revenue;}

    public void printStock() {
        for(int i = 0; i < MAX_PRODUCTS; i++){
            if(products[i] == null){
                break;
            }
            System.out.println(i + ". " + products[i]);
        }
    }
}
