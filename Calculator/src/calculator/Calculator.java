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
        int operateur;
        float operande1;
        float operande2;
    
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Please enter the operator \n1) add\n2) substract\n3) multiply\n4) divide\n5)modulo");
        operateur = sc.nextInt();
        System.out.println("Saisissez votre premier nombre.");
        operande1 = sc.nextFloat();
        System.out.println("Saisissez votre second nombre.");
        operande2 = sc.nextFloat();
        if(operateur == 1)
            System.out.println("Le resultat est "+(operande1+operande2));
        if(operateur == 2)
            System.out.println("Le resultat est "+(operande1-operande2));
        if(operateur == 3)
            System.out.println("Le resultat est "+(operande1*operande2));
        if(operateur == 4)
            System.out.println("Le resultat est "+(operande1/operande2));
        if(operateur == 5)
            System.out.println("Le resultat est "+(operande1%operande2));
        
    }       
}
