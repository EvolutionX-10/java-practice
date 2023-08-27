package GC;

public class Q3 {
	public static void main(String[] args) {
		IEEENumber number = new IEEENumber(0, 11111111, 00000000000000000000000L);
		System.out.println(number.isInfinity());
	}
}

class IEEENumber {
	int sign;
	int exponent;
	long mantissa;

	public IEEENumber(int sign, int exponent, long mantissa) {
		this.sign = sign;
		this.exponent = exponent;
		this.mantissa = mantissa;
	}

	public boolean isInfinity() {
		return exponent == 11111111 && mantissa == 00000000000000000000000L;
	}

	@Override
	public String toString() {
		return String.format("%d %d %d", sign, exponent, mantissa);
	}
}