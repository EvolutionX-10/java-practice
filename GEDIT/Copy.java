import java.io.*;

public class Copy {
	public static void main(String[] args) {
		FileReader f1 = null;
		FileWriter f2 = null;
		
		try {
			f1 = new FileReader("source.txt");
			f2 = new FileWriter("target.txt");
			
			int c = 0;
			while ((c = f1.read()) != -1) {
				f2.write(c);
			}
			f2.close();
		} catch (IOException e) {
			// bruh
		}
	}
}
