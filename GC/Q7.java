package GC;

public class Q7 {
	public static void main(String[] args) {
		Month m1 = new Month("January", 1);
		Month m2 = new Month(2, "February");
		m1.display();
		m2.display();
		System.out.println(m1.isEqual(m2));
	}
}

/*
 * Create a class Month which will have data member as Month_Name and
 * Month_Number. Create proper constructors to demonstrate constructor
 * overloading and a Display method to display Month_Name and Month_Number. Design a method
 * &quot;EQUAL&quot; in
 * the class month which will check if the Month_Name and Month_Number is same
 * in 2 month
 * objects.
 */

class Month {
	String monthName;
	int monthNumber;

	public Month(String monthName, int monthNumber) {
		this.monthName = monthName;
		this.monthNumber = monthNumber;
	}

	public Month(int monthNumber, String monthName) {
		this(monthName, monthNumber);
	}

	public void display() {
		System.out.println("Month Name: " + monthName);
		System.out.println("Month Number: " + monthNumber);
	}

	public boolean isEqual(Month other) {
		return this.monthName.equals(other.monthName) && this.monthNumber == other.monthNumber;
	}
}
