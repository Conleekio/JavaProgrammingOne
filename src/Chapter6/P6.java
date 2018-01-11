package Chapter6;

import java.util.Scanner;

/**
 * Convert your US dollars into yen, euros, and pounds sterling
 *
 * @author Conner Kious
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double euro, pound, yen, dollar, reduction, convert, currency = 0;
        String response, keepGoing;

        System.out.print("Enter the conversion rate for euros: ");
        euro = input.nextDouble();

        System.out.print("Enter the conversion rate for pounds: ");
        pound = input.nextDouble();

        System.out.print("Enter the conversion rate for yen: ");
        yen = input.nextDouble();
        do {
            System.out.print("Enter the amount of US dollars you would like to convert: ");
            dollar = input.nextDouble();

            System.out.print("Would you like to convert your money to Euros (E), Pounds Sterling (P), Yen (Y): ");
            response = input.next().toLowerCase();

            switch (response) {
                case "e":
                    convert = Converter(euro, dollar);
                    System.out.printf("Your amount of euros: %6.2f", convert);
                    break;

                case "p":
                    convert = Converter(pound, dollar);
                    System.out.printf("Your amount of pounds: %6.2f", convert);

                    break;

                case "y":
                    convert = Converter(yen, dollar);
                    System.out.printf("Your amount of yen: %6.2f", convert);

                    break;
            }
            do {
                System.out.print("\nWould you like to convert more money? (Rates stay the same) (yes or no) ");
                keepGoing = input.next().toLowerCase();
            } while (!keepGoing.equals("no") && !keepGoing.equals("yes"));

        } while (keepGoing.equals("yes"));
    }

    /**
     * Convert the amount of US dollars to another currency
     *
     * @param currency the amount of money you are getting back after your
     * conversion
     * @param dollar the amount of US dollars you are using in the conversion
     * @return the amount of converted money you will be receiving
     *
     */
    public static double Converter(double currency, double dollar) {
        double result;
        if (dollar > 100) {
            dollar = dollar * .95;
        } else {
            dollar = dollar * .9;
        }

        result = dollar * currency;
        return result;
    }
}
