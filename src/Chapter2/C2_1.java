package Chapter2;

import java.util.Scanner;

/**
 * The program below will take input data (number) and will convert them to
 * degrees in Fahrenheit and Celsius
 *
 * @author Conner Kious
 */

public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double fahrenheit, celsius;

        System.out.println("What is your degrees in celsius?");

        celsius = input.nextDouble();

        fahrenheit = (9.0 / 5) * celsius + 5;

        System.out.println("Your temperature in celsius is " + celsius + " degrees. Your temperature in fahrenheit is now " + fahrenheit + " degrees");

    }

}
