public class VehicleNumber {
	public static void main(String[] args) {
		String vehicleNumber = "MH-31-A-9999";
		String[] parts = vehicleNumber.split("-");
		int number = Integer.parseInt(parts[3]);
		number++;
		if (number > 9999) {
			number = 1;
			char c = parts[2].charAt(0);
			c++;
			if (c > 'Z') {
				c = 'A';
				int n = Integer.parseInt(parts[1]);
				n++;
				if (n > 99) {
					n = 1;
				}
				parts[1] = String.format("%02d", n);
			}
			parts[2] = c + "";
		}
		parts[3] = String.format("%04d", number);
		System.out.println(String.join("-", parts));
	}

}
