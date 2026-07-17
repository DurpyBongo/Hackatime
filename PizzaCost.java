/**
 * Name: Ethan Zhu
 * Date: July 16, 2026
 * Description: Calculates the total cost of making a pizza based on the input diameter 
 *              by combining constant labor and rent fees with material costs.
 */

import java.util.Scanner; // import the scanner toolbox

public class PizzaCost {
    public static void main(String[] args) {
        
        // assign the variables as double
        Scanner scanner = new Scanner(System.in);
        double diameter = 0.0;
        double laborCost = 0.75;
        double rentCost = 1.00;
        double materialCost = 0.0;
        double totalCost = 0.0;
        
        System.out.print("Enter the diameter of the pizza in inches: "); 
        diameter = scanner.nextDouble(); // get the input for diameter
        
        // Calculate all the costs
        materialCost = 0.05 * diameter * diameter;
        totalCost = laborCost + rentCost + materialCost;
        
        // Display formatted results
        System.out.format("The cost of making the pizza is: $%.2f%n", totalCost);
        
        scanner.close();
    }
    
}
