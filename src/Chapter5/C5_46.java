package Chapter5;

import java.util.Scanner;

/**
 * Enter a string and see it displayed back to you in reverse
 *
 * @author Conner Kious
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            String string;
            System.out.print("Enter a string: ");
            string = input.next().toUpperCase();

            String reverse = new StringBuffer(string).reverse().toString();
            System.out.println("The reversed string is " + reverse);
        }
    }

}
