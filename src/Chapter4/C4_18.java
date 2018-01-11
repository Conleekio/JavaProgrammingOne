package Chapter4;
import java.util.Scanner;

/**
 * Find and display what major and year you are in school
 * 
 * @author Conner Kious
 */
public class C4_18 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("M: Mathematics \n"
                + "C: Computer Science \n"
                + "I: Information Technology \n");

        System.out.print("Enter a a program and year (year will be 1-4): ");
        String answer = input.next().toUpperCase();

        String majorOfChoice;
        String yearOfStudent = null;

        char number = answer.charAt(0);
        char letter = answer.charAt(1);

        switch (number) {
            case 'M':
                majorOfChoice = "Mathematics ";
                break;
            case 'C':
                majorOfChoice = "Computer Science ";
                break;
            case 'I':
                majorOfChoice = "Information Technology ";
                break;
            default:
                majorOfChoice = "Invalid";

                break;
        }
        if (!(majorOfChoice.equals("Invalid"))) {
            switch (letter) {
                case '1':
                    yearOfStudent = "Freshamn";
                    break;
                case '2':
                    yearOfStudent = "Sophomore";
                    break;
                case '3':
                    yearOfStudent = "Junior";
                    break;
                case '4':
                    yearOfStudent = "Senior";
                    break;
                default:
                    yearOfStudent = "input.";
                    break;
            }
        } if (majorOfChoice.equals("Invalid") || yearOfStudent.equals("input.")) {
            System.out.println("Invalid Input");
        } else {
            System.out.println(majorOfChoice + yearOfStudent);
        }
    }

}
