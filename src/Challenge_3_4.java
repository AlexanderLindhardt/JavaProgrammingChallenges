import java.util.Scanner;

public class Challenge_3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x1");
        int x1 = scanner.nextInt();

        System.out.println("y1");
        int y1 = scanner.nextInt();

        System.out.println("x2");
        int x2 = scanner.nextInt();

        System.out.println("y2");
        int y2 = scanner.nextInt();

        double distance = getDistanceBetweenPoints(x1,x2,y1,y2);
        System.out.println(distance);
    }
    public static double getDistanceBetweenPoints(int x1, int x2, int y1, int y2){

        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }
}
