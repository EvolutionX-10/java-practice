public class ArrayEquality {
	// Write a Java program to check whether two arrays are equal or not.
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 3, 4, 5 };
		boolean isEqual = true;
		if (arr.length != arr2.length) {
			isEqual = false;
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != arr2[i]) {
					isEqual = false;
					break;
				}
			}
		}
		System.out.println(isEqual);
	}
}
