public class Constructor {
	public static void main(String[] args) {
		int x = 5;
		System.out.println("Printing x: " + x);
		Constructor cns = new Constructor();
		cns.meow();
	}

	public Constructor() {
		System.out.println("Lol I was called here!");
	}

	public void meow() {
		System.out.println("Meow");
	}
}
