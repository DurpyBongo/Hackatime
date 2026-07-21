/*
 * Name: Ethan Zhu
 * Date: July 20, 2026
 * Program Name: PackageCheck.java
 * Description: Prompts the user for a package's weight and dimensions (length, width, 
 *              height) to verify if it exceeds weight (27kg) or volume (100,000 cm³) limits.
 */

import java.util.Scanner;

public class PackageCheck // name of class
{ // start of class
  public static void main(String[] args) // magic line
  { // start of main method
    Scanner input = new Scanner(System.in);

    // prompt user for dimensions and weight
    System.out.print("Enter package weight in kilograms: ");
    double weight = input.nextDouble();

    System.out.print("Enter package length in centimeters: ");
    double length = input.nextDouble();

    System.out.print("Enter package width in centimeters: ");
    double width = input.nextDouble();

    System.out.print("Enter package height in centimeters: ");
    double height = input.nextDouble();

    // calculate volume in cm³
    double volume = length * width * height;

    // check conditions
    if (weight > 27 && volume > 100000)
      System.out.println("Too heavy and too large.");
    else if (weight > 27)
      System.out.println("Too heavy.");
    else if (volume > 100000)
      System.out.println("Too large.");
    else
      System.out.println("Package accepted.");

    input.close();
  } // end of main method
} // end of class