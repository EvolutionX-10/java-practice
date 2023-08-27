public class Index {
	// Write a Java program to find the index of an element in an integer array.
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int target = 3;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println(i);
			}
		}
	}
}
