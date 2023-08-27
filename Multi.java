public class Multi {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 11, 12 };

		// create 4 arrays out of arr, each with n/4 elements
		int[] arr1 = new int[arr.length / 4];
		int[] arr2 = new int[arr.length / 4];
		int[] arr3 = new int[arr.length / 4];
		int[] arr4 = new int[arr.length / 4];

		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length / 4) {
				arr1[i] = arr[i];
			} else if (i < arr.length / 2) {
				arr2[i - arr.length / 4] = arr[i];
			} else if (i < 3 * arr.length / 4) {
				arr3[i - arr.length / 2] = arr[i];
			} else {
				arr4[i - 3 * arr.length / 4] = arr[i];
			}
		}

		AdderThread t1 = new AdderThread(arr1);
		AdderThread t2 = new AdderThread(arr2);
		AdderThread t3 = new AdderThread(arr3);
		AdderThread t4 = new AdderThread(arr4);

		t1.setPriority(10);
		t2.setPriority(9);
		t3.setPriority(8);
		t4.setPriority(7);

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}

		System.out.println("Sum: " + (t1.sum + t2.sum + t3.sum + t4.sum));
	}
}

class AdderThread extends Thread {
	public int[] arr;
	public int sum = 0;

	public AdderThread(int[] arr) {
		this.arr = arr;
	}

	public void run() {
		for (int i : this.arr) {
			sum += i;
		}
	}
}