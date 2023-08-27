package TP;

import java.util.ArrayList;
import java.util.Comparator;

/*
 * Create a class Student with data members as student name, roll number
 * and marks of 3 subjects. The data members should be initialized through
 * the constructor. Design a method to calculate percentage and store the result
 * in data member percentage. Store the information of 5 students in ArrayList.
 * Sort the ArrayList in descending order of percentage.
 * Write appropriate main( ) to demonstrate all the functionalities
 */

public class Student {
	private String name;
	private int rollNumber;
	private int[] marks;
	private double percentage;

	public Student(String name, int rollNumber, int[] marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public int[] getMarks() {
		return marks;
	}

	public double getPercentage() {
		return percentage;
	}

	public void calculatePercentage() {
		int total = 0;
		for (int mark : marks) {
			total += mark;
		}
		percentage = total / marks.length;
	}

	@Override
	public String toString() {
		return name + "," + rollNumber + "," + marks[0] + "," + marks[1] + "," + marks[2] + "," + percentage;
	}

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();

		students.add(new Student("John", 1, new int[] { 90, 80, 70 }));
		students.add(new Student("Jane", 2, new int[] { 80, 70, 60 }));
		students.add(new Student("Jack", 3, new int[] { 70, 60, 50 }));
		students.add(new Student("Jill", 4, new int[] { 90, 90, 90 }));

		for (Student student : students) {
			student.calculatePercentage();
		}

		students.sort(new Sorter());

		for (Student student : students) {
			System.out.println(student);
		}
	}
}

class Sorter implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return (int) (s2.getPercentage() - s1.getPercentage());
	}
}