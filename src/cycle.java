public class cycle {

        public static void main(String[] args) {
            int x = 46;
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
