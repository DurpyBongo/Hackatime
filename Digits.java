import java.util.Scanner; // import the scanner toolbox

public class Digits {
    public static void main(String[] args) {
        // Declare and assign variables
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int hundreds = 0;
        int tens = 0;
        int ones = 0;
        
        // Prompt user and get input
        System.out.print("Enter a three-digit number: ");
        number = scanner.nextInt();
        
        // Extract digits mathematically
        hundreds = number / 100;         // isolates the hundreds place
        tens = (number % 100) / 10;      // gets remaining tens, isolates them
        ones = number % 10;              // isolates the ones place
        
        // Output results
        System.out.println("The hundreds-place digit is: " + hundreds);
        System.out.println("The tens-place digit is: " + tens);
        System.out.println("The ones-place digit is: " + ones);
        
        scanner.close();
    }
}