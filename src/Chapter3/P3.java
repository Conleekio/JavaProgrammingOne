package Chapter3;

import java.util.Scanner;

/**
 * Check if a number is in a range from 1-100 Check if your first and second
 * numbers are equal Check if your two numbers make a proper fraction Check what
 * letter grade the first number would be in an A-F grading scale
 *
 * @author Conner Kious
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number1, number2;

        System.out.print("Enter a number: ");
        number1 = input.nextDouble();

        System.out.print("Enter a second number: ");
        number2 = input.nextDouble();

        if (number2 >= 1 && number2 <= 100) {
            System.out.println("Your number is in range.");
        } else if (number2 <= 1 && number2 >= 100) {
            System.out.println("Your number is out of range.");
        }

        if (number1 < number2) {
            System.out.println("Your first number is less than your second number.");
        }

        if (number1 <= number2) {
            System.out.println("Your first number is less than or equal to your second number");
        }

        if (number1 > number2) {
            System.out.println("Your first number is bigger than your second number.");
        }

        if (number1 == number2) {
            System.out.println("Your first and second number are the same, they equal each other.");
        }

        if (number1 != number2) {
            System.out.println("Your numbers don't equal each other.");
        }

        boolean fraction;
        fraction = number1 / number2 < 1;
        if (number1 == 0) {
            System.out.println("Cannot compute");
        } else if (fraction == true) {
            System.out.println("Your numbers are a proper fraction.");
        } else if (fraction == false) {
            System.out.println("Your numbers are an improper fraction.");
        }

        if (number1 >= 90) {
            System.out.println(+number1 + " = A");
        } else if (number1 >= 80) {
            System.out.println(+number1 + " = B");
        } else if (number1 >= 70) {
            System.out.println(+number1 + " = C");
        } else if (number1 >= 60) {
            System.out.println(+number1 + " = D");
        } else if (number1 <= 59) {
            System.out.println(+number1 + " = F");
        }
    }
}
