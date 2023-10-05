import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {

//     Setup secret number
        int secretNumber = 22;

//    Prompt a user to input their guess
        System.out.println("Guess the Secret number?");

//    collect user input
        Scanner reader = new Scanner(System.in); // creates a scanner object
        int secretNumberGuess = reader.nextInt();


// Check user's guess is correct
        if (secretNumberGuess < secretNumber) {
            System.out.println("Too low");
        } else if (secretNumberGuess > secretNumber) {
            System.out.println("Too high");
        } else {
            System.out.println("That's correct! You guessed the secret number.");
        }


    }
}