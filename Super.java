class Parent {
	private int nice = 69;

	public Parent(int x) {
		System.out.println("Called Constructor of Parent!");
	}

	protected int method() {
		System.out.printf("Call method %d!\n", this.nice);
		return this.nice;
	}
}

public class Super extends Parent {
	public Super() {
		super(2);
		System.out.printf("Printing x: %d", super.method());
	}
	public static void main(String... args) {
		
	}
}
