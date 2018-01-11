package Chapter5;

import java.util.Scanner;

/**
 * Play a game of rock, paper, scissors with a computer
 *
 * @author Conner Kious
 *
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int win = 0;
        String response, game;

        System.out.print("Would you like to play a game of Rock, Paper, Scissors? ");
        response = input.next().toLowerCase();

        if (response.equals("yes")) {
            System.out.println("Great! Let's play. ");
        }

        do {
            int rN = (int) (Math.random() * 3);
            int rock = 0, paper = 1, scissors = 2, computer;
            computer = rN;
            System.out.print("Choose one rock, paper, or scissors. ");
            game = input.next().toLowerCase();

            //Rock
            if (game.equals("rock") && computer == 2) {
                System.out.println("It looks like you won. I chose scissors and you chose rock.\n");
                ++win;
            } else if (game.equals("rock") && computer == 1) {
                System.out.println("It looks like I have won. I chose paper and you chose rock.\n");
            } else if (game.equals("rock") && computer == 0) {
                System.out.println("It looks like we have tied. We both chose rock.\n");
            } //Paper
            else if (game.equals("paper") && computer == 0) {
                System.out.println("It looks like you have won. I chose rock and you chose paper.\n");
                ++win;
            } else if (game.equals("paper") && computer == 2) {
                System.out.println("It looks like I have won. I chose scissors and you chose paper.\n");
            } else if (game.equals("paper") && computer == 1) {
                System.out.println("It looks like we have tied. We both chose paper.\n");
            } //Scissors
            else if (game.equals("scissors") && computer == 1) {
                System.out.println("It looks like you have won. I chose paper and you chose scissors.\n");
                ++win;
            } else if (game.equals("scissors") && computer == 0) {
                System.out.println("It looks like I have won. I chose rock and you chose scissors.\n");
            } else if (game.equals("scissors") && computer == 2) {
                System.out.println("It looks like we have tied. We both chose scissors.\n");
            } else {
                System.out.println("Invalid input.");
            }

        } while (win < 2);
        System.out.println("Thank you for playing.");

    }
}
