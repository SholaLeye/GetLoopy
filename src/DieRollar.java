import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String playAgain;

        do {
            int rollCount = 0;
            boolean gotTriple = false;

            // Header
            System.out.printf("%-8s%-8s%-8s%-8s%-8s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("-----------------------------------------------------");

            // Loop until all dice match (triple)
            while (!gotTriple) {
                rollCount++;
                int die1 = rand.nextInt(6) + 1;
                int die2 = rand.nextInt(6) + 1;
                int die3 = rand.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-8d%-8d%-8d%-8d%-8d%n", rollCount, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    gotTriple = true;
                }
            }

            // Ask to play again
            System.out.print("\nWould you like to roll again? (Y/N): ");
            playAgain = scanner.nextLine().trim();

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
    }
}
