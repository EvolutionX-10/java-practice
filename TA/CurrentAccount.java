package TA;

import java.util.Date;

public class CurrentAccount extends Account {
	private static double overdraftLimit;

	public CurrentAccount(String accountHolderName, int accountNumber, double balance, Date date) {
		super(accountHolderName, accountNumber, balance, date);
	}

	public static double getOverdraftLimit() {
		return overdraftLimit;
	}

	public static void setOverdraftLimit(double overdraftLimit) {
		CurrentAccount.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw(double amount) {
		if (amount > getBalance() + overdraftLimit) {
			throw new IllegalArgumentException("insufficientfund");
		}
		deposit(-amount);
	}

	@Override
	public String toString() {
		return String.format("%s\nOverdraft Limit: %.2f\n", super.toString(), overdraftLimit);
	}
}
