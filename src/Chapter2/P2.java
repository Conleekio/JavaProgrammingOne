package Chapter2;

import java.util.Scanner;

/**
 * Calculate total price of a whole 3 course meal before and after tax and
 * before and after a tip; display all totals; some fixed values: tip and tax
 * amount
 *
 * @author Conner Kious
 */


public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double foodPrice, drinkPrice, dessertPrice, taxAmount, tax, tip, tipAmount, foodNTax, firstTotal, finalTotal;

        taxAmount = 0.10;
        tipAmount = 0.15;

        System.out.print("What was the price of the food that you ordered? ");
        foodPrice = input.nextDouble();

        System.out.print("What is the price of the drink(s) you ordered? ");
        drinkPrice = input.nextDouble();

        System.out.print("What was the price of the dessert(s) you ordered? ");
        dessertPrice = input.nextDouble();

        firstTotal = foodPrice + drinkPrice + dessertPrice;

        tax = firstTotal * taxAmount;
        foodNTax = tax + firstTotal;
        tip = (foodNTax * tipAmount);
        finalTotal = tip + tax + firstTotal;

        System.out.println("Your food entire meal total without tax or a tip is $" + firstTotal + ".");
        System.out.println("Your tax is $" + tax + ".");
        System.out.println("Your tip is $" + tip + ".");
        System.out.println("Your final total with a 15% tip and a 10% tax is $" + finalTotal + ".");
    }
}
