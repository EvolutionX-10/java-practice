package P4;

import java.time.LocalDate;

public class CustomUser extends User {
    public String emailId;
    public long securityKey;

    public CustomUser() {}
    public CustomUser(String username, String mobileNumber, String gender, User manager, String emailId, long key, LocalDate createdDate) {
        super(username, mobileNumber, gender, manager, createdDate);
        this.securityKey = key;
        this.emailId = emailId;
    }
    public CustomUser(String username, String mobileNumber, String gender, User manager, String emailId, long key) {
        super(username, mobileNumber, gender, manager);
        this.securityKey = key;
        this.emailId = emailId;
    }

    public void displayUser() {
        super.printUser();
        System.out.printf("Email: %s\nKey: %d\n", this.emailId, this.securityKey);
    }
}
