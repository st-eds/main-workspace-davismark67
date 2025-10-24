import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kilograms   Pounds");
        System.out.print("What would you like the KG to go to? ");
        int rowCount = input.nextInt();
        
        for (int i = 0; i <= rowCount; i = i + 2) {
            if (i == 0) {
                System.out.print("Pounds\t Kilograms\n");
            }
            else{
                System.out.println(Math.round(2.2*i) + "\t " + i);
            }
        }

    }
}

