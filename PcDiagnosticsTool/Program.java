import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Is the PC powering on? (yes or no): ");
        String power = input.nextLine();

        if (power.equals("yes")) {
            System.out.print("Is there any display on the monitor? (yes or no): ");
            String display = input.nextLine();

            if (display.equals("yes")) {
                System.out.print("Is the PC booting into the operating system? ");
                String operating = input.nextLine();

                if (operating.equals("yes")) {
                    System.out.print("Is the PC running slowly or freezing? ");
                    String freeze = input.nextLine();

                    if (freeze.equals("yes")) {
                        System.out.println("Check for malware, update drivers, and ensure there is enough free disk space. If the problem persists, consider upgrading the hardware.");
                    }    
                    else if (freeze.equals("no")) {
                        System.out.println("The PC is functioning normally.");
                    }
                    else {
                        System.out.println("Invalid input. Please try again.");
                    }
                }
                else if (operating.equals("no")) {
                    System.out.println("Check the BIOS settings and ensure the boot drive is properly connected. If the problem persists, try booting from a different drive or reinstalling the operating system.");
                }
                else {
                    System.out.println("Invalid input. Please try again.");
                }
            }
            else if (display.equals("no")) {
                System.out.println("Check the monitor connections and ensure the monitor is turned on. If the problem persists, try using a different monitor or graphics card.");
            }
            else {
                System.out.println("Invalid input. Please try again.");
            }
            
            
        }
        else if (power.equals("no")) {
            System.out.println("Check the power supply connections and ensure the power outlet is working. If the problem persists, replace the power supply.");
        }
        else {
            System.out.println("Invalid input. Please try again.");
        }

    }
}

