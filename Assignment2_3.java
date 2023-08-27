import java.util.Scanner;

public class Assignment2_3 {
	public static void main(String[] args) {	
		Scanner file = new Scanner(" 9 " +
				"1111116 500.00 1000.00 " +
				"1111116 1 100.00 " +
				"1111116 1 200.00 " +
				"1111116 2 50.00 " +
				"1111116 1 100.00 " +
				"1111116 2 150.00 " +
				"1111116 1 400.00 " +
				"-1 -1 -1 " +
				"9999994 8.0 1000.00 " +
				"-1 -1 -1 " +
				"9876549 100.0 5000.00 " +
				"9876549 2 150.0 " +
				"-1 -1 -1 " +
				"1234561 623.45 2000.00 " +
				"1234561 1 12.84 " +
				"1234561 2 100.00 " +
				"1234561 1 389.26 " +
				"1234561 1 500.00 " +
				"-1 -1 -1 " +
				"2222222 200.00 800.00 " +
				"2222222 2 150.00 " +
				"-1 -1 -1 " +
				"7186042 10.00 1000.00 " +
				"7186042 1 200.00 " +
				"7186042 1 150.00 " +
				"-1 -1 -1 " +
				"333335 10.00 100.00 " +
				"333335 1 45.00 " +
				"333335 2 55.00 " +
				"333335 1 -55.00 " +
				"333335 1 250.00 " +
				"-1 -1 -1 " +
				"13333338 10.00 100.00 " +
				"-1 -1 -1 " +
				"2134561 623.45 2000.00 " +
				"8134561 5 200.00 " +
				"2134561 1 -99.99 " +
				"-1 -1 -1");

		Account[] arr = new Account[file.nextInt()];

		// read the data
		// first line is header record
		// it indicates account number, balance, and credit limit
		// next lines are transaction records
		// each transaction record indicates account number, transaction type, amount
		// account number should match the header record
		// transaction type 1 is purchase, 2 is payment
		// -1 -1 -1 in the transaction record indicates end of transaction records
		// error should be printed for invalid account number and invalid transaction type (not 1 or 2)
		// and invalid transaction amount (negative amount)
		// example for error line is
		// Error in line #4 - non-matching account number 8234561
		// Error in line #4 - invalid transaction code 4
		// now loop over the accounts, calculate totals and print the report for each account

		// read the header record and transaction record inside loop and fill array
		for (int i = 0; i < arr.length; i++) {
			int accountNumber = file.nextInt();
			double balance = file.nextDouble();
			double creditLimit = file.nextDouble();

			// read the transaction records
			// each transaction record indicates account number, transaction type, amount
			// account number should match the header record
			// transaction type 1 is purchase, 2 is payment
			// -1 -1 -1 in the transaction record indicates end of transaction records
			// error should be printed for invalid account number and invalid transaction type (not 1 or 2)
			// and invalid transaction amount (negative amount)
			// example for error line is
			// Error in line #4 - non-matching account number 8234561
			// Error in line #4 - invalid transaction code 4
			// now loop over the accounts, calculate totals and print the report for each account
			Transaction[] transactions = new Transaction[100];
			int transactionCount = 0;
			while (true) {
				int transactionAccountNumber = file.nextInt();
				int transactionType = file.nextInt();
				double transactionAmount = file.nextDouble();

				if (transactionAccountNumber == -1 && transactionType == -1 && transactionAmount == -1) {
					break;
				}

				if (transactionAccountNumber != accountNumber) {
					System.out.println("Error in line #" + (i + 2) + " - non-matching account number " + transactionAccountNumber);
					continue;
				}

				if (transactionType != 1 && transactionType != 2) {
					System.out.println("Error in line #" + (i + 2) + " - invalid transaction code " + transactionType);
					continue;
				}

				if (transactionAmount < 0) {
					System.out.println("Error in line #" + (i + 2) + " - invalid transaction amount " + transactionAmount);
					continue;
				}

				transactions[transactionCount++] = new Transaction(transactionAccountNumber, transactionType, transactionAmount);
			}
			System.out.println(transactions[0].accountNumber);
			
			arr[i] = new Account(accountNumber, balance, creditLimit, transactions, transactionCount);

			// do the calculation
			// calculate total purchases, total payments, and new balance
			System.out.println(arr[i].payments);

			arr[i].interest = Assignment2_2.getInterest(balance, arr[i].payments);
			arr[i].minPayment = Assignment2_2.getMinPayment(creditLimit, transactionCount);
			Assignment2_2.print(balance, balance, creditLimit, i, transactionCount, i);
		}
		file.close();
	}
}

class Transaction {
	int accountNumber;
	int transactionType;
	double transactionAmount;
	public int type;
	public double amount;

	public Transaction(int accountNumber, int transactionType, double transactionAmount) {
		this.accountNumber = accountNumber;
		this.transactionType = transactionType;
		this.transactionAmount = transactionAmount;
	}
}