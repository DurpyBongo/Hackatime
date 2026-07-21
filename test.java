import java.util.Scanner; // include the scanner toolbox
public class test // name of class
{ // start of class
  public static void main(String[] args) // magic line
  { // start of main method
  	// my four variables that I will use for my word
    char letter_1 = ' '; 
    char letter_2 = ' ';  
    char letter_3 = ' '; 
    char letter_4 = ' ';  
    char letter_5 = ' '; 
    char ASCII_1 = ' ';  // will hold the new value of the character
    char ASCII_2 = ' ';  
    char ASCII_3 = ' '; 
    char ASCII_4 = ' ';
    char ASCII_5 = ' ';
    int offset = 0; // my offset value
    char char_offset = ' ';
    String word = null; // will hold the 4 letter word
    Scanner scan = new Scanner(System.in); // instantiate Scanner
	    
      System.out.print("Please only enter a 5 letter word: ");
      word = scan.nextLine();
      letter_1 = word.charAt(0); // only need a single char
      letter_2 = word.charAt(1); // only need a single char
      letter_3 = word.charAt(2); // only need a single char
      letter_4 = word.charAt(3); // only need a single char
      letter_5 = word.charAt(4); // only need a single char

    // ask for the offset value
      System.out.print("Please enter an offset value (2-25): ");
      offset = scan.nextInt();

    // scramble each letter of the word
      ASCII_1 = (char) (letter_1 + offset);
      ASCII_2 = (char) (letter_2 + offset);
      ASCII_3 = (char) (letter_3 + offset);
      ASCII_4 = (char) (letter_4 + offset);
      ASCII_5 = (char) (letter_5 + offset);
      System.out.print("Your scrambled word is "+ASCII_1+""+ASCII_2);
      System.out.println(""+ASCII_3+""+ASCII_4+""+ASCII_5);
      System.out.println("Your original word was "+word);
      scan.close(); // close off Scanner

  } //end of main method
}// end of class