import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        
        // Scanner is only being used to pause between demos.
        Scanner input = new Scanner(System.in);

        System.out.println("--- Task 1: Increment, Decrement, and Compound Assignment ---");

        int score = 10;
        System.out.println("Initial score: " + score);

        // Compound assignment
        score += 5;
        System.out.println("Score after += 5: " + score);

        // Increment operator
        score++;
        System.out.println("Score after ++: " + score);
        
        // Decrement operator
        score--;
        System.out.println("Score after ++: " + score);

        System.out.print("\nPress enter to continue...");
        input.nextLine();

        // -----------------------------------------

        System.out.println("--- Task 2: Type Casting ---");

        double price = 29.99;
        System.out.println("Original price (double): " + price);

        // Narrowing conversion (double to int)
        int intPrice = (int) price;
        System.out.println("Price after casting to int: " + intPrice);

        int items = 3;
        // Explicit casting for accurate division
        double average = (double) intPrice / items;
        System.out.println("Average price with explicit casting " + average);

        System.out.print("Press enter to continue...");
        input.nextLine();

        // --------------------------------

        System.out.println("--- Task 3: The Math Class and Constants ---");

        // Constant decleration 
        final double PI = 3.14159;
        int radius = 5;

        // Calculate area using Math.pow()
        double area = PI * Math.pow(radius, 2);
        System.out.println("Area of circle with radius " + radius + ": " + area);

        // Generate a random dice roll (1-6)
        int diceRoll = (int) (Math.random() * 6) + 1;
        System.out.println("Random dice roll: " + diceRoll);

        System.out.print("\nPress enter to continue...");
        input.nextLine();

        // --------------------------------------------

        System.out.println("--- Task 4: Escape Characters ---");

        // Using tab (\t) for formatting
        String table = "Item\tPrice\nKeyboard\t$75\nMouse\t\t$25";
        System.out.println(table);

        // Using newline (\n) and quotes (\")
        String message = "He said, \"Hello, world!\"\nAnd the program responded 'Hi.'";
        System.out.println(message);

        System.out.print("\nPress enter to continue...");
        input.nextLine();

        // -----------------------------------------------

        System.out.println("--- Task 5: Challenge Task (Combing Concepts) ---");

        int totalStudents = 15;
        final double GRADE_INCREASE = 1.05;
        double newGrade = 80;

        // Compound assignment with a constant
        newGrade *= GRADE_INCREASE;

        // Round the grade using Math.round()
        long roundedGrade = Math.round(newGrade);

        // PRint a final, formatted message that includes all variables
        String finalMessage = "Out of " + totalStudents + " students, the new rounded grade is: " + roundedGrade + ".\n\tThis is a " + (GRADE_INCREASE - 1) * 100 + "% increase.";
        System.out.println(finalMessage);




    }  
}