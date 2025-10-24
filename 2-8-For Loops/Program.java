import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);

        System.out.println("--- Demo 1 - Counting Multiples ---");

        System.out.print("Choose a number: ");
        int number = input.nextInt();
        System.out.print("List how many multiples of " + number + "? ");
        int count = input.nextInt();

        int sum = number;

        for (int i = 0; i < count; i++)
        {
            System.out.print(sum + " ");
            sum += number;
        }

        input.nextLine(); // consume newline
        System.out.print("\nPress enter to continue...");
        input.nextLine();

        // -----------------------------------------------------------------------------------------

        System.out.println("\n--- Demo 2 - Square Tables ---");

        System.out.print("Enter row count: ");
        int rows = input.nextInt();

        System.out.print("\nNumber\tSquare");
        System.out.println("-------------------");

        for (int i = 1; i <= rows; i++) 
        {
            System.out.println(i + "\t" + (i * i));
        }

            //  it can be a better choice for the counting multiples and square tables as it looks better and has better formatting. It has better formatting because it is all in one line for the conditions and requirements for the code.
            //  The specific change you would need to make is to take out the = in "i <= rows". this would then make the code run correctly since it starts at 0 and not at 1
    }
}

