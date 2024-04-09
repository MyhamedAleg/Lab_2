import java.util.Scanner;

public class WeekdayType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть номер дня тижня (1 - понеділок, 2 - вівторок, ..., 7 - неділя): ");
        int dayNumber = scanner.nextInt();

        if (dayNumber >= 1 && dayNumber <= 5) {
            System.out.println("Це робочий день.");
        } else if (dayNumber == 6 || dayNumber == 7) {
            System.out.println("Це вихідний день.");
        } else {
            System.out.println("Введено некоректний номер дня тижня.");
        }


    }
}
