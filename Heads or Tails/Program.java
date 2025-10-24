import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int wins = 0;
        int losses = 0;
        int round = 1;
        boolean playing = true;
        String guess;
        String coin;

        System.out.println("Welcome to Heads or Tails!");

        while (playing) {

            System.out.println("Round " + round);
            System.out.println("W: " + wins + " - L: " + losses + "\n");

            System.out.print("Enter Heads or Tails: ");
            guess = input.nextLine().toLowerCase();

            int random = (int)(Math.random() * 2 + 1); // 1 to 2
            // heads is 1 and tails is 2
            if (random == 1) {
                coin = "heads";
            }
            else {
                coin = "tails";
            }

            System.out.println("The coin is " + coin + "!");

            if (guess.equals(coin)) {
                System.out.println("You win");
                wins++;
            }
            else {
                System.out.println("You lose");
                losses++;
            }

            round++;

            System.out.print("Play again? (yes/no) ");
            String choice = input.nextLine();

            if (choice.equals("no")) {
                playing = false;
            }
        }

        System.out.println("\n--- Final Score ---");
        System.out.println("Wins: " + wins + " - Losses: " + losses);
        System.out.println("Thanks for playing!");




    }
}

