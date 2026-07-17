/**
 * Name: Ethan Zhu
 * Date: July 16, 2026
 * Description: Calculates the energy produced from a given mass using E=mc^2 and 
 *              determines the equivalent number of 100-watt light bulbs powered, 
 *              formatting the output in scientific notation.
 */

import java.util.Scanner; // import the scanner toolbox

public class Energy {
    public static void main(String[] args) {
        // assign variables
        Scanner scanner = new Scanner(System.in);
        double mass = 0.0;
        final double SPEED_OF_LIGHT = 3.0*100000000; // c = 3.0 * 10^8 m/s
        double energyJoules = 0.0;
        double bulbsPowered = 0.0;
        
        // Input mass from user
        System.out.print("Enter the mass in kilograms: ");
        mass = scanner.nextDouble();
        
        // Perform calculations
        energyJoules = mass * SPEED_OF_LIGHT * SPEED_OF_LIGHT;
        bulbsPowered = energyJoules / 360000.0; // 3.6E5 Joules per bulb-hour
        
        // Display formatted results + use scientific notation
        System.out.format("The energy produced in Joules is = %.1E%n", energyJoules);
        System.out.format("The number of 100-watt light bulbs powered = %.1E%n", bulbsPowered);
        
        scanner.close();
    }
}