package P5;

public class FixedDepositAccount extends BankAccount {
    int lockInPeriod;

    public FixedDepositAccount() {
    }

    public FixedDepositAccount(String aadharNumber, String ownerName, int lockInPeriod) {
        super(aadharNumber, ownerName);
        this.accNumber += 55000;
        this.lockInPeriod = lockInPeriod;
    }

    protected double getRateOfInterest() {
        if (this.lockInPeriod <= 2 && this.lockInPeriod >= 1)
            this.rateOfInterest = 6;
        else if (this.lockInPeriod <= 5 && this.lockInPeriod > 2)
            this.rateOfInterest = 6.5;
        else if (this.lockInPeriod > 5)
            this.rateOfInterest = 7;

        return this.rateOfInterest;
    }

    @Override
    public void deposit(double amount) {
        throw new UnallowedException("Deposit Method Not Allowed");
    }

    @Override
    public void updateInterest() {
        this.balance += (this.balance * getRateOfInterest() * this.lockInPeriod) / 100;
        System.out.printf("Balance after adding interest = %,.1f\n", this.balance);
    }

    public void closeAccount(int year) {
        if (this.lockInPeriod > year) {
            double penalty = this.balance * 0.05;
            double bal = this.balance - penalty;
            this.balance = 0;
            System.out.printf("Account Closure : Before Lock in period\nPenalty = %,.1f\nAmount Refunded: %,.1f\n",
                    penalty, bal);
        } else {
            double interest = (this.balance * getRateOfInterest() * this.lockInPeriod) / 100;
            this.balance += interest;
            double bal = this.balance;
            this.balance = 0;

            System.out.printf(
                    "Account Closure : On completion of lock in period\nInterest: %,.1f\nAmount Refunded: %,.1f\n",
                    interest, bal);
        }
    }
}

class UnallowedException extends RuntimeException {
    public UnallowedException(String msg) {
        super(msg);
    }
}