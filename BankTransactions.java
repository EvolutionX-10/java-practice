import bank.*;

/*

In the main class (outside the "bank" package), create a Bank object and demonstrate the functionality of the bank package by performing the following tasks:
- Create a new account.
- Deposit some amount into the account.
- Display the account balance.
- Withdraw a certain amount from the account.
- Display the updated account balance.
- Close the account.
- Display the total number of accounts in the bank.

*/
public class BankTransactions {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.createAccount(1, 1000, "John");
		bank.createAccount(2, 2000, "Jane");
		bank.createAccount(3, 3000, "Jack");
		bank.displayTotalAccounts();

		bank.Account account = bank.getAccount(2);
		account.deposit(1000);
		account.displayBalance();
		account.withdraw(500);
		account.displayBalance();
		bank.closeAccount(2);
		bank.displayTotalAccounts();
	}
}
