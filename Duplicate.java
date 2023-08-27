//! shitty code, don't write!
public class Duplicate {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 4, 5 };
		// remove duplicates from array
		int[] arr2 = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr2[j] = arr[i];
				j++;
			}
		}
		arr2[j] = arr[arr.length - 1];
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		// remove 0
		int[] arr3 = new int[j + 1];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr2[i];
		}
		System.out.println();
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}
}
