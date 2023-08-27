package P1;

public class ComplexNumber {
	private double real;
	private double imaginary;

	public ComplexNumber() {
	}

	public ComplexNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public ComplexNumber setReal(double real) {
		this.real = real;
		return this;
	}

	public ComplexNumber setImaginary(double imaginary) {
		this.imaginary = imaginary;
		return this;
	}

	public double getReal() {
		return this.real;
	}

	public double getImaginary() {
		return this.imaginary;
	}

	public ComplexNumber add(ComplexNumber other) {
		if (this.real < -100000.0 || this.real > 100000.0 || this.imaginary < -100000.0 || this.imaginary > 100000.0
				|| other.real < -100000.0 || other.real > 100000.0 || other.imaginary < -100000.0
				|| other.imaginary > 100000.0) {
			System.out.println("The input is invalid");
			System.exit(1);
		}
		return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
	}

	public ComplexNumber multiply(ComplexNumber other) {
		if (this.real < -100000.0 || this.real > 100000.0 || this.imaginary < -100000.0 || this.imaginary > 100000.0
				|| other.real < -100000.0 || other.real > 100000.0 || other.imaginary < -100000.0
				|| other.imaginary > 100000.0) {
			System.out.println("The input is invalid");
			System.exit(1);
		}
		return new ComplexNumber(this.real * other.real - this.imaginary * other.imaginary,
				this.real * other.imaginary + this.imaginary * other.real);
	}

	public String toString() {
		return String.format("%.2f + %.2fi", this.real, this.imaginary);
	}

}
