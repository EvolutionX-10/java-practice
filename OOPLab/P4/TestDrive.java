package P4;

import java.time.LocalDate;

public class TestDrive {
    public static void main(String[] args) {
        User[] userArray = new User[5];

        User manager = new User("ABC", "121", "M", null);

        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = i % 2 == 0
                    ? new StandardUser("Ariadne", "12", "M", manager, "Ari", "Admin").setPassword("pswd")
                    : new CustomUser("Aakhyan", "123", "M", manager, "aakhyan@gmail.com", 100,
                            LocalDate.of(2995, 5, 15)).setPassword("password");
        }

        System.out.print("Female Users: ");
        boolean found = false;
        for (User user : userArray) {
            if (user instanceof StandardUser && user.gender.equals("F")) {
                System.out.println();
                user.printUser();
                found = true;
            }
        }

        if (!found) System.out.println("No records found");
        found = false;

        System.out.print("Custom Users with condition: ");
        for (User user : userArray) {
            if (user instanceof CustomUser && user.createdDate.isBefore(LocalDate.of(2000, 01, 01))
                    && ((CustomUser) user).emailId.contains("gmail.com")) {
                user.printUser();
                found = true;
            }
        }

        if (!found) System.out.println("No records found");
    }
}