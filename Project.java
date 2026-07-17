/**
 * Name: Ethan Zhu
 * Date: July 16, 2026
 * Description: Prompts the user for the minutes spent on four project tasks and prints 
 *              a structured table displaying the percentage of total time spent on each task.
 */

import java.util.Scanner; // import the scanner toolbox

public class Project {
    public static void main(String[] args) {
        // Declare and assign variables
        Scanner scanner = new Scanner(System.in);
        double designing = 0.0;
        double coding = 0.0;
        double debugging = 0.0;
        double testing = 0.0;
        double totalMinutes = 0.0;
        
        // Prompt user and get inputs
        System.out.println("Enter the number of minutes spent on each of the following project tasks:");
        System.out.print("Designing: ");
        designing = scanner.nextDouble();
        System.out.print("Coding: ");
        coding = scanner.nextDouble();
        System.out.print("Debugging: ");
        debugging = scanner.nextDouble();
        System.out.print("Testing: ");
        testing = scanner.nextDouble();
        
        // Calculate total and percentages
        totalMinutes = designing + coding + debugging + testing;
        double percentDesigning = (designing / totalMinutes) * 100.0;
        double percentCoding = (coding / totalMinutes) * 100.0;
        double percentDebugging = (debugging / totalMinutes) * 100.0;
        double percentTesting = (testing / totalMinutes) * 100.0;
        
        // Display the table of results
        System.out.println();
        System.out.println("Task            % Time");
        System.out.format("Designing       %.2f%%%n", percentDesigning);
        System.out.format("Coding          %.2f%%%n", percentCoding);
        System.out.format("Debugging       %.2f%%%n", percentDebugging);
        System.out.format("Testing         %.2f%%%n", percentTesting);
        
        scanner.close();
    }
}