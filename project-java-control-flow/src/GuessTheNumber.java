import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1 ;
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

        while (true) {
            System.out.print("Enter your guest: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("To low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("To high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " Attempts");
                break;
            }
        }

        scanner.close();
    }
}
