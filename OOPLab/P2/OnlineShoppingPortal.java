package P2;

public class OnlineShoppingPortal {
    public static void main(String[] args) {
        String[] itemList = { "Laptop", "Bag", "Mouse" };

        double cartValue = 800;
        String category = "REGULAR";
        String code = "GET20";

        ShoppingCart sc = new ShoppingCart(itemList, cartValue);

        Customer c1 = new Customer(category, sc);

        if (c1.category.equals("PRIME")) {
            c1.cart.discountedCartValue = DiscountCalculator.checkout(c1.cart.cartValue);
        } else
            c1.cart.discountedCartValue = DiscountCalculator.checkout(c1.cart.cartValue, code);

        c1.display();
    }
}

class ShoppingCart {
    String[] items;
    double cartValue;
    double discountedCartValue;

    public ShoppingCart(String[] items, double cartValue) {
        this.items = items;
        this.cartValue = cartValue;
    }
}

class Customer {
    ShoppingCart cart;
    String category;

    public Customer(String category, ShoppingCart cart) {
        this.cart = cart;
        if (!category.equals("PRIME") && !category.equals("REGULAR")) {
            System.out.println("Invalid Customer Type");
            System.exit(1);
        }
        this.category = category;
    }

    public void display() {
        System.out.println(this);
    }

    public String toString() {
        String summary = "\n\t\tSUMMARY\n\nITEMS\n";
        for (String item : this.cart.items) {
            summary += item + "\n";
        }
        summary += String.format("\nCustomer Type: %s\nAmount: %.1f\nDiscount: %.1f\nAmount to be paid: %.1f",
                this.category, this.cart.cartValue,
                this.cart.cartValue - this.cart.discountedCartValue, this.cart.discountedCartValue);

        return summary;
    }
}

class DiscountCalculator {
    static String DISCOUNT_CODE = "GET10";

    // PRIME
    static double checkout(double value) {
        return value * (value > 1000 ? 0.7 : 0.8);
    }

    // REGULAR
    static double checkout(double value, String code) {
        if (code.equals(DISCOUNT_CODE)) {
            return value < 500 ? value - 10 : value * 0.9;
        }
        return value - 10;
    }
}