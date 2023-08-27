package packages.package1;

public class MyDate {
	public int dd, mm, yy;

	public MyDate() {}

	public MyDate(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public void showDate() {
		System.out.println(dd + "/" + mm + "/" + yy);
	}
}
