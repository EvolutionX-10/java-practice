class Inner {
	int x = 34;

	public class In {
		int y = 35;

		public class Out {
			int z = 0;
		}
	}
}

public class Inn {

	public static void main(String[] args) {
		Inner obj = new Inner();
		Inner.In in = obj.new In();
		Inner.In.Out out = in.new Out();
		System.out.println(obj.x + in.y + out.z);
	}
}
