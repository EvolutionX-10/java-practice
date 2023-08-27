public class MinMax {
	// Write a Java program to find the maximum and minimum elements in an integer
	// array.
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int min = arr[0];
		int max = arr[0];
		for (int i : arr) {
			min = (i < min) ? i : min;
			max = (i > max) ? i : max;
		}
		System.out.println("Min: " + min + " Max: " + max);
	}
}
