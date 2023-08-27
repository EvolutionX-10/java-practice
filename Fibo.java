public class Fibo {
	public static void main(String[] args) {
		// print 10 fibonacci numbers
		for (int i = 0; i < 10; i++) {
			System.out.println(fibo(i));
		}
	}
	public static int fibo(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return fibo(n - 1) + fibo(n - 2);
	}
}
