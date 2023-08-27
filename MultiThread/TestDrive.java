package MultiThread;

public class TestDrive {
	public static void main(String[] args) {

		Acc ac = new Acc();

		MyThread t1 = new MyThread(ac);
		MyThread2 t2 = new MyThread2(ac);

		t2.start();
		t1.start();
	}
}
