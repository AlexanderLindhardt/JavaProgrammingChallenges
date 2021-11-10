import java.util.*;
public class Challenge_3_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int n1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int n2 = scanner.nextInt();

        double sumOfCubes = Math.pow(n1, 3) + Math.pow(n2, 3);

        System.out.println("Sum of " + n1 + "^3 and " + n2 + "^3 = " + sumOfCubes);
    }
}
