
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("===== ROCK PAPER SCISSORS =====");

        System.out.print("Enter Rock, Paper or Scissors: ");
        String user = sc.nextLine();

        int computerIndex = random.nextInt(3);
        String computer = choices[computerIndex];

        System.out.println("You chose: " + user);
        System.out.println("Computer chose: " + computer);

        if (user.equalsIgnoreCase(computer)) {
            System.out.println("It's a Draw!");
        }
        else if (
            (user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
            (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
            (user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))
        ) {
            System.out.println("You Win!");
        }
        else if (
            user.equalsIgnoreCase("Rock") ||
            user.equalsIgnoreCase("Paper") ||
            user.equalsIgnoreCase("Scissors")
        ) {
            System.out.println("Computer Wins!");
        }
        else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
