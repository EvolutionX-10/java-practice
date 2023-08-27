package P3;

public class TestDrive {
    public static void main(String[] args) {
        Time A = new Time(2, 50);
        Time B = new Time(3, 45);

        System.out.print("Addition -- ");
        System.out.println(A.add(B));
        System.out.print("Subtract -- ");
        System.out.println(A.subtract(B));

        System.out.println();

        GreatClock C = new GreatClock(2, 30, 5, 500);
        GreatClock D = new GreatClock(10, 24, 4, 500);

        System.out.print("Addition -- ");
        System.out.println(C.add(D));
        System.out.print("Subtract -- ");
        System.out.println(C.subtract(D));
    }
}
