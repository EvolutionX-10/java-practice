package P6;

public class TestDrive {
	public static void main(String[] args) {
		Integer[] a1 = { 1, 2, 3, 4, 5 };
		Double[] a2 = { 1.0, 2.0, 3.0, 4.0, 5.0 };

		SumArray<Integer> s1 = new SumArray<Integer>(a1);
		SumArray<Double> s2 = new SumArray<Double>(a2);

		try {
			if (s1.isEqual(s2)) System.out.println("Sums are equal.");
		} catch (UnmatchedSumException e) {
			System.out.println(e.getMessage());
		}
	}
}
