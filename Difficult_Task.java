import java.util.Scanner;

public class Difficult_Task {
    Scanner in_d = new Scanner(System.in, "cp866");

    public long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void second_task() {
        System.out.print("Введите первое число: ");
        long a = Math.abs(in_d.nextLong());
        System.out.print("Введите второе число: ");
        long b = Math.abs(in_d.nextLong());

        if (a == 0 && b == 0) {
            System.out.println("НОД двух нулей не определён.");
            return;
        }

        long gcd = gcd(a, b);
        long lcm = (a == 0 || b == 0) ? 0 : a / gcd * b;

        System.out.printf("НОД: %d%n", gcd);
        System.out.printf("НОК: %d%n", lcm);
    }
}