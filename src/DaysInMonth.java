import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть номер місяця (1 - січень, 2 - лютий, ..., 12 - грудень): ");
        int monthNumber = scanner.nextInt();

        int days = switch (monthNumber) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28; // або 29 високосний рік
            default -> -1; // некоректний номер місяця
        };

        if (days != -1) {
            System.out.println("У місяці " + days + " днів.");
        } else {
            System.out.println("Введено некоректний номер місяця.");
        }


    }
}
