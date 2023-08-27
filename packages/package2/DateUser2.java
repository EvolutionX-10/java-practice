package packages.package2;

import packages.package1.MyDate;

public class DateUser2 extends MyDate {

	void display() {
		super.showDate();
	}

	public static void main(String args[]) {
		DateUser2 md = new DateUser2();
		md.showDate();
	}
}
