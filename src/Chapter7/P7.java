package Chapter7;

import java.util.Scanner;

/**
 * Take a user entered array and find the total average of all of the numbers in
 * the array then print out the original array entered
 *
 * @author Conner Kious
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        // Obtaining input
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will be in the array: ");
        int num = input.nextInt(); //size of the array
        int[] array = new int[num];

        System.out.print("Enter " + array.length + " elements: ");

        // Method calling
        arrayReader(array, input);
        System.out.println("The average is " + Average(array));
        printArray(array);
    }

    /**
     * static Method - reader for the input for the array variable
     *
     * @param array user entered array
     * @param input will read the input from
     */
    public static void arrayReader(int[] array, Scanner input) {
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
    }

    /**
     * method - find the average of the array entered
     *
     * @param array the array that was entered earlier by the user
     * @return double - the average amount of all of the numbers in the array
     * list
     */
    public static double Average(int[] array) {
        int total = 0;
        for (int element : array) {
            total += element;
        }
        return (total / array.length);
    }

    /**
     * static method - prints the array the user enters
     *
     * @param array the array the user entered earlier in the program
     */
    public static void printArray(int[] array) {
        System.out.println("The array is:");
        System.out.println(java.util.Arrays.toString(array));
    }

}
