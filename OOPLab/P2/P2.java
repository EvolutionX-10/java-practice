// package P2;

// import java.util.Scanner;

// public class P2 {
//     public static void main(String[] args) {
//         final OnlineShoppingPortal portal = new OnlineShoppingPortal();
//         portal.calculateDiscount(portal.promptCustomerType());
//         System.out.println(String.format("Type: %s\nCart Value: %.1f\nDiscounted Value: %.1f", portal.type,
//                 portal.amount, portal.endAmount));
//     }
// }

// class OnlineShoppingPortal {
//     static String codeForRegular = "GET10";
//     double amount;
//     double endAmount;
//     String code;
//     CustomerType type;
//     Scanner console;

//     public OnlineShoppingPortal() {
//         console = new Scanner(System.in);
//     }

//     public CustomerType promptCustomerType() {
//         int type;
//         System.out.println("Enter your user type\n1. Regular\n2. Prime");

//         type = console.nextInt();
//         this.type = type == 1 ? CustomerType.REGULAR : CustomerType.PRIME;
//         return this.type;
//     }

//     public void calculateDiscount(CustomerType type) {
//         System.out.print("Please enter amount to be paid: ");
//         this.amount = console.nextDouble();

//         if (type == CustomerType.REGULAR) {
//             System.out.print("Enter Promo CODE: ");
//             this.code = console.next();

//             if (this.code.equals(codeForRegular)) {
//                 this.endAmount = this.amount < 500 ? this.amount - 10 : this.amount * 0.9;
//             } else
//                 this.endAmount = this.amount;
//         } else {
//             this.endAmount = this.amount > 1000 ? this.amount * 0.7 : this.amount * 0.8;
//         }
//     }
// }

// enum CustomerType {
//     REGULAR,
//     PRIME
// }