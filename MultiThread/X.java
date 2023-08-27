package MultiThread;

public class X implements Runnable {
	public static void main(String[] args) {
		Thread t1 = new Thread(new X());
		t1.start();
	}

	@Override
	public void run() {
		System.out.println("lol");
	}
}
