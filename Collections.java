import java.util.*;

public class Collections {

	public static double sum(List<? extends Number> numberlist) {
		double sum = 0.0;
		for (Number n : numberlist)
			sum += n.doubleValue();
		return sum;
	}

	public static void main(String args[]) {
		List<Integer> integerList = Arrays.asList(1, 2, 3);
		System.out.println("sum = " + sum(integerList));

		List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5);
		System.out.println("sum = " + sum(doubleList));

		ArrayList<String> a = new ArrayList<>(5);
		a.add("abc");
		System.out.println(a.size());
	}
}