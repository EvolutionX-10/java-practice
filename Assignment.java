import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int accNumber, err;
		double bal, limit, purchases, payments;

		accNumber = console.nextInt();
		bal = console.nextDouble();
		limit = console.nextDouble();
		purchases = console.nextDouble();
		payments = console.nextDouble();
		err = console.nextInt();
		console.close();

		if (!checkAccNumber(accNumber)) {
			System.out.println("Invalid account number");
			return;
		}

		if (err == 1) {
			System.out.println("Error: Your account was not processed");
			return;
		}

		double interest = 0;
		if (bal > payments) {
			interest = (bal - payments) * 0.18;
		}
		double endBal = bal + interest + purchases - payments;
		double minPayment = 0;
		if (limit > endBal)
			minPayment = endBal * 0.1 > 10 ? endBal * 0.1 : 10;
		else
			minPayment = limit - endBal;

		System.out.printf("Account number: %d\n", accNumber);
		System.out.printf("Starting Balance: $%.2f\n", bal);
		System.out.printf("Total Purchases: $%.2f\n", purchases);
		System.out.printf("Total Payments: $%.2f\n", payments);
		System.out.printf("Interest: $%.2f\n", interest);
		System.out.printf("Ending Balance: $%.2f\n", endBal);
		System.out.printf("Minimum Payment: $%.2f\n", minPayment);

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
}
