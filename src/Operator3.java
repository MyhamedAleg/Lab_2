public class Operator3 {
    public static void main(String[] args) {
        int mounth = 1;
        switch (mounth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println( " This mounth have 31 day ");
                        break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println( " This mounth have 30 day ");
                break;
            case 2:
                System.out.println( " This mounth have 28 day ");
                        break;





        }
    }
}
