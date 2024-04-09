import java.util.Scanner;

public class LessonFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть номер пари (1 - 4): ");
        int lessonNumber = scanner.nextInt();

        String lessonName = switch (lessonNumber) {
            case 1 -> "Математика";
            case 2 -> "Українська мова";
            case 3 -> "Фізика";
            case 4 -> "Хімія";
            default -> "Невідомий предмет";
        };

        System.out.println("На " + lessonNumber + " парі ви маєте: " + lessonName);


    }
}