import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of times to flip the coin: ");
        int flips = input.nextInt();
        int tails = 0;
        int heads = 0;

        for (int i = 1; i <= flips; i++) {
            int coin = (int)(Math.random() * 2 + 1);
            if (coin == 1) {
                System.out.println("heads");
                heads++;
            }
            else {
                System.out.println("tails");
                tails++;
            }
        }

        System.out.println("The Results are " + "heads " + heads * 10 + "% " + "tails " + tails * 10 + "%");

    }
}

