import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("--- Demo 1 - 99 Bottles Song ---\n");

        System.out.print("Enter your favorite soda: ");
        String soda = input.nextLine();
        int bottles = 99;

        // While there are bottles left to pass around...
        while (bottles > 0) {
            System.out.println(bottles + " bottles of " + soda + " on the wall,");
            System.out.println(bottles + " bottles of " + soda + "!");
            System.out.println("You take one down, pass it around,");
            bottles--;
            System.out.println(bottles + " bottles of " + soda + " on the wall!");

            
            input.nextLine();
        }

            System.out.println("Press enter to continue...");
            input.nextLine();
            // -----------------------------------------------------------------

            System.out.println("--- Demo 2 - Turn-Based Battle ---\n");

            int playerHealth = 10;
            int enemyHealth = 6;
            boolean fighting = true;

            // Another suitable condition: playerHealth > 0 && enemyHealth == 0
            while (fighting) {
                System.out.println("Health: " + playerHealth);
                System.out.println("Goblin: " + enemyHealth);
                System.out.println("\n-Menu-");
                System.out.println("1) Attack");
                System.out.println("2) Heal");
                System.out.println("-> ");
                String choice = input.nextLine().toLowerCase();

                if (choice.equals("1") || choice.equals("attack")) {
                    Syste.out.println("Player attacks!");
                    int playerAttack = (int)(Math.random() * 6); // 0 to 5

                    if (playAttack > 0) {
                        System.out.println("You did " + playerAttack + " damage.")
                    }
                }









            }
            
    }
}

