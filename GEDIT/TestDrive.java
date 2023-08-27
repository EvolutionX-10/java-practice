import java.util.*;
import java.io.*;

public class TestDrive {
	public static void main(String[] args) {
		LinkedList<Student> l = new LinkedList<Student>();
		FileReader fr = null;
		BufferedReader b = null;
		try {
			fr = new FileReader("data.txt");
			b = new BufferedReader(fr);

			String temp = null;
			while ((temp = b.readLine()) != null) {
				String[] data = temp.split(" ");
				l.add(new Student(Integer.valueOf(data[0]), data[1]));
			}
		} catch (IOException e) {

		}

		l.add(new Student(1, "Adiba"));
		l.add(new Student(2, "Akshata"));

		l.sort(new Sorter());
		System.out.println(l);
	}
}

class Sorter implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return s1.roll - s2.roll;
	}
}
