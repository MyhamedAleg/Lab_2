import java.util.Scanner;

public class Sqrt  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть коефіцієнти a, b і c для квадратного рівняння ax^2 + bx + c = 0:");

        System.out.print("a = ");
        double a = scanner.nextDouble();

        System.out.print("b = ");
        double b = scanner.nextDouble();

        System.out.print("c = ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant >= 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Розв'язки квадратного рівняння:");
            System.out.println("x1 = " + root1);
            System.out.println("x2 = " + root2);
        } else {
            System.out.println("Квадратне рівняння не має розв'язків у множині дійсних чисел.");
        }


    }
}