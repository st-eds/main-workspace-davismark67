import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
       
        System.out.print("Enter the a value: ");
        double aValue = input.nextDouble();

        System.out.print("Enter the b value: ");
        double bValue = input.nextDouble();

        System.out.print("Enter the c value: ");
        double cValue = input.nextDouble();

        double discriminant = ((bValue * bValue) - (4 * aValue * cValue));
        System.out.println("The discriminant is " + discriminant);


        if (discriminant > 0) {
            double root1 = (((-bValue) + Math.sqrt((bValue * bValue) - (4 * aValue * cValue))) / (2 * aValue));
            double root2 = (((-bValue) - Math.sqrt((bValue * bValue) - (4 * aValue * cValue))) / (2 * aValue));

            System.out.println("The roots are " + root1 + " and " + root2);
        }
        else if (discriminant == 0) {
            double root1 = ((-bValue) / (2 * aValue));
            System.out.println("The root is " + root1);
        }
        else if (discriminant < 0) {
            System.out.println("There are no real roots.");
        }
    }
}
