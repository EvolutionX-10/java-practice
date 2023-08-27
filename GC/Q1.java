package GC;

public class Q1 {
	public static void main(String[] args) {
		Student[] students = new Student[10];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student(i + 1, "Student " + (char) (i + 65), (i + 1) * 50);
		}
		for (Student student : students) {
			System.out.println(student + "Percentage: " + student.findPercentage() + "%\n");
		}
	}
}

class Student {
	int rollNo;
	String name;
	int totalMarks;

	public Student(int rollNo, String name, int totalMarks) {
		this.rollNo = rollNo;
		this.name = name;
		this.totalMarks = totalMarks;
	}

	public double findPercentage() {
		return totalMarks / 5.0;
	}

	@Override
	public String toString() {
		return String.format("Student: %s\nRoll No.: %d\nTotal Marks: %d\n", name, rollNo, totalMarks);
	}
}