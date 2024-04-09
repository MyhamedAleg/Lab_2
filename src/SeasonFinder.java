import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть номер місяця (1 - січень, 2 - лютий, ..., 12 - грудень): ");
        int monthNumber = scanner.nextInt();

        if (monthNumber >= 1 && monthNumber <= 12) {
            if (monthNumber >= 3 && monthNumber <= 5) {
                System.out.println("Весна");
            } else if (monthNumber >= 6 && monthNumber <= 8) {
                System.out.println("Літо");
            } else if (monthNumber >= 9 && monthNumber <= 11) {
                System.out.println("Осінь");
            } else {
                System.out.println("Зима");
            }
        } else {
            System.out.println("Введено некоректний номер місяця.");
        }


    }
}