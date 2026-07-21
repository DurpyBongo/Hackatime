/*
 * Name: Ethan Zhu
 * Date: July 20, 2026
 * Program Name: MathTutor.java
 * Description: Generates a random addition problem, prompts the user for the answer,
 *              and displays whether the answer is correct or incorrect.
 */

import java.util.Random;
import java.util.Scanner;

public class MathTutor // name of class
{ // start of class
  public static void main(String[] args) // magic line
  { // start of main method
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    // generate random numbers between 1 and 10
    int num1 = rand.nextInt(10) + 1;
    int num2 = rand.nextInt(10) + 1;

    // pick random operator
    char[] operators = {'*', '+', '-', '/'};
    char operator = operators[rand.nextInt(4)];

    double correctAnswer = 0;

    // determine correct answer based on operator
    if (operator == '*')
      correctAnswer = num1 * num2;
    else if (operator == '+')
      correctAnswer = num1 + num2;
    else if (operator == '-')
      correctAnswer = num1 - num2;
    else if (operator == '/')
      correctAnswer = (double) num1 / num2;

    // prompt user for their answer
    System.out.print("What is " + num1 + " " + operator + " " + num2 + "? ");
    double userAnswer = input.nextDouble();

    // check user's answer
    if (Math.abs(userAnswer - correctAnswer) < 0.001)
      System.out.println("Correct!");
    else
      System.out.println("Incorrect. The correct answer is: " + correctAnswer);

    input.close();
  } // end of main method
} // end of class