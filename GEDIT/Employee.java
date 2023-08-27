public class Employee {
	public String name;
	public int id;
	public int salary;
	
	public Employee(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public String toString() {
		return String.format("Name: %s\nID: %d\nSalary: %d\n", this.name, this.id, this.salary);
	}
}
