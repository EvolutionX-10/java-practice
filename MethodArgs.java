public class MethodArgs {
	public static void main(String[] args) {
		MethodArgs obj = new MethodArgs();
		obj.sayHi("Kritank");
		System.out.println(obj.Lol(2, 3, 4));
	}

	/* Method Overloading */
	int Lol(int a, int b) {
		return a + b;
	}

	int Lol(int a, int b, int c) {
		return a + b + c;
	}

	public void sayHi(String name) {
		System.out.println("Hello " + name);
	}
}
