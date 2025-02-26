import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 1, max = 100, maxAttempts = 7, score = 0, rounds = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int targetNumber = random.nextInt(max - min + 1) + min;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nRound " + (rounds + 1) + ": Guess a number between " + min + " and " + max);
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess;
                try {
                    guess = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a number.");
                    continue;
                }

                attempts++;
                if (guess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score += (maxAttempts - attempts + 1); // More points for fewer attempts
                    guessedCorrectly = true;
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

            if (!guessedCorrectly) {
                System.out.println("Out of attempts! The correct number was: " + targetNumber);
            }

            rounds++;
            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Game Over! You played " + rounds + " round(s) with a final score of: " + score);
        scanner.close();
    }
}