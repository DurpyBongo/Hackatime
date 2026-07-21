/**
 * Name: Ethan Zhu
 * Date: July 16, 2026
 * Description: Calculates a student's net annual college expenses by subtracting 
 *              scholarships/grants from the sum of tuition, rent, and book costs.
 */

import java.util.Scanner;

public class CollegeCalculator {
    public static void main(String[] args) {
        // assign the variables
        Scanner scanner = new Scanner(System.in);
        double tuition = 0.0;
        double residence = 0.0;
        double books = 0.0;
        double scholarships = 0.0;
        double totalNeeded = 0.0;
        
        // ask for inputs
        System.out.println("Enter your annual college expenses");
        System.out.print("Tuition: $");
        tuition = scanner.nextDouble();
        
        System.out.print("Residence/Rent: $");
        residence = scanner.nextDouble();
        
        System.out.print("Books and Supplies: $");
        books = scanner.nextDouble();
        
        // input for offset costs
        System.out.println("Enter your offset costs");
        System.out.print("Scholarships and Grants: $");
        scholarships = scanner.nextDouble();
        
        // Calculate net cost
        totalNeeded = (tuition + residence + books) - scholarships;
        
        // Display result
        System.out.format("%nTotal money needed for your school year is: $%.2f%n", totalNeeded);
        
        scanner.close();
    }
}
