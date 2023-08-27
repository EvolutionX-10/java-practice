package bank;

public class Bank {
	Account[] accounts = new Account[10];
	int totalAccounts = 0;

	public void createAccount(int accountNumber, double balance, String customerName) {
		accounts[totalAccounts] = new Account(accountNumber, balance, customerName);
		totalAccounts++;
	}

	public void closeAccount(int accountNumber) {
		for (int i = 0; i < totalAccounts; i++) {
			if (accounts[i].accountNumber == accountNumber) {
				accounts[i] = accounts[totalAccounts - 1];
				totalAccounts--;
				break;
			}
		}
	}

	public Account getAccount(int accountNumber) {
		for (int i = 0; i < totalAccounts; i++) {
			if (accounts[i].accountNumber == accountNumber) {
				return accounts[i];
			}
		}
		return null;
	}

	public void displayTotalAccounts() {
		System.out.println("Total accounts: " + totalAccounts);
	}

	public static void main(String args[]) {
		Bank bank = new Bank();
		bank.createAccount(1, 1000, "John");
		bank.createAccount(2, 2000, "Jane");
		bank.createAccount(3, 3000, "Jack");
		bank.displayTotalAccounts();
		bank.closeAccount(2);
		bank.displayTotalAccounts();
	}
}
