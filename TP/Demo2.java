package TP;
/*
 * Create a class Person with private data members as person's name and
 * date of birth. Create an interface Sports with the method SetName and
 * AverageScore.
 * Create a class Graduate which is derived from Person and Sports. The
 * class Graduate has private data member as CGPA, Year of graduation.
 * Create a constructor and display method in the classes. Create a demo
 * class with main( ) and demonstrate the use of all functions. 7
 */

public class Demo2 {
	public static void main(String[] args) {
		Graduate g = new Graduate("John", "01/01/2000", 9.5, 2020);
		g.display();
		g.SetName("Jane");
		g.AverageScore();
	}
}

class Person {
	private String name;
	private String dob;

	public Person(String name, String dob) {
		this.name = name;
		this.dob = dob;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("DOB: " + dob);
	}

	public String getName() {
		return name;
	}

	public String getDOB() {
		return dob;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDOB(String dob) {
		this.dob = dob;
	}
}

interface Sports {
	public void SetName(String name);

	public void AverageScore();
}

class Graduate extends Person implements Sports {
	private double cgpa;
	private int year;

	public Graduate(String name, String dob, double cgpa, int year) {
		super(name, dob);
		this.cgpa = cgpa;
		this.year = year;
	}

	public void display() {
		super.display();
		System.out.println("CGPA: " + cgpa);
		System.out.println("Year: " + year);
	}

	public void SetName(String name) {
		super.setName(name);
	}

	public void AverageScore() {
		System.out.println("Average Score: " + cgpa);
	}
}
