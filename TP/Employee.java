package TP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * Consider a comma separated file "Employe.txt" with the information as
 * Employee_Number, Employee_Name, Designation, Salary.
 * Create a class employee to store the information of all employees.
 * Design a method Increment( ) which will provide increment as follows :
 * (a) If the designation is Manager 30% increment will be given.
 * (b) If the designation is Salesman 20% increment will be given.
 * (c) If the designation is Clerk 10% increment will be given.
 * Write the Employee Details along with updated Salary in the new file
 * "SalaryIncremented.txt"
 */
public class Employee {
	private int employeeNumber;
	private String employeeName;
	private String designation;
	private double salary;

	public Employee(int employeeNumber, String employeeName, String designation, double salary) {
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.designation = designation;
		this.salary = salary;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

	public void increment() {
		if (designation.equals("Manager")) {
			salary *= 1.3;
		} else if (designation.equals("Salesman")) {
			salary *= 1.2;
		} else if (designation.equals("Clerk")) {
			salary *= 1.1;
		}
	}

	@Override
	public String toString() {
		return employeeNumber + "," + employeeName + "," + designation + "," + salary;
	}

	public static void main(String[] args) {

		BufferedReader br = null;
		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader("TP/Employe.txt");
			br = new BufferedReader(fr);
			fw = new FileWriter("TP/SalaryIncremented.txt");

			String line;
			while ((line = br.readLine()) != null) {
				String[] tokens = line.split(",");
				Employee e = new Employee(Integer.parseInt(tokens[0]), tokens[1], tokens[2],
						Double.parseDouble(tokens[3]));
				e.increment();
				fw.write(e.toString() + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
				if (fw != null)
					fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
