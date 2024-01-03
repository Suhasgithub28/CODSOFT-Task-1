import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100. Can you guess it?");
        
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;
            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if
 (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } 
else if 
(userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            }
 else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + attempts + " attempts.");
            }
        }
        scanner.close();

        } 
       }
