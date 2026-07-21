/*
 * Name: Ethan Zhu
 * Date: July 20, 2026
 * Program Name: LetterGrade.java
 * Description: Prompts the user for a percentage grade and outputs the corresponding
 *              letter grade (A, B, C, D, or F).
 */

import java.util.Scanner;

public class Grade // name of class
{ // start of class
  public static void main(String[] args) // magic line
  { // start of main method
    Scanner input = new Scanner(System.in);

    // prompt user for percentage
    System.out.print("Enter the percentage: ");
    int percentage = input.nextInt();

    char grade;

    // check percentage scale
    if (percentage >= 90)
      grade = 'A';
    else if (percentage >= 80)
      grade = 'B';
    else if (percentage >= 70)
      grade = 'C';
    else if (percentage >= 60)
      grade = 'D';
    else
      grade = 'F';

    // display letter grade
    System.out.println("The corresponding letter grade is: " + grade);

    input.close();
  } // end of main method
} // end of class