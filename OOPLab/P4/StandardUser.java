package P4;

import java.time.LocalDate;

public class StandardUser extends User {
    public String alias;
    public LocalDate lastLogin;
    public String role;

    public StandardUser() {}

    public StandardUser(String username, String mobileNumber, String gender, User manager, String alias, String role,
            LocalDate createdDate) {
        super(username, mobileNumber, gender, manager, createdDate);
        this.alias = alias;
        this.role = role;
    }

    public StandardUser(String username, String mobileNumber, String gender, User manager, String alias, String role) {
        super(username, mobileNumber, gender, manager);
        this.alias = alias;
        this.role = role;
    }

    public void displayUser() {
        super.printUser();
        System.out.printf("Alias: %s\nRole: %s\n", this.alias, this.role);
    }
}
