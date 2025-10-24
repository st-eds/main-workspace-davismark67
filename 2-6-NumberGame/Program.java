import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNumber = (int)(Math.random() * 10) + 1;
        int guess = 0;
        int tries = 0;
    
    
        while (guess != secretNumber) {
            System.out.print("Guess the number (1-10): ");
            guess = input.nextInt();
            tries++;
    
            if (guess == secretNumber) {
                System.out.println("Correct! It took you " + tries + " tries!");
            }
            else if (guess < 1 || guess > 10) {
                System.out.println("Your guess was out of range.");
            }
            else if (guess > secretNumber) {
                System.out.println("Wrong! Your guess was too high.");
            }
            else {
                System.out.println("Wrong! Your guess was too low.");
            }
        }
    }
}

// The while loop lets the code run until the correct answer is given. This allows the same random number to be selected and lets the user input multiple answers until they get it
// I used these if/else/if/else statements when I needed to give hints to the player. Their input would determine on what hint I gave them, depending if it was lower than it or aboce it or right on it.