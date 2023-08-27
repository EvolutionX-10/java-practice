package GC;

public class Q2 {
	public static void main(String[] args) {
		CustomInteger ci1 = new CustomInteger(10);
		CustomInteger ci2 = new CustomInteger(20);
		CustomDouble cd1 = new CustomDouble(10.5);
		CustomDouble cd2 = new CustomDouble(20.5);
		System.out.println(ci1.add(ci2));
		System.out.println(ci1.add(cd1));
		System.out.println(cd1.add(ci1));
		System.out.println(cd1.add(cd2));
	}
}

class CustomInteger {
	int value;

	public CustomInteger(int value) {
		this.value = value;
	}

	public CustomInteger add(CustomInteger other) {
		return new CustomInteger(this.value + other.value);
	}

	public CustomDouble add(CustomDouble other) {
		return new CustomDouble(this.value + other.value);
	}

	@Override
	public String toString() {
		return String.format("CustomInteger: %d", value);
	}
}

class CustomDouble {
	double value;

	public CustomDouble(double value) {
		this.value = value;
	}

	public CustomDouble add(CustomInteger other) {
		return new CustomDouble(this.value + other.value);
	}

	public CustomDouble add(CustomDouble other) {
		return new CustomDouble(this.value + other.value);
	}

	@Override
	public String toString() {
		return String.format("CustomDouble: %.1f", value);
	}
}