public class SecondBig {
	// Write a Java program to find the second largest element in an integer array.
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int max = arr[0];
		int secondMax = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax) {
				secondMax = arr[i];
			}
		}
		System.out.println(secondMax);
	}
}
