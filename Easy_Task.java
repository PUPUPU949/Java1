import java.util.Locale;
import java.util.Scanner;

public class Easy_Task {
    static Scanner in = new Scanner(System.in, "UTF-8");

    public static void second_task() {
        in.useLocale(Locale.US);

        System.out.print("Введите сторону a: ");
        double a = in.nextDouble();
        System.out.print("Введите сторону b: ");
        double b = in.nextDouble();
        System.out.print("Введите сторону c: ");
        double c = in.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Треугольник с такими сторонами не существует.");
            return;
        }

        double perimeter = a + b + c;
        double p = perimeter / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.printf(Locale.US, "Периметр: %.2f%n", perimeter);
        System.out.printf(Locale.US, "Площадь: %.2f%n", area);
    }
}