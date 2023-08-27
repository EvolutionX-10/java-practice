package P1;

public class TestDrive {
	public static void main(String[] args) {
		double r1, i1, r2, i2;
		r1 = 1.5;
		i1 = 4.6;
		r2 = 8000000000.7;
		i2 = 22.4;

		ComplexNumber c1 = new ComplexNumber(r1, i1); // 2 + 5i
		ComplexNumber c2 = new ComplexNumber(r2, i2); // 4 + 6i

		System.out.printf("Addition = %s\n", c1.add(c2));
		System.out.printf("Multiplication = %s\n", c1.multiply(c2));
	}
}
