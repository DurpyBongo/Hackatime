/*
 * Name: Ethan Zhu
 * Date: July 20, 2026
 * Program Name: Eggs.java
 * Description: Calculates the total bill for egg purchases based on dozen price tier 
 *              brackets and individual extra egg pricing.
 */

import java.util.Scanner;

public class Eggs // name of class
{ // start of class
  public static void main(String[] args) // magic line
  { // start of main method
    Scanner input = new Scanner(System.in);

    // prompt for total eggs
    System.out.print("Enter the number of eggs purchased: ");
    int numEggs = input.nextInt();

    // calculate dozens and extra eggs
    int dozen = numEggs / 12;
    int leftoverEggs = numEggs % 12;

    double pricePerDozen;

    // check dozen pricing tiers
    if (dozen < 4)
      pricePerDozen = 0.50;
    else if (dozen < 6)
      pricePerDozen = 0.45;
    else if (dozen < 11)
      pricePerDozen = 0.40;
    else
      pricePerDozen = 0.35;

    // calculate individual egg price and total bill
    double pricePerEgg = pricePerDozen / 12.0;
    double totalBill = (dozen * pricePerDozen) + (leftoverEggs * pricePerEgg);

    // display output
    System.out.printf("The bill is equal to: $%.2f%n", totalBill);

    input.close();
  } // end of main method
} // end of class