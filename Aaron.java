import java.util.Scanner;

public class Aaron {
	static double FEET_TO_METER = 0.304;

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		double len, width, price;

		System.out.print("Please enter length in feet: ");
		len = obj.nextDouble();
		System.out.print("Please enter width in feet: ");
		width = obj.nextDouble();
		System.out.print("Please enter the price per square meter: ");
		price = obj.nextDouble();

		System.out.println("\n------------OUTPUT------------");
		double lenM, widthM;
		lenM = len * FEET_TO_METER;
		widthM = width * FEET_TO_METER;

		System.out.println(String.format("Length of lot: %f feet which is %f meters", len, lenM));
		System.out.println(String.format("Width of lot: %f feet which is %f meters", width, widthM));
		System.out.println(String.format("Price per square meter: %f", price));

		double area = lenM * widthM;
		double cost = price * area;

		System.out.println(String.format("Area of lot: %f square meters", area));
		System.out.println(String.format("Price of lot: $%f", cost));
		System.out.println("----------------------------------");
		obj.close();
	}
}
