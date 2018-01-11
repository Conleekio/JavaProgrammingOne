package Chapter2;

/**
 * Display the area and volume of a cylinder with user input values
 *
 * @author Conner Kious
 */
import java.util.Scanner;

public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius, area, volume, length, pi = 3.14;

        System.out.print("What is the radius of your clyinder? ");
        radius = input.nextDouble();

        System.out.println("What is your length ");
        length = input.nextDouble();

        area = radius * radius * pi;
        volume = area * length;

        System.out.println("The area of your cylinder is " + area + " and the volume of your cylinder is " + volume);
    }

}
