package P5;

public abstract class BankAccount {
    static int trackAccNumber = 1;
    int accNumber;
    String aadharNumber;
    String ownerName;
    double rateOfInterest;
    double balance;

    public BankAccount() {
    }

    public BankAccount(String aadharNumber, String ownerName) {
        this.accNumber = trackAccNumber++;
        this.ownerName = ownerName;
        this.aadharNumber = aadharNumber;
    }

    public void openAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.printf("Balance after deposit = %,.1f\n", this.balance);
    }

    public abstract void closeAccount(int year);

    public abstract void updateInterest();

    @Override
    public String toString() {
        String details = "\n======= Account Details =======\n";
        details += "\nAccount Number = " + this.accNumber;
        details += "\nAadhar Number = " + this.aadharNumber;
        details += "\nOwner Name = " + this.ownerName;
        details += "\nROI = " + this.rateOfInterest;
        details += "\nBalance = " + this.balance;
        details += "\n\n==============================\n";

        return details;
    }
}
