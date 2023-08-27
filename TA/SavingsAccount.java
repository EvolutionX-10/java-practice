package TA;

import java.util.Date;

public class SavingsAccount extends Account {
	private static double interestRate;

	public SavingsAccount(String accountHolderName, int accountNumber, double balance, Date date) {
		super(accountHolderName, accountNumber, balance, date);
	}

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		SavingsAccount.interestRate = interestRate;
	}

	@Override
	public void withdraw(double amount) {
		if (amount > getBalance()) {
			throw new IllegalArgumentException("insufficientfund");
		}
		deposit(-amount);
	}

	@Override
	public String toString() {
		return String.format("%s\nInterest Rate: %.2f\n", super.toString(), interestRate);
	}
}
