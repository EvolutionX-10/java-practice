package TA;

import java.util.Date;
import java.util.Calendar;

public class Bank {
	public static void main(String[] args) {
		CurrentAccount.setOverdraftLimit(1000);
		SavingsAccount.setInterestRate(0.05);

		Account account1 = new CurrentAccount("Gopal", 1, 1000, new Date());
		Account account2 = new SavingsAccount("Ram", 2, 2000,
				new Date(new Date().getTime() - 1000 * 60 * 60 * 24 * 365));
		Account account3 = new CurrentAccount("Raj", 3, 3000, new Date());

		account1.withdraw(100);
		account2.withdraw(100);
		account3.withdraw(100);

		account1.withdraw(200);
		account2.withdraw(10);
		account3.withdraw(20);

		account1.deposit(1000);
		account2.deposit(1000);
		account3.deposit(1000);

		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);

		System.out.println("Accounts created the same day:\n");
		Account[] accounts = { account1, account2, account3 };
		printAccountsCreatedSameDay(accounts);
	}

	public static void printAccountsCreatedSameDay(Account[] accounts) {
		Date today = new Date();
		for (Account account : accounts) {
			Calendar calendar1 = Calendar.getInstance();
			calendar1.setTime(today);
			Calendar calendar2 = Calendar.getInstance();
			calendar2.setTime(account.getDate());
			if (calendar1.get(Calendar.YEAR) == calendar2.get(Calendar.YEAR)
					&& calendar1.get(Calendar.DAY_OF_YEAR) == calendar2.get(Calendar.DAY_OF_YEAR)) {
				System.out.println(account);
			}
		}
	}
}
