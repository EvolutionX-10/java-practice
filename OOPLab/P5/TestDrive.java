package P5;

public class TestDrive {
    public static void main(String[] args) {
        System.out.println("\n======================== TEST CASE 1 =====================\n");

        SavingAccount a1 = new SavingAccount("1234 5678 9112", "Ganesh");

        a1.openAccount(0);
        a1.deposit(10000);

        try {
            a1.withdraw(20000);
        } catch (Exception e) {
            System.out.println(e);
        }

        a1.updateInterest();

        System.out.println(a1);

        System.out.println("\n======================== TEST CASE 2 =====================\n");

        SavingAccount a2 = new SavingAccount("1234 5678 9000", "Bunti");

        a2.openAccount(0);
        a2.deposit(50000);

        try {
            a2.withdraw(20000);
        } catch (Exception e) {
            System.out.println(e);
        }

        a2.updateInterest();

        System.out.println(a2);

        a2.closeAccount(1);

        System.out.println("\n======================== TEST CASE 3 =====================\n");

        FixedDepositAccount a3 = new FixedDepositAccount("1111 5678 9000", "Bubli", 5);

        a3.openAccount(200000);

        try {
            a3.deposit(50000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(a3);

        a3.closeAccount(2);

        System.out.println("\n======================== TEST CASE 4 =====================\n");

        FixedDepositAccount a4 = new FixedDepositAccount("1111 5678 9000", "Bubli", 5);

        a4.openAccount(200000);

        try {
            a4.deposit(50000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(a4);
        a4.closeAccount(5);

    }
}
