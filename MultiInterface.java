public class MultiInterface implements InnerMultiInterface, InnerMultiInterface2 {
	@Override
	public void someAbstractMethod() {
		System.out.println("someAbstractMethod");
	}
	@Override
	public void somePublicMethod() {
		System.out.println("somePublicMethod" + kari);
	}
	@Override
	public void somePublicMethod2() {
		System.out.println("somePublicMethod2" + kari2);
	}
	@Override
	public void someAbstractMethod2() {
		System.out.println("someAbstractMethod2");
	}
	public static void main(String[] args) {
		MultiInterface obj = new MultiInterface();
		obj.someAbstractMethod();
		obj.somePublicMethod();
		obj.someAbstractMethod2();
		obj.somePublicMethod2();
	}
}

/**
 * InnerMultiInterface
 */
interface InnerMultiInterface {
	int kari = 0;

	public void somePublicMethod();

	abstract void someAbstractMethod();
}

/**
 * InnerMultiInterface2
 */
interface InnerMultiInterface2 {
	int kari2 = 20;

	public void somePublicMethod2();

	abstract void someAbstractMethod2();
}