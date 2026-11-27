
import java.util.Scanner;
import java.util.Random;

public class KeyCreator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String characters =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
            "abcdefghijklmnopqrstuvwxyz" +
            "0123456789" +
            "!@#$%^&*";

        System.out.println("===== KEY CREATOR =====");

        System.out.print("Enter key length: ");
        int length = sc.nextInt();

        if (length <= 0) {

            System.out.println("Invalid key length!");

        } else {

            String key = "";

            for (int i = 0; i < length; i++) {

                int index = random.nextInt(characters.length());

                key = key + characters.charAt(index);
            }

            System.out.println("Your Generated Key: " + key);
        }

        sc.close();
    }
}
