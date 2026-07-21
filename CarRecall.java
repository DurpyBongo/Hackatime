/*
 * Name: Ethan Zhu
 * Date: July 20, 2026
 * Program Name: CarRecall.java
 * Description: Prompts the user for a car's model number and determines whether
 *              it is defective based on specific recalled model numbers (119, 179,
 *              189 through 195, and 221).
 */

public class CarRecall // name of class
{ // start of class
  public static void main(String[] args) // magic line
  { // start of main method
    java.util.Scanner input = new java.util.Scanner(System.in);

    // prompt user
    System.out.print("Enter the car's model number: ");
    int modelNumber = input.nextInt();

    // check if model matches any defective model numbers
    if (modelNumber == 119 || modelNumber == 179 || (modelNumber >= 189 && modelNumber <= 195) || modelNumber == 221 || modelNumber == 780)
      System.out.println("Your car is defective. It must be repaired.");
    else
      System.out.println("Your car is not defective.");

    input.close();
  } // end of main method
} // end of class