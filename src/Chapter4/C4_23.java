package Chapter4;

import java.util.Scanner;

/**
 * Take the info of an employee and find the gross earnings and deduction from
 * their pay
 *
 * @author Conner Kious
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        Double hoursWorked, payRate, fedTax, fedDeduction, stateTax, stateDeduction, totalDeduction, grossPay, netPay;

        System.out.print("Enter an employee's name: ");
        name = input.nextLine();

        System.out.print("Enter number of hours worked: ");
        hoursWorked = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        payRate = input.nextDouble();

        System.out.print("Ener federal tax withholding (decimal please): ");
        fedTax = input.nextDouble();

        System.out.print("Enter state tax withholding (decimal please): ");
        stateTax = input.nextDouble();

        grossPay = hoursWorked * payRate;
        fedDeduction = grossPay * fedTax;
        stateDeduction = grossPay * stateTax;
        totalDeduction = stateDeduction + fedDeduction;
        netPay = (grossPay - fedDeduction) - stateDeduction;

        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.printf("Pay Rate: $%4.2f \n", payRate);
        System.out.printf("Gross Pay: $%4.2f \n", grossPay);
        System.out.println("Deductions:");
        System.out.printf("Federal Withholding (%2.3f%%): $%2.2f \n", (fedTax * 100), fedDeduction);
        System.out.printf("State Withholding (%2.3f%%): $%4.2f \n", (stateTax * 100), stateDeduction);
        System.out.printf("Total Deduction: $%4.2f \n", totalDeduction);
        System.out.printf("Net Pay: $%4.2f \n", netPay);
    }

}
