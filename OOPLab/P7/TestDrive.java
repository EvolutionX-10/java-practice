package P7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestDrive {
    public static BufferedReader br;
    public static FileReader file;

    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<Product>();

        try {
            file = new FileReader("OOPLab/P7/data.txt");
            br = new BufferedReader(file);

            String temp = null;
            while ((temp = br.readLine()) != null) {
                String[] data = temp.split(" ");
                if (data.length < 4)
                    continue;

                list.add(new Product(data[0], Double.valueOf(data[1]), data[2], Integer.valueOf(data[3])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String info = "Menu Options";
        info += "\n1. Display the list of Products";
        info += "\n2. Display the list of Products whose max discount is 50% (with final cost)";
        info += "\n3. Display the list of Products sorted according to Cost";
        info += "\n4. Display the list of Products sorted according to Manufacturer";
        info += "\nEnter your choice: ";

        System.out.print(info);
        Scanner console = new Scanner(System.in);
        int choice = (console.nextInt());

        switch (choice) {
            case 0:
                break;
            case 1:
                System.out.println("\n============ List of Products =============");
                display(list);
                break;
            case 2:
                System.out.println("\n============ List of Products whose max discount is 50% =============");
                displayWithDiscount(list);
                break;
            case 3:
                System.out.println("\n============ List of Products [Sorted with Cost] =============");
                displaySortedWithCost(list);
                break;
            case 4:
                System.out.println("\n============ List of Products [Sorted with Manufacturer] =============");
                displaySortedWithManufacturer(list);
                break;
            default:
                System.out.println("Invalid Choice, Try again!\n");
        }

        System.out.println();
        if (choice != 0)
            main(args);
        console.close();
    }

    static void display(ArrayList<Product> list) {
        Iterator<Product> i = list.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }

    static void displayWithDiscount(ArrayList<Product> list) {
        Iterator<Product> i = list.iterator();
        while (i.hasNext()) {
            Product p = i.next();
            if (p.getMaxDiscount() != 50)
                continue;

            System.out.print(p);
            System.out.printf("Final Cost: %,.2f\n", p.getFinalCost());
        }
    }

    static void displaySortedWithCost(ArrayList<Product> list) {
        list.sort(Sorter.priceSorter());
        display(list);
    }

    static void displaySortedWithManufacturer(ArrayList<Product> list) {
        list.sort(Sorter.manufacturerSorter());
        display(list);
    }
}
