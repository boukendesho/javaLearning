import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 10;
        int randomNumber = random.nextInt(min, max + 1);
        int attempts = 0;
        int guess;

        System.out.printf("Guess number between %d-%d.\n", min, max);

        do {
            System.out.print("Enter your guess number: ");
            guess = scanner.nextInt();

            attempts++;

            if (randomNumber > guess) {
                System.out.println("Higher than that. Try again.");
            } else if (randomNumber < guess) {
                System.out.println("Lower than that. Try again.");
            } else {
                System.out.printf("You got it with %d attempts.\n", attempts);
            }
        } while (randomNumber != guess);
        
        scanner.close();
    }
}
