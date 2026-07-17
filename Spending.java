/**
 * Name: Ethan Zhu
 * Date: July 16, 2026
 * Description: Prompts the user for their monthly expenditures across four categories, 
 *              calculates the total spending, and displays the percentage spent on each category in a table.
 */

import java.util.Scanner; // import the scanner toolbox

public class Spending {
    public static void main(String[] args) {
        // Declare and assign variables
        Scanner scanner = new Scanner(System.in);
        double food = 0.0;
        double clothing = 0.0;
        double entertainment = 0.0;
        double rent = 0.0;
        double totalSpending = 0.0;
        
        // Prompt user and get inputs
        System.out.println("Enter the amount spent last month on the following items:");
        System.out.print("Food: $");
        food = scanner.nextDouble();
        System.out.print("Clothing: $");
        clothing = scanner.nextDouble();
        System.out.print("Entertainment: $");
        entertainment = scanner.nextDouble();
        System.out.print("Rent: $");
        rent = scanner.nextDouble();
        
        // Calculate total and percentages
        totalSpending = food + clothing + entertainment + rent;
        double percentFood = (food / totalSpending) * 100.0;
        double percentClothing = (clothing / totalSpending) * 100.0;
        double percentEntertainment = (entertainment / totalSpending) * 100.0;
        double percentRent = (rent / totalSpending) * 100.0;
        
        // Display the formatted table of results
        System.out.println();
        System.out.println("Category        Budget");
        System.out.format("Food            %.2f%%%n", percentFood);
        System.out.format("Clothing        %.2f%%%n", percentClothing);
        System.out.format("Entertainment   %.2f%%%n", percentEntertainment);
        System.out.format("Rent            %.2f%%%n", percentRent);
        
        scanner.close();
    }
}