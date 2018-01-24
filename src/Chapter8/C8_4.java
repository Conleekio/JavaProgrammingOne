package Chapter8;

import java.util.Arrays;

/**
 * Display the hours employees worked and sort them from greatest to least
 *
 * @author Conner Kious
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        int employee[][] = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };
        int totalTotals = 0;
        int total[] = new int[8];
        printDay(employee);

        for (int row = 0; row < employee.length; row++) {
            System.out.print("\nEmployee " + row + ":\t");
            int index[] = new int[8];

            for (int column = 0; column < employee[row].length; column++) {

                totalTotals += employee[row][column];

                System.out.print(employee[row][column] + "\t");

                if (column == 6) {
                    total[row] = totalTotals;
                    System.out.println(total[row]);
                }

            }
            totalTotals = 0;
        }

    }

    /**
     * static method - print out the chart for the employee and hours
     *
     * @param x the values of the multidimensional array the user input earlier
     *
     */
    public static void printDay(int x[][]) {
        String day = "                Su      M       T       W       Th      F       Sa      Total";
        System.out.println(day + "\t");
    }

}
