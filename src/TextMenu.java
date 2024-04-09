import java.util.Scanner;

public class TextMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Меню:");
        System.out.println("1. Привітання");
        System.out.println("2. Запрошення до роботи");
        System.out.println("3. Завершення роботи");

        System.out.print("Виберіть опцію: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Привіт!");
                break;
            case 2:
                System.out.println("Запрошуємо до роботи на комп’ютері.");
                break;
            case 3:
                System.out.println("До побачення!");
                break;
            default:
                System.out.println("Вибрано некоректну опцію.");
        }


    }
}