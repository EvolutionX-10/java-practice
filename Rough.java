public class Rough {
	public static void main(String[] args) {
		Generic<String, Integer> g = new Generic<>("Hello", 1);
		System.out.println(g.typeT());
		System.out.println(g.typeK());
	}
}

class Generic<T, K> {
	T t;
	K k;

	public Generic(T t, K k) {
		this.t = t;
		this.k = k;
	}

	public T getT() {
		return t;
	}

	public K getK() {
		return k;
	}

	public void setT(T t) {
		this.t = t;
	}

	public void setK(K k) {
		this.k = k;
	}

	public String typeT() {
		return t.getClass().getSimpleName();
	}

	public String typeK() {
		return k.getClass().getSimpleName();
	}
}