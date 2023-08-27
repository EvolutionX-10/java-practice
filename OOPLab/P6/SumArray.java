package P6;

public class SumArray<T extends Number> {
	protected T[] array;

	public SumArray(T[] array) {
		this.array = array;
	}

	public double addArray() {
		double sum = this.array[0].doubleValue();
		for (int i = 1; i < this.array.length; i++) {
			sum = (Double.valueOf(sum) + Double.valueOf(this.array[i].doubleValue()));
		}

		return Double.valueOf(sum);
	}

	public <K extends Number> boolean isEqual(SumArray<? extends Number> other) throws UnmatchedSumException {
		if (this.addArray() != other.addArray()) {
			throw new UnmatchedSumException("Sums are not equal.");
		}
		return true;
	}
}
