import java.util.Scanner;

public class Assignment2_2 {
	int err = 0;
	double limit = 0;
	int accNumber = 0;
	double balance = 0;
	double purchases = 0;
	double payments = 0;
	double interest = 0;
	double endBal = 0;
	double minPayment = 0;
	public static void main(String[] args) {
		Scanner file = new Scanner(
				"1234561 623.45 2000.00 402.10 100.00 0" +
						" 3333338 10 100 350 0 1" +
						" 2333337 75 100 50 80 0" +
						" 3333337 10 100 350 0 0" +
						" 6543211 600 500 200 0 0");

		Assignment2_2[] arr = new Assignment2_2[5];

		for (int i = 0; i < 5; i++) {
			arr[i] = new Assignment2_2();
			arr[i].accNumber = file.nextInt();
			arr[i].balance = file.nextDouble();
			arr[i].limit = file.nextDouble();
			arr[i].purchases = file.nextDouble();
			arr[i].payments = file.nextDouble();
			arr[i].err = file.nextInt();
		}
		file.close();

		for (int i = 0; i < 5; i++) {
			if (!checkAccNumber(arr[i].accNumber)) {
				System.out.println("Invalid account number\n\n");
			}

			if (arr[i].err == 1) {
				System.out.println("Error: Your account was not processed\n\n");
			}
			arr[i].interest = getInterest(arr[i].balance, arr[i].payments);
			arr[i].endBal = getEndBal(arr[i].balance, arr[i].interest, arr[i].purchases, arr[i].payments);
			arr[i].minPayment = getMinPayment(arr[i].limit, arr[i].endBal);

			print(arr[i].balance, arr[i].purchases, arr[i].payments, arr[i].interest,
					arr[i].endBal, arr[i].minPayment);
		}

	}

	public static boolean checkAccNumber(int accNumber) {
		if (accNumber < 1000000 || accNumber > 9999999) {
			return false;
		}
		int sum = 0;
		for (int i = 0; i < 6; i++) {
			sum += accNumber % 10;
			accNumber /= 10;
		}
		if (sum % 10 != accNumber) {
			return false;
		}
		return true;
	}

	public static double getInterest(double bal, double payments) {
		if (bal > payments) {
			return (bal - payments) * 0.18;
		}
		return 0;
	}

	public static double getMinPayment(double limit, double endBal) {
		if (limit > endBal)
			return endBal * 0.1 > 10 ? endBal * 0.1 : 10;
		else
			return limit - endBal;
	}

	public static double getEndBal(double bal, double interest, double purchases, double payments) {
		return bal + interest + purchases - payments;
	}

	public static void print(double bal, double purchases, double payments, double interest, double endBal,
			double minPayment) {
		System.out.printf("Starting Balance: $%.2f\n", bal);
		System.out.printf("Total Purchases: $%.2f\n", purchases);
		System.out.printf("Total Payments: $%.2f\n", payments);
		System.out.printf("Interest: $%.2f\n", interest);
		System.out.printf("Ending Balance: $%.2f\n", endBal);
		System.out.printf("Minimum Payment: $%.2f\n\n\n", minPayment);
	}
}

class Account {
	int err = 0;
	double limit = 0;
	int accNumber = 0;
	double balance = 0;
	double purchases = 0;
	double payments = 0;
	double interest = 0;
	double endBal = 0;
	double minPayment = 0;

	public Account(int accountNumber, double balance2, double creditLimit, Transaction[] transactions,
			int transactionCount) {
		accNumber = accountNumber;
		balance = balance2;
		limit = creditLimit;
		for (int i = 0; i < transactionCount; i++) {
			if (transactions[i].type == 1) {
				purchases += transactions[i].amount;
			} else if (transactions[i].type == 2) {
				payments += transactions[i].amount;
			}
		}
	}
}