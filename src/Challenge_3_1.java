import java.util.*;

public class Challenge_3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Firstname?");
        String firstname = scanner.nextLine();

        System.out.println("Surname?");
        String lastname = scanner.nextLine();
        if (lastname.length() < 5) {
            System.out.println("Last name must be longer than five letters!!!");
            System.exit(0);
        }

        int randomNumber = random.nextInt(10, 100);
        System.out.println(firstname.charAt(0) + ". " + lastname.substring(0, 5) + " " + randomNumber);

    }
}
