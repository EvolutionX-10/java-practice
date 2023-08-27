package MultiThread;

public class MyThread2 extends Thread {
	Acc ac;
	public MyThread2(Acc ac) {
		this.ac = ac;
	}
	@Override
	public void run() {
		this.ac.deposit(100000);
	}
}
