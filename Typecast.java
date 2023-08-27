public class Typecast {
	// Try typecasting (in an assignment statement) for each pair of datatypes and
	// find the output. (Few example pairs :
	// int-char,float-long,short-byte,int-boolean)
	public static void main(String[] args) {
		int a = 65;
		char b = (char) a;
		System.out.println(b);
		float c = 10.0f;
		long d = (long) c;
		System.out.println(d);
		short e = 11;
		byte f = (byte) e;
		System.out.println(f);
		double g = 12.5;
		int h = (int) g;
		System.out.println(h);
	}
}
