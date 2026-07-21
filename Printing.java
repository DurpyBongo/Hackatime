/*
 * Name: Ethan Zhu
 * Date: July 20, 2026
 * Program Name: Printing.java
 * Description: Prompts the user for the number of copies to print and calculates 
 *              the price per copy and total cost based on quantity brackets.
 */

public class Printing // name of class
{ // start of class
  public static void main(String[] args) // magic line
  { // start of main method
    java.util.Scanner input = new java.util.Scanner(System.in);

    // prompt user for input
    System.out.print("Enter the number of copies to be printed: ");
    int copies = input.nextInt();

    double pricePerCopy;

    // check quantity ranges
    if (copies <= 99)
      pricePerCopy = 0.30;
    else if (copies <= 499)
      pricePerCopy = 0.28;
    else if (copies <= 749)
      pricePerCopy = 0.27;
    else if (copies <= 1000)
      pricePerCopy = 0.26;
    else
      pricePerCopy = 0.25;

    double totalCost = copies * pricePerCopy;

    // display results
    System.out.printf("Price per copy is: $%.2f%n", pricePerCopy);
    System.out.printf("Total cost is: $%.2f%n", totalCost);

    input.close();
  } // end of main method
} // end of class