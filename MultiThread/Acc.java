package MultiThread;

public class Acc {
	int amount = 1000;

	public synchronized void withdraw(int amt) throws InterruptedException {
		System.out.println("Trying to withdraw");
		if (amt > amount) {
			wait();
			Thread.sleep(5000);
		}
		amount -= amt;
		System.out.println("Withdraw complete");
	}

	public synchronized void deposit(int amt) {
		System.out.println("Trying to deposit");
		amount += amt;
		notify();
		System.out.println("Deposit complete");
	}
}
