public class Frequency {
	// Write a Java program to find the frequency of each element in an integer
	// array.
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 2, 5 };
		int[] freq = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			freq[i] = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					freq[i]++;
					arr[j] = -1;
				}
			}
		}
		for (int i = 0; i < freq.length; i++) {
			if (arr[i] != -1) {
				System.out.println(arr[i] + " occurs " + freq[i] + " times");
			}
		}
	}
}
