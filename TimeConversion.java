/**
 * Name: Ethan Zhu
 * Date: July 16, 2026
 * Description: Converts a user-specified total number of minutes into hours and minutes, 
 *              using a division math trick to ensure minutes display with two digits without if-statements.
 */

import java.util.Scanner; // import the scanner toolbox

public class TimeConversion {
    public static void main(String[] args) {
        // Declare and assign variables
        Scanner scanner = new Scanner(System.in);
        int totalMinutes = 0;
        int hours = 0;
        int remainingMinutes = 0;
        int tensDigit = 0;
        int onesDigit = 0;
        
        // Prompt user and get input
        System.out.print("Enter the time in minutes: ");
        totalMinutes = scanner.nextInt();
        
        // conversions
        hours = totalMinutes / 60;
        remainingMinutes = totalMinutes % 60;

        // get the tens digit and the ones digit of the remaining minutes
        tensDigit = remainingMinutes / 10;
        onesDigit = remainingMinutes % 10;
        
        // Display formatted results
        System.out.println("The time is: " + hours + ":" + tensDigit + onesDigit);
        
        scanner.close();
    }
}