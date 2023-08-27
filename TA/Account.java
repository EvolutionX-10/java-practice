package TA;

import java.util.Date;

public abstract class Account {
	private String accountHolderName;
	private double balance;
	private int accountNumber;
	private Date date;

	public Account(String accountHolderName, int accountNumber, double balance, Date date) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.date = date;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public abstract void withdraw(double amount);

	@Override
	public String toString() {
		return String.format("Account Number: %d\nAccount Holder Name: %s\nBalance: %.2f\nDate: %s", accountNumber,
				accountHolderName, balance, date);
	}
}
