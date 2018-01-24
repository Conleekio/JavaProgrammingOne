package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Compare two lists to see if they are exactly identical
 *
 * @author Conner Kious
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        System.out.print("Enter the length of your first list: ");
        Scanner input = new Scanner(System.in);

        int list1[] = new int[input.nextInt()];
        System.out.println("Enter your first list: ");
        for (int x = 0; x < list1.length; x++) {
            list1[x] = input.nextInt();
        }

        System.out.print("Enter the length of your second list: ");
        int list2[] = new int[input.nextInt()];
        System.out.println("Enter your second list: ");
        for (int x = 0; x < list2.length; x++) {
            list2[x] = input.nextInt();
        }

        System.out.println(equals(list1, list2) ? "The two lists are identical. " : "The lists are not identical. ");
    }

    /**
     * Method Boolean - Return true or false if the lists are identical
     *
     * @param list1 the first list the user entered
     * @param list2 the second list the user entered
     * @return true or false that the two lists are exactly identical
     */
    public static boolean equals(int list1[], int list2[]) {
        if (list1.length != list2.length) {
            return false;
        }

        return Arrays.equals(list1, list2);

    }
}
