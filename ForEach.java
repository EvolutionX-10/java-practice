public class ForEach {
	public static void main(String[] args) {
		String[] carsStrings = { "BMW", "Ford", "Ferarri" };
		for (String car : carsStrings) {
			System.out.println(car);
		}
		System.out.println(carsStrings.length);
	}
}
