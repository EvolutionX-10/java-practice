package bank;

/*
 * Create a Java program that simulates a banking system. Implement a user-defined package called "bank" that contains classes for managing customer accounts. The package should include the following classes:
1. Account: A class representing a bank account with attributes such as account number, balance, and customer details. It should have methods to deposit, withdraw, and display the account balance.
2. Bank: A class representing the bank that holds an array of Account objects. It should have methods to create a new account, close an account, and display the total number of accounts.

Your task is to write the following:
1. Create a user-defined package called "bank" and place the Account and Bank classes within it.
2. Implement the Account class with appropriate attributes, constructors, and methods for depositing, withdrawing, and displaying the account balance. Use appropriate access modifiers for the attributes and methods.
3. Implement the Bank class with methods to create a new account, close an account, and display the total number of accounts. Use appropriate access modifiers to control access to these methods and any necessary attributes.
 */
public class Account {
	int accountNumber;
	double balance;
	String customerName;

	public Account() {
	}

	public Account(int accountNumber, double balance, String customerName) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Insufficient funds");
		} else {
			balance -= amount;
		}
	}

	public void displayBalance() {
		System.out.println("Account number: " + accountNumber);
		System.out.println("Balance: " + balance);
	}
}
