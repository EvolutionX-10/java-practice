package P7;

import java.util.Comparator;

public class Sorter {
    public static SortWithPrice priceSorter() {
        return new SortWithPrice();
    }
    public static SortWithManufacturer manufacturerSorter() {
        return new SortWithManufacturer();
    }
}

class SortWithPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getCost() == o2.getCost()) return 0;
        else if (o1.getCost() > o2.getCost()) return 1;
        return -1;
    }
}

class SortWithManufacturer implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getManufacturer().compareTo(o2.getManufacturer()); 
    }
}