package GC;

import java.time.*;

public class Q8 {
	public static void main(String[] args) {
		// create 3 persons
		Person p1 = new Person("Person 1", 5.9, new DateOfBirth(10, 2, 2005));
		Person p2 = new Person("Person 2", 5.6, new DateOfBirth(12, 1, 2004));
		Person p3 = new Person("Person 3", 5.7, new DateOfBirth(14, 8, 2008));

		// display details of all persons
		p1.display();
		p2.display();
		p3.display();
	}
}

class Person {
	String name;
	double height;
	DateOfBirth dob;

	public Person(String name, double height, DateOfBirth dob) {
		this.name = name;
		this.height = height;
		this.dob = dob;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Height: " + height);
		System.out.println("Date of Birth: " + dob);
		System.out.println("Age: " + calculateAge());
		System.out.println("Is Adult: " + isAdult() + "\n");
	}

	public int calculateAge() {
		return dob.calculateAge();
	}

	public boolean isAdult() {
		return calculateAge() >= 18;
	}
}

class DateOfBirth {
	int day;
	int month;
	int year;

	public DateOfBirth(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int calculateAge() {
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(year, month, day);
		Period p = Period.between(birthday, today);
		return p.getYears();
	}

	@Override
	public String toString() {
		return String.format("%d/%d/%d", day, month, year);
	}
}