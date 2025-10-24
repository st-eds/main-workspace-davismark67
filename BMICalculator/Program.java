import java.util.Scanner;
public class Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();


        System.out.print("Enter your height in inches: ");
        double height = input.nextDouble();

        double bmi = ((weight / (height * height)) * 703);

        if (bmi < 18.5) {
            System.out.println("Your BMI is " + bmi + ", which is considered underweight.");
        }
        else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Your BMI is " + bmi + ", which is considered normal weight.");
        }
        else if (bmi >= 24.9 && bmi < 29.9) {
            System.out.println("Your BMI is " + bmi + ", which is considered overweight.");
        }
        else if (bmi >= 29.9 {
            System.out.println("Your BMI is " + bmi + ", which is considered obesity.");
        }
        else {
            Syste.out.println("Your inputs are wrong. Please try again.")
        }





    }
}

