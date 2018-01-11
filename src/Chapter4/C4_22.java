package Chapter4;
import java.util.Scanner;

/**
 *Compare two strings and display if the two strings are identical or not
 * 
 * @author Conner Kious
 */
public class C4_22 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a string (a word, phrase, or series of letters): ");
    String stringOne = input.nextLine();
    
    System.out.print("Now enter a nother string to see if it is a substring! ");
    String stringTwo = input.nextLine();
            
    if(stringOne.contains(stringTwo) == true)
    System.out.println(stringTwo + " is a substring of " + stringOne + ".");
    else{
        System.out.println(stringTwo +" is not a substring of " + stringOne + ".");
        }    
    }

}
