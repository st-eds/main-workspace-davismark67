import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth month as an integer: ");
        int birthYear = input.nextInt();
        

        if (birthYear == 1 || birthYear == 2 || birthYear == 12) {
            System.out.println("You're a winter baby!");
        }
        else if (birthYear == 3 || birthYear == 4 || birthYear == 5) {
            System.out.println("You're a Spring baby!");
        }
        else if (birthYear == 6 || birthYear == 7 || birthYear == 8) {
            System.out.println("You're a Summer baby!");
        }
        else if (birthYear == 9 || birthYear == 10 || birthYear == 11) {
            System.out.println("You're a Fall baby!");
        }
        else {
            System.out.println("ERROR: You have entered an invalid answer.");
        }
        
        
    }
}