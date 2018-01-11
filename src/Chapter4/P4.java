package Chapter4;

import java.util.Scanner;

/**
 * Take input from two users bidding on workers
 * @author Conner Kious
 */
public class P4 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
     public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("What is the name of bidder one? ");
    String bidder1 = input.next();
    System.out.print("What will the amount of hours the first bibber requires? ");
    double hoursAmount1 = input.nextDouble();
    System.out.print("How much does " +bidder1+ " charge per hour? ");
    double payRate1 = input.nextDouble();
    
    System.out.print("What is the name of bidder two? ");
    String bidder2 = input.next();
    System.out.print("What will the amount of hours the second bidder requires? ");
    double hoursAmount2 = input.nextDouble();
    System.out.print("How much does " +bidder2+ "charge per hour? ");
    double payRate2 = input.nextDouble();
    
    double grossPay1, grossPay2;
    
    grossPay1 = hoursAmount1 * payRate1;
    grossPay2 = hoursAmount2 * payRate2;
    
    System.out.println("  ");
    System.out.printf(bidder1+ "'s gross pay woudld be %3.2f \n" ,grossPay1);
    System.out.printf(bidder2+ "'s gross pay would be %3.2f" ,grossPay2);
    System.out.println("  ");
    
    if(grossPay1 == grossPay2 && hoursAmount1 == hoursAmount2){
        System.out.printf(bidder1+ " and " +bidder2+ " have the same hours and pay rate. No one wins. \n" +
                           bidder1+ "\n" +
                           "Hours: " +hoursAmount1+ "\n" +
                           "Pay rate: " +payRate1+ "\n" +
                           "Gross pay: %3.2" ,grossPay1);
        System.out.printf(bidder2+ "\n" +
                           "Hours: " +hoursAmount2+ "\n" +
                           "Pay rate: " +payRate2+ "\n" +
                           "Gross pay: %3.2", grossPay2);}
    
    else if(grossPay1 == grossPay2 && hoursAmount1 < hoursAmount2){
        System.out.println("The winner is " +bidder1+ "!" +
                           "The pay rates are the same but " +bidder1+ " have less hours that you have to work. Hours:"+hoursAmount1);}
    
    else if(grossPay1 == grossPay2 && hoursAmount2 <hoursAmount1){
    System.out.println("The winnder is "+bidder2+"!" +
                       "The pay rate are the same but " +bidder2+ "have less hours that you have to work. Hours:" +hoursAmount2);}
    
    else if(grossPay2 < grossPay1){
        System.out.printf("The winner is " +bidder1+ "! The total pay will be: %3.2f" ,grossPay1);}
    
    else if(grossPay1 < grossPay2){
        System.out.printf("The winner is " +bidder2+ "! The total pay will be: %3.2f" ,grossPay2);}
    
    else if (grossPay1 == grossPay2){
        System.out.printf(bidder1+" and " +bidder2+ " have the same pay. %3.2f \n" ,grossPay1);}
    
    
    
    
    }
}
