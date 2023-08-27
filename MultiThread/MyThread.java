package MultiThread;

public class MyThread extends Thread {
	Acc ac;
	public MyThread(Acc ac) {
		this.ac = ac;
	}
	public void run() {
		try {
			ac.withdraw(100000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
