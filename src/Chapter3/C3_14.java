package Chapter3;

import java.util.Scanner;

/**
 * Play against a computer to see if you can guess which side a coin will land
 * on in a coin toss! This program uses a random number generator
 *
 * @author Conner Kious
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double guess;
        int coin = (int) (Math.random() * 2);

        System.out.print("You're about to flip a coin! Enter 0 if you think it will be heads! Enter 1 if you think it will be tails! ");
        guess = input.nextDouble();

        if (coin == guess) {
            System.out.println("You guessed correctly!");
        } else {
            System.out.println("Sorry, you're incorrect.");
        }

    }

}
