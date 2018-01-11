package Chapter3;

import java.util.Scanner;

/**
 * Is a number divisible by 5 or 6 or divisible by both?
 *
 * @author Conner Kious
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num;

        System.out.print("Enter an integer: ");
        num = input.nextDouble();

        boolean five = (num % 5 == 0);
        boolean six = (num % 6 == 0);

        System.out.print("Is " + num + " divisible by 5 and 6? ");
        if (five && six == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.print("Is " + num + " diviible by 5 or 6? ");
        if (five || six == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.print("Is " + num + " divisible by 5 or 6, but not both? ");
        if (five ^ six == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

}
