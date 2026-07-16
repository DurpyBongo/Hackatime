import java.util.Scanner; // import the scanner toolbox

public class Change {
    public static void main(String[] args) {
        // Declare and assign variables
        Scanner scanner = new Scanner(System.in);
        int totalCents = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        int remainingCents = 0;
        
        // Prompt user and get input
        System.out.print("Enter the change in cents: ");
        totalCents = scanner.nextInt();
        
        // Calculate coin break downs using integer division and modulus
        quarters = totalCents / 25;
        remainingCents = totalCents % 25;
        
        dimes = remainingCents / 10;
        remainingCents = remainingCents % 10;
        
        nickels = remainingCents / 5;
        pennies = remainingCents % 5;
        
        // display the results
        System.out.println("The minimum number of coins is:");
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
        
        scanner.close();
    }
}