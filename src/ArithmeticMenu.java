import java.util.Scanner;

public class ArithmeticMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Меню:");
        System.out.println("1. Обчислити добуток двох чисел");
        System.out.println("2. Обчислити суму двох чисел");
        System.out.println("3. Обчислити різницю двох чисел");

        System.out.print("Виберіть опцію: ");
        int option = scanner.nextInt();

        double num1, num2, result;

        switch (option) {
            case 1:
                System.out.print("Введіть перше число: ");
                num1 = scanner.nextDouble();
                System.out.print("Введіть друге число: ");
                num2 = scanner.nextDouble();
                result = num1 * num2;
                System.out.println("Добуток: " + result);
                break;
            case 2:
                System.out.print("Введіть перше число: ");
                num1 = scanner.nextDouble();
                System.out.print("Введіть друге число: ");
                num2 = scanner.nextDouble();
                result = num1 + num2;
                System.out.println("Сума: " + result);
                break;
            case 3:
                System.out.print("Введіть перше число: ");
                num1 = scanner.nextDouble();
                System.out.print("Введіть друге число: ");
                num2 = scanner.nextDouble();
                result = num1 - num2;
                System.out.println("Різниця: " + result);
                break;
            default:
                System.out.println("Вибрано некоректну опцію.");
        }


    }
}