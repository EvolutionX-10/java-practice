import java.util.Scanner;

/*
 * Write a Java program that implements a user-defined exception called "InvalidInputException". The program should input an integer between 1 and 10. If the entered number is outside this range, the program should throw an instance of the "InvalidInputException". Otherwise, it should display a message indicating that the input is valid.
 * Write the code for the program, including the definition of the "InvalidInputException" class.
 * Also, provide an example of how you would use this exception in your program.
 * Remember to handle any exceptions that may be thrown during runtime.
 * Your solution should demonstrate the following:
 * 1. Definition of the "InvalidInputException" class as a subclass of the built-in "Exception" class.
 * 2. Proper usage of try-catch blocks to handle exceptions.
 * 3. Displaying appropriate error messages when an invalid input is detected.
 * 4. Displaying a success message when a valid input is entered.
 * Provide the complete code for your solution, including the main method and any necessary helper methods.
 */

public class IntegerRange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter an integer between 1 and 10: ");
			int input = Integer.parseInt(scanner.nextLine());

			if (input < 1 || input > 10) {
				throw new InvalidInputException("Input must be between 1 and 10");
			} else {
				System.out.println("Input is valid");
			}
		} catch (InvalidInputException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("Input must be an integer");
		} finally {
			scanner.close();
		}
	}
}

class InvalidInputException extends Exception {
	public InvalidInputException(String message) {
		super(message);
	}
}