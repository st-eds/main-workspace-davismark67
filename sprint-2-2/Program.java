import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a traffic light color (in lowercase): ");
        String lightColor = input.nextLine();

        if (lightColor.equals("green")) {
            System.out.println("Go");
        } 
        else if (lightColor.equals("yellow")) {
            System.out.println("Prepare to stop!");
        }
        else if (lightColor.equals("red")) {
            System.out.println("Stop!");
        }
        else {
            System.out.println("Error: Answer invalid");
        }
    }
}