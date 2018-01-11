package Chapter5;

import java.util.Scanner;

/**
 * Record yes and no votes until stopped and will display number of yes and no
 * votes
 *
 * @author Conner Kious
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String answer;
        int yes = 0, no = 0;

        do {

            System.out.print("Enter 'Y' to vote yes, 'N' to vot no, or 'Q' to quit voting. ");
            answer = input.next().toLowerCase();

            if (answer.equals("y")) {
                ++yes;
            } else if (answer.equals("n")) {
                ++no;
            } else if (answer.equals("q")) {
                break;
            } else if (!answer.equals("y") || !answer.equals("n") || answer.equals("q")) {
                System.out.println("Invalid input.");
            }

        } while (answer.equals("y") || answer.equals("n") || !answer.equals("y") || !answer.equals("n") || answer.equals("q"));

        System.out.println("The amount of yes votes were: " + yes);
        System.out.println("The amount of no votes were: " + no);

    }
}
