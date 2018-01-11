package Chapter3;
import java.util.Scanner;
/**
 * With the weight and price of two packages find which one has a better shipping rate
 * 
 * @author Conner Kious
 */
public class C3_33 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        double pOneW, pOneP, pTwoW, pTwoP;
        
        System.out.print("Enter a weight for your package one: ");
        pOneW = input.nextDouble();
        System.out.print("Enter a price for package one: ");
         pOneP = input.nextDouble();
         
        System.out.print("Enter a weight for package two: ");
        pTwoW = input.nextDouble();
        System.out.print("Enter a price for package two: ");
        pTwoP = input.nextDouble();
        
        
        double pOneTotal, pTwoTotal;
        
        pOneTotal = (pOneP / pOneW);
        pTwoTotal = (pTwoP / pTwoW);
        
        if(pOneTotal < pTwoTotal)
            System.out.println("Package one has a better price.");
        else if (pOneTotal > pTwoTotal) {
            System.out.println("Package two has a better price.");     }
        else if (pOneTotal == pTwoTotal) {
	System.out.println("The packages are the same.");}

    }

}
