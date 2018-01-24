package Chapter8;

import java.util.Scanner;

/**
 * User input salesmen info to display success between four salesmen
 *
 * @author Conner Kious
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String salesman, dayOfWeek, moreData = null;
        double amountOfSale;

        double[][] salesInfo = new double[4][5];
        String[][] dayOfWeekInfo = new String[4][5];

        do {
            System.out.println("Enter the salesman ID: A, B, C, D");
            salesman = input.next().toUpperCase();

            System.out.println("Enter the day of the week: M, T, W, H, F: ");
            dayOfWeek = input.next().toUpperCase();

            switch (salesman) {
                case "A":
                    switch (dayOfWeek) {
                        case "M":
                            System.out.println("Enter a sales amount: ");
                            salesInfo[0][0] = input.nextDouble();
                            break;
                        case "T":
                            System.out.println("Enter a sales amount: ");
                            salesInfo[0][1] = input.nextDouble();
                            break;
                        case "W":
                            System.out.println("Enter a sales amount: ");
                            salesInfo[0][2] = input.nextDouble();
                            break;
                        case "H":
                            System.out.println("Enter a sales amount: ");
                            salesInfo[0][3] = input.nextDouble();
                            break;
                        case "F":
                            System.out.println("Enter a sales amount: ");
                            salesInfo[0][4] = input.nextDouble();
                            break;
                    }
                    break;
                case "B":
                    switch (dayOfWeek) {
                        case "M":
                            System.out.println("Enter a sales amount: ");
                            salesInfo[1][0] = input.nextDouble();
                            break;
                        case "T":
                            System.out.println("Enter a sales amount: ");
                            salesInfo[1][1] = input.nextDouble();
                            break;
                        case "W":
                            System.out.println("Enter a sales amount: ");
                            salesInfo[1][2] = input.nextDouble();
                            break;
                        case "H":
                            System.out.println("Enter a sales amount: ");
                            salesInfo[1][3] = input.nextDouble();
                            break;
                        case "F":
                            System.out.println("Enter a sales amount: ");
                            salesInfo[1][4] = input.nextDouble();
                            break;
                    }
                    break;
                case "C":
                    switch (dayOfWeek) {
                        case "M":
                            System.out.println("Enter a sales amount: ");
                            salesInfo[2][0] = input.nextDouble();
                            break;
                        case "T":
                            System.out.println("Enter a sales amount: ");
                            salesInfo[2][1] = input.nextDouble();
                            break;
                        case "W":
                            System.out.println("Enter a sales amount: ");
                            salesInfo[2][2] = input.nextDouble();
                            break;
                        case "H":
                            System.out.println("Enter a sales amount: ");
                            salesInfo[2][3] = input.nextDouble();
                            break;
                        case "F":
                            System.out.println("Enter a sales amount: ");
                            salesInfo[2][4] = input.nextDouble();
                            break;
                    }
                    break;
                case "D":
                    switch (dayOfWeek) {
                        case "M":
                            System.out.println("Enter a sales amount: ");
                            salesInfo[3][0] = input.nextDouble();
                            break;
                        case "T":
                            System.out.println("Enter a sales amount: ");
                            salesInfo[3][1] = input.nextDouble();
                            break;
                        case "W":
                            System.out.println("Enter a sales amount: ");
                            salesInfo[3][2] = input.nextDouble();
                            break;
                        case "H":
                            System.out.println("Enter a sales amount: ");
                            salesInfo[3][3] = input.nextDouble();
                            break;
                        case "F":
                            System.out.println("Enter a sales amount: ");
                            salesInfo[3][4] = input.nextDouble();
                            break;
                    }
                    break;

            }

            do {
                System.out.println("Would you like to input more data (Y/N): ");
                moreData = input.next().toUpperCase();
            } while (!moreData.equals("N") && !moreData.equals("Y"));

        } while (moreData.equalsIgnoreCase("y"));
        if (moreData.equals("N")) {
            System.out.println("Salesman   \tM\tT\tW\tH\tF");
            System.out.print("A:\t");
            for (int x = 0; x < 5; x++) {
                System.out.print("\t" + salesInfo[0][x]);
            }
            System.out.println("");
            System.out.print("B:\t");
            for (int x = 0; x < 5; x++) {
                System.out.print("\t" + salesInfo[1][x]);
            }
            System.out.println("");
            System.out.print("C:\t");
            for (int x = 0; x < 5; x++) {
                System.out.print("\t" + salesInfo[2][x]);
            }
            System.out.println("");
            System.out.print("D:\t");
            for (int x = 0; x < 5; x++) {
                System.out.print("\t" + salesInfo[3][x]);
            }
            System.out.println("\t");
        }
    }
}
