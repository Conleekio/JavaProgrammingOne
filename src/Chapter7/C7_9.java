package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Enter an array of numbers and find the smallest number in the array/list
 *
 * @author Conner Kious
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.println("Enter ten numbers: ");
        Scanner input = new Scanner(System.in);
        double array[] = new double[10];
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }
        System.out.println("The smallest number is: " + smallest(array));
    }

    /**
     * method double - will search for the smallest value in the array of the
     * ten numbers entered
     *
     * @param array the array entered earlier for sorting
     * @return double - the smallest number out of the ten entered
     */
    public static double smallest(double array[]) {
        Arrays.sort(array);
        double smallest = array[0];
        return smallest;
    }
}
