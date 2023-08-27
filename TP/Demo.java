package TP;

class Month {
	String Month_Name;
	int Month_Number;

	public Month(String Month_Name, int Month_Number) {
		this(Month_Name);
		this.Month_Number = Month_Number;
	}

	public Month(String Month_Name) {
		this.Month_Name = Month_Name;
	}

	public Month() {
		this("Jan", 1);
	}

	public boolean equals(Month other) {
		return this.Month_Name.equals(other.Month_Name) && this.Month_Number == other.Month_Number;
	}
}

// Create a class Demo with main() to demonstrate all functionalities of month
// class

public class Demo {
	public static void main(String[] args) {
		Month m1 = new Month("Jan", 1);
		Month m2 = new Month("Jan", 1);
		Month m3 = new Month("Feb", 2);
		Month m4 = new Month("Feb", 2);
		Month m5 = new Month("Mar", 3);
		Month m6 = new Month("Mar", 3);
		Month m7 = new Month("Apr", 4);
		Month m8 = new Month("Apr", 4);
		Month m9 = new Month("May", 5);
		Month m10 = new Month("May", 5);
		Month m11 = new Month("Jun", 6);
		Month m12 = new Month("Jun", 6);

		System.out.println("m1 == m2: " + m1.equals(m2));
		System.out.println("m3 == m4: " + m3.equals(m4));
		System.out.println("m5 == m6: " + m5.equals(m6));
		System.out.println("m7 == m8: " + m7.equals(m8));
		System.out.println("m9 == m10: " + m9.equals(m10));
		System.out.println("m11 == m12: " + m11.equals(m12));
	}
}