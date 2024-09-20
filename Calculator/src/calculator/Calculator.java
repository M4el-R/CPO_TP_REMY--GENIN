/**
 *TP0 exercice 
 * TDA
 * Maël
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Maël
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Please enter the operator \n1) add\n2) substract\n3) multiply\n4) divide\n5)modulo");
        operation = sc.nextInt();
        
    }       
}
