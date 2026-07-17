/**
 * Name: Ethan Zhu
 * Date: July 16, 2026
 * Description: Calculates the total days a user has been alive and the total hours they 
 *              have spent sleeping (assuming 8 hours/day) using simplified calendar math.
 */

import java.util.Scanner; // import the scanner toolbox

public class Sleep {
    public static void main(String[] args) {
        // Declare and assign variables
        Scanner scanner = new Scanner(System.in);
        int birthYear, birthMonth, birthDay;
        int currentYear, currentMonth, currentDay;
        int totalDays = 0;
        int sleepHours = 0;
        
        // get the birthdate from the user
        System.out.println("Enter your birthdate:");
        System.out.print("Year: ");
        birthYear = scanner.nextInt();
        System.out.print("Month: ");
        birthMonth = scanner.nextInt();
        System.out.print("Day: ");
        birthDay = scanner.nextInt();
        
        // get today's date from the user
        System.out.println("Enter today's date:");
        System.out.print("Year: ");
        currentYear = scanner.nextInt();
        System.out.print("Month: ");
        currentMonth = scanner.nextInt();
        System.out.print("Day: ");
        currentDay = scanner.nextInt();
        
        // Calculate days alive using simplified dates with 30 days/month, 365 days/year
        int birthTotalDays = (birthYear * 365) + (birthMonth * 30) + birthDay;
        int currentTotalDays = (currentYear * 365) + (currentMonth * 30) + currentDay;
        totalDays = currentTotalDays - birthTotalDays;
        
        // Calculate total sleep hours, which will be 8 hours per day
        sleepHours = totalDays * 8;
        
        // display results
        System.out.format("You have been alive for %,d days.%n", totalDays);
        System.out.format("You have slept %,d hours.%n", sleepHours);
        
        scanner.close();
    }
}