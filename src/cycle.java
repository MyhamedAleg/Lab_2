import java.util.Scanner;

public class cycle {

        public static void main(String[] args ) {
            System.out.print("Введіть число: ");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();


            if (x % 2 == 0) {
                System.out.print(x + " парне ");
            } else {
                System.out.print(x + " непарне ");
            }
            if (x >= 10 && x <= 99) {
                System.out.print(" та  двозначне");
            }else{
                System.out.print( " та однозначне ");
            }
        }


}
