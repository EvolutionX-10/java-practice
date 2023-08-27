import java.util.Scanner;

/*
 * Write a Java program that accepts a username as input and performs some validation checks.
 * Implement a user-defined exception called "InvalidUsernameException" that should be thrown if the username contains any special characters or if it is longer than 10 characters.
 * The program should input a username and then validate it. If an invalid username is entered, the program should throw the "InvalidUsernameException" and display an error message.
 * Finally, if the username is valid, display a success message. Write appropriate exception handling code.
 * Your task is to write the following:
 * 1. Define the "InvalidUsernameException" class that extends the appropriate Java exception class.
 * 2. Implement the main method in a separate class to input and perform the necessary validation checks.
 * 3. Within the main method, input a username.
 * 4. Implement exception handling to catch the "InvalidUsernameException" and display an appropriate error message if the username is invalid.
 * 5. If the username is valid (i.e., contains only alphanumeric characters and is 10 characters or less), display a success message.
 */

public class Username {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter a username: ");
			String username = scanner.nextLine();

			if (username.length() > 10) {
				throw new InvalidUsernameException("Username must be 10 characters or less");
			} else if (!username.matches("[a-zA-Z0-9]+")) {
				throw new InvalidUsernameException("Username must contain only alphanumeric characters");
			} else {
				System.out.println("Username is valid");
			}
		} catch (InvalidUsernameException e) {
			System.out.println(e);
		} finally {
			scanner.close();
		}
	}
}

class InvalidUsernameException extends Exception {
	public InvalidUsernameException(String message) {
		super(message);
	}
}
