public class Test {
	public static void main(String[] args) throws InterruptedException {
		ThreadB t1 = new ThreadB();
		t1.start();
		synchronized (t1) {
			t1.wait();
		}
		System.out.println("Total is: " + t1.total);
	}
}

class ThreadB extends Thread {
	int total;
	public void run() {
		synchronized (this) {
			System.out.println("Child starts calculation");
			for (int i = 0; i < 100; i++) {
				total += i;
			}
			System.out.println("Child notifies");
			notify();
		}
	}
}