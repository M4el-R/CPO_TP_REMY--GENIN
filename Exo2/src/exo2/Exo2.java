/**
 * TP0 Exercice 2
 * TDA 
 * Maël
*/
package exo2;

import java.util.Scanner;

/**
 *
 * @author Maël
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaration des variables
        int nb; // nombre d'entiers a additionner        
        int result; //resulat
        int ind; //indice
        //nb = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb = sc.nextInt(); // On demande a sc de donner le prochain entier
        result = 0;
        
        // Addition des nb premiers entiers
        ind = 1;
        while (ind <= nb) {
            result += ind;
            ind +=1;
        }
        
        System.out.println();
        System.out.println("La somme des "+nb+" entiers est: "+result);
    }
    
}
