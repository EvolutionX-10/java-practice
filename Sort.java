public class Sort {
	// Write a Java program to sort an array of integers in ascending order.
	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 5, 3 };
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
