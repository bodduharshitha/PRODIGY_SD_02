import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;  // Set the minimum range for the random number
        int maxRange = 100;  // Set the maximum range for the random number
        int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int userGuess;
        int attempts = 0;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I have generated a random number between " + minRange + " and " + maxRange + ".");

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < generatedNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > generatedNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number!");
                System.out.println("It took you " + attempts + " attempts to win the game.");
            }
        } while (userGuess != generatedNumber);

        scanner.close();
    }
}
