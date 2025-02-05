import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int guess, attempts = 0;

        System.out.println("Guess the number between 1 and 100:");

        while (true) {
            guess = sc.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low. Try again:");
            } else if (guess > numberToGuess) {
                System.out.println("Too high. Try again:");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            }
        }

        sc.close();
    }
}
