import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int wins = 0;
        int losses = 0;
        int round = 1;
        boolean playing = true;
        String player;
        String computer;
        
        /*
        Rules:
        Rock smashes Scissors
        Paper covers Rock
        Scissors cuts Paper
        */

        System.out.println("--- Rock, Paper, Scissors ---");

        while (playing) {
            System.out.println("Round " + round);
            System.out.println("W: " + wins + " - L: " + losses + "\n");

            System.out.print("(rock, paper, scissors): ");
            player = input.nextLine().toLowerCase();

            // Pick computer hand
            int random = (int)(Math.random() * 3); // 0 to 2

            if (random == 0) {
                computer = "rock";
            }
            else if (random == 1) {
                computer = "paper";
            }
            else{
                computer = "scissors";
            }

            System.out.println("Computer choose " + computer + "!");
        }
        

        if (player.equals(computer)) {
            System.out.println("-TIE-");
        }
        else if (
            (player.equals("rock") && computer.equals("scissors")) ||
            (player.equals("paper") && computer.equals("rock")) ||
            (player.equals("scissors") && computer.equals("paper"))
        ) {
            System.out.println("-YOU WIN-");
            wins++;
        }
        else {
            System.out.println("-YOU LOSE-");
            losses++;
        }

        round++;

        System.out.print("Play again? (yes/no) ");
        String choice = input.nextLine();

        if (choice.equals("no")) {
            playing = false;
        }
    }
}

//  If I wanted to play best of 5, I would make the while statement be until the player or computer won three. Once one of them won three, that player or computer would win