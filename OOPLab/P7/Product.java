package P7;

public class Product {
    private String productName;
    private double cost;
    private String manufacturer;
    private int maxDiscount;

    public Product(String productName, double cost, String manufacturer, int maxDiscount) {
        this.productName = productName;
        this.cost = cost;
        this.manufacturer = manufacturer;
        this.maxDiscount = maxDiscount;
    }

    public String getName() {
        return this.productName;
    }

    public double getCost() {
        return this.cost;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public int getMaxDiscount() {
        return this.maxDiscount;
    }

    public double getFinalCost() {
        return (1 - ((double) this.maxDiscount / 100)) * this.cost; 
    }

    @Override
    public String toString() {
        String data = String.format("\nProduct Name: %s\nCost: %,.1f\nManufacturer: %s\nDiscount: %s\n",
        this.productName, this.cost, this.manufacturer, this.maxDiscount + "%");
        return data;
    }
}
