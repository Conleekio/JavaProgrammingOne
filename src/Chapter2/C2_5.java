package Chapter2;

import java.util.Scanner;

/**
 * To calculate and display a tip when at a restaurant without fixed values
 *
 * @author Conner Kious
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tipRate, calcTip, foodTotal, grandTotal;

        System.out.print("What was the total of your meal without a tip? ");
        foodTotal = input.nextDouble();

        System.out.print("What percent would you like to tip today? (just enter a number)");
        tipRate = input.nextDouble();

        calcTip = (tipRate / 100) * foodTotal;
        grandTotal = calcTip + foodTotal;

        System.out.println("Your tip today was " + calcTip + " and your grand total is $" + grandTotal);
    }

}
