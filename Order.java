/**
 * Name: Ethan Zhu
 * Date: July 16, 2026
 * Description: Simulates a fast-food checkout by taking order quantities, calculating 
 *              the subtotal, adding sales tax, and computing the change due based on cash tendered.
 */

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        // Declare and assign variables
        Scanner scanner = new Scanner(System.in);
        int burgers = 0, fries = 0, sodas = 0;
        final double BURGER_PRICE = 1.69;
        final double FRIES_PRICE = 1.09;
        final double SODA_PRICE = 0.99;
        final double TAX_RATE = 0.065; // 6.5% Tax
        
        double subtotal = 0.0;
        double taxAmount = 0.0;
        double finalTotal = 0.0;
        double amountTendered = 0.0;
        double changeDue = 0.0;
        
        // get inputs from user
        System.out.print("Enter the number of burgers: ");
        burgers = scanner.nextInt();
        System.out.print("Enter the number of fries: ");
        fries = scanner.nextInt();
        System.out.print("Enter the number of sodas: ");
        sodas = scanner.nextInt();
        
        // Perform calculations
        subtotal = (burgers * BURGER_PRICE) + (fries * FRIES_PRICE) + (sodas * SODA_PRICE);
        taxAmount = subtotal * TAX_RATE;
        finalTotal = subtotal + taxAmount;
        
        // display results
        System.out.format("Total before tax: $%.2f%n", subtotal);
        System.out.format("Tax: $%.2f%n", taxAmount);
        System.out.format("Final total: $%.2f%n", finalTotal);
        System.out.println();
        
        // this is part b of my assignment. Ask for input from the user
        System.out.print("Enter amount tendered: $");
        amountTendered = scanner.nextDouble();
        changeDue = amountTendered - finalTotal;
        //display the results of the change due
        System.out.format("Change: $%.2f%n", changeDue);
        
        scanner.close();
    }
}