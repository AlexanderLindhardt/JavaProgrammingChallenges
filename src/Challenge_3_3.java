import java.util.Arrays;
import java.util.Random;
public class Challenge_3_3 {

    public static void main(String[] args) {
        String phoneNumber = "";
        Random rand = new Random();

        int firstDigit = rand.nextInt(8);
        int secondDigit = rand.nextInt(8);
        int thirdDigit = rand.nextInt(8);

        phoneNumber += firstDigit + ""+ secondDigit + "" +thirdDigit;
        phoneNumber += "-";
        int middleThreeDigits = rand.nextInt(100,743);

        if (middleThreeDigits < 100 || middleThreeDigits > 742)
            System.out.println(middleThreeDigits);
        phoneNumber += middleThreeDigits;
        phoneNumber += "-";
        int lastThreeDigits = rand.nextInt(1000,10000);
        if (lastThreeDigits < 1000 || lastThreeDigits > 9999)
            System.out.println(lastThreeDigits);
        phoneNumber += lastThreeDigits;
        System.out.println(phoneNumber);



    }
}
