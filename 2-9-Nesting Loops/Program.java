import java.util.Scanner;
public class Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final String GREEN_TEXT = "\u001B[32m";
        final String RED_TEXT = "\u001B[31m";
        final String WHITE_TEXT = "\u001B[37m";
        


        System.out.println("--- Demo 1 - Multiplication Table ---");

        System.out.print("Enter the size of the table: ");
        int size = input.nextInt();

        // Column Headers
        for (int i = 0; i <= size; i++)
        {
            // Omit braces for single- line code blocks
            // Exclude zero at top left
            if (i == 0)
                System.out.print("\t");
                else 
                    System.out.print(GREEN_TEXT + i + "\t");
        }

        System.out.println(); // Move to next row

        for (int num1 = 1; num1 <= size; num1++)
        {
            // Left column
            System.out.print(GREEN_TEXT + num1 + "\t" + WHITE_TEXT);

            // Body for each row
            for (int num2 = 1; num2 <= size; num2++)
            {
                System.out.print(num1 * num2 + "\t");
            }

            System.out.println(); // Move to next row
        }


        input.nextLine();
        System.out.print("Press enter to continue...");
        input.nextLine();


        //  One task that cannot be reasonably accomplished with a single loop but requires a nested loop to manage would be to make a complicated table that has multiple rows and columns that need multiple loops to create it
    }
}

