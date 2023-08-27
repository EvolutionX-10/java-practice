import java.util.Scanner;

public class Assignment3 {
	public static int sumUsefulYears(int n) {
		return (n * (n + 1)) / 2;
	}

	public static double calFraction(int year, int usefulLife) {
		return (double) (usefulLife - year + 1) / sumUsefulYears(usefulLife);
	}

	public static double calDepreciation(double aquisitionCost, double salvageValue, int usefulLife, int year) {
		return (aquisitionCost - salvageValue) * calFraction(year, usefulLife);
	}

	public static double totalDepreciation(double aquisitionCost, double salvageValue, int usefulLife) {
		double sum = 0;
		for (int i = 1; i <= usefulLife; i++) {
			sum += calDepreciation(aquisitionCost, salvageValue, usefulLife, i);
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		// get input
		System.out.print("Enter the aquisition cost: ");
		double aquisitionCost = console.nextDouble();
		System.out.print("Enter the salvage value: ");
		double salvageValue = console.nextDouble();
		System.out.print("Enter the useful life: ");
		int usefulLife = console.nextInt();
		console.close();

		if (aquisitionCost < 0) {
			System.out.println("Acquisition value cannot be negative");
			return;
		} else if (salvageValue < 0) {
			System.out.println("Salvage value cannot be negative");
			return;
		} else if (usefulLife <= 0) {
			System.out.println("Useful life must be greater than zero");
			return;
		}

		System.out.println("Year\tAnnual\t\tAccumulated\tBook Value\tFraction");
		double total = 0;
		for (int i = 1; i <= usefulLife; i++) {
			total += calDepreciation(aquisitionCost, salvageValue, usefulLife, i);
			System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n", i,
					calDepreciation(aquisitionCost, salvageValue, usefulLife, i), total, aquisitionCost - total,
					calFraction(i, usefulLife));
		}
	}
}
