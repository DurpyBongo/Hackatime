/* Assignment: Life Stage Determiner
 * Programmer: Ethan
 * Date: July 20, 2026
 * Purpose: Determine and display a person's life stage category based
 *          on their age and student status.
 */

import java.util.Scanner; // include the scanner toolbox

public class LifeStageDeterminer // name of class
{ // start of class
  public static void main(String[] args) // magic line
  { // start of main method

    // variable declarations
    String name = null;   // will hold the user's name
    int age = 0;           // will hold the user's age
    boolean isStudent = false; // will hold true/false for student status

    Scanner scan = new Scanner(System.in);

    // ask the user for their name
    System.out.print("Please enter your name: ");
    name = scan.nextLine();

    // ask the user for their age
    System.out.print("Please enter your age: ");
    age = scan.nextInt();

    // ask the user if they are a student (true/false)
    System.out.print("Are you a student (true/false): ");
    isStudent = scan.nextBoolean();

    // check if the user is a student between 13 and 19 (teenager)
    if (isStudent == true && age >= 13 && age <= 19)
      System.out.println("Student " + name + " is a teenager.");

    // check if the user is a student between 5 and 12 (child)
    else if (isStudent == true && age >= 5 && age <= 12)
      System.out.println("Student " + name + " is a child.");

    // check if the user is not a student and between 20 and 30 (young adult)
    else if (isStudent == false && age >= 20 && age <= 30)
      System.out.println(name + " is a young adult.");

    // none of the above conditions were true
    else
      System.out.println(name + " is in a different life stage.");

    scan.close(); // close off Scanner

  } // end of main method
} // end of class