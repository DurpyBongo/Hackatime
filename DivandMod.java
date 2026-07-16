import java.util.Scanner; // import the scanner toolbox

public class DivandMod {
    public static void main(String[] args) {
        // Declare and assign variables
        Scanner scanner = new Scanner(System.in);
        int int1 = 0;
        int int2 = 0;
        
        // Prompt user and get inputs
        System.out.print("Enter an integer: ");
        int1 = scanner.nextInt();
        System.out.print("Enter a second integer: ");
        int2 = scanner.nextInt();
        
        // Calculate and output divisions and modulations
        System.out.println(int1 + " / " + int2 + " = " + (int1 / int2));
        System.out.println(int1 + " % " + int2 + " = " + (int1 % int2));
        System.out.println(int2 + " / " + int1 + " = " + (int2 / int1));
        System.out.println(int2 + " % " + int1 + " = " + (int2 % int1));
        
        scanner.close();
    }
}