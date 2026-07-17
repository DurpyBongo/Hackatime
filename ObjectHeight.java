/**
 * Name: Ethan Zhu
 * Date: July 16, 2026
 * Description: Computes the remaining height of an object dropped from 100 meters 
 *              after a user-specified elapsed time, rounded to one decimal place.
 */

import java.util.Scanner; // import the scanner toolbox

public class ObjectHeight {
    public static void main(String[] args) {
        //variables are time and height
        Scanner scanner = new Scanner(System.in);
        double time = 0.0;
        double height = 0.0;

        System.out.print("Enter a time less than 4.5 seconds: ");
        time = scanner.nextDouble(); // get the input for time
        
        height = 100.0 - (4.9 * time * time);// Calculate height
        
        System.out.format("The height of the object is: %.1f meters%n", height); // Display formatted results
        
        scanner.close(); //close scanner
    }
    
}
