package P4;

import java.time.LocalDate;

public class User {
    public String username;
    protected String password;
    public String mobileNumber;
    public boolean isActive = true;
    public String gender;
    public User manager;
    public LocalDate createdDate = LocalDate.now();

    public User(String username, String mobileNumber, String gender, User manager) {
        this.username = username;
        this.mobileNumber = mobileNumber;
        this.gender = gender;
        this.manager = manager;
    }

    public User(String username, String mobileNumber, String gender, User manager, LocalDate createdDate) {
        this(username, mobileNumber, gender, manager);
        this.createdDate = createdDate;
    }

    public User() {}

    public final void printUser() {
        System.out.printf(
            "Username: %s\nPassword: %s\nMobile Number: %s\nActive: %s\nGender: %s\nCreated Date: %s\n\n",
            this.username,
            this.password,
            this.mobileNumber,
            this.isActive,
            this.gender.equals("M") ? "Male" : "Female",
            this.createdDate
        );
    }

    public User setActive(boolean active) {
        this.isActive = active;
        return this;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

}