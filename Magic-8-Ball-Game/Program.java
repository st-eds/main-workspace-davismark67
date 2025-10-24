import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ask a question: ");
        String answer = input.nextLine();
        System.out.println();

        int number = (int)(Math.random() * 6) + 1;

        if (number == 1) {
            System.out.println("It is certain.");
        }
        else if (number == 2) {
            System.out.println("Without a doubt.");
        }
        else if (number == 3) {
            System.out.println("Ask again later.");
        }
        else if (number == 4) {
            System.out.println("Cannot predit now.");
        }
        else if (number == 5) {
            System.out.println("Don't count on it.");
        }
        else if (number == 6) {
            System.out.println("Outlook not so good.");
        }
    }
}