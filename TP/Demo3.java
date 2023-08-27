package TP;

/*
 * Create a thread class which will add the elements of the 1D array from
 * start_index to end - index and stores the result in data member SUM.
 * Assume a 1D array stores 100 elements. Divide this array in 4 equal
 * parts. Create 4 threads to add each of the sub array. The final addition
 * of array will be displayed by main( ).
 */

public class Demo3 {
	public static void main(String[] args) {
		int[] array = new int[100];
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}

		Adder[] threads = new Adder[4];

		for (int i = 0; i < threads.length; i++) {
			threads[i] = (new Adder(array, i * 25, (i + 1) * 25));
			threads[i].start();
		}

		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
				sum += (threads[i]).getSum();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Sum: " + sum);
	}
}

class Adder extends Thread {
	private int[] array;
	private int start;
	private int end;
	private int sum;

	public Adder(int[] array, int start, int end) {
		this.array = array;
		this.start = start;
		this.end = end;
	}

	public int getSum() {
		return sum;
	}

	@Override
	public void run() {
		for (int i = start; i < end; i++) {
			sum += array[i];
		}
	}
}