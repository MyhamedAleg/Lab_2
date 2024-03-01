public class Graph {
    public static void main(String[] args) {
        int x = 2;
        int y = -2;
        int quadrant;
        if (x > 0 && y > 0) {
            quadrant = 1;
        } else if (x < 0 && y > 0) {
            quadrant = 2;
        } else if (x < 0 && y < 0) {
            quadrant = 3;
        } else if (x > 0 && y < 0) {
            quadrant = 4;
        } else {
            quadrant = 0; // Якщо точка лежить на координатних вісях
        }

        System.out.println("Точка знаходиться в " + quadrant + " квадранті");
        }
    }

