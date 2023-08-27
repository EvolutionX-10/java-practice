package P5;

public class SavingAccount extends BankAccount implements Debitable {

    public SavingAccount() {
    }

    public SavingAccount(String aadharNumber, String ownerName) {
        super(aadharNumber, ownerName);
        this.rateOfInterest = 4;
        this.accNumber += 11000;
    }

    @Override
    public void updateInterest() {
        this.balance += this.balance * this.rateOfInterest / 100;
        System.out.printf("Balance after adding interest = %,.1f\n", this.balance);
    }

    @Override
    public void withdraw(double amt) {
        if (amt > this.balance) {
            throw new InvalidAmountException("Insufficient Balance");
        }
        this.balance -= amt;
        System.out.printf("Balance after withdraw = %,.1f\n",this.balance);
    }

    @Override
    public void closeAccount(int year) {
        double bal = this.balance;
        this.balance = 0;

        System.out.printf("Account Closed\nAmount Refunded = %,.1f\nAvailable balance = 0.0\n", bal);
    }
}

class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String msg) {
        super(msg);
    }
}