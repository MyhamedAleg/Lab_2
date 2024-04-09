import java.util.Scanner;

public class QuarterHour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число від 0 до 59: ");
        int min = scanner.nextInt();

        int quarter = (min / 15) + 1;

        switch (quarter) {
            case 1:
                System.out.println("Це перша чверть години.");
                break;
            case 2:
                System.out.println("Це друга чверть години.");
                break;
            case 3:
                System.out.println("Це третя чверть години.");
                break;
            case 4:
                System.out.println("Це четверта чверть години.");
                break;
            default:
                System.out.println("Некоректне число хвилин.");
        }


    }
}