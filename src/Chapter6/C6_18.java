package Chapter6;

import java.util.Scanner;

/**
 * Enter a password to see if it is a valid password option
 *
 * @author Conner Kious
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;

        System.out.print("Enter a password. Must be at least 8 characters long. ");
        password = input.next();

        if (length(password) == false || letterDigit(password) == false || twoDigits(password) == false) {
            System.out.println("Invalid input.");
        }

        if (length(password) == true && letterDigit(password) == true && twoDigits(password) == true) {
            System.out.println("Your password was successful! Here is your password: " + password);
        }

    }

    public static boolean length(String password) {
        if (password.length() < 8) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean letterDigit(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean twoDigits(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                ++counter;
            }
        }
        if (counter < 2) {
            return false;
        } else {
            return true;
        }
    }

}
