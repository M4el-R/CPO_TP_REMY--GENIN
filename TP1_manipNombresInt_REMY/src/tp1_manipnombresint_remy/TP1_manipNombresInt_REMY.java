/**
 *TP1-Syntaxe de base 
 * TDA
 * Maël 
 */
package tp1_manipnombresint_remy;

import java.util.Scanner;

/**
 *
 * @author Maël
 */
public class TP1_manipNombresInt_REMY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        int b;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Choisissez un nombre entier");
        a = sc.nextInt();
        System.out.println("Choisissez un second nombre entier");
        b = sc.nextInt();
        System.out.println(a +"\n"+ b);
        System.out.println("Voici respectivement la somme, la difference ainsi que le produit de ces deux nombres");
        System.out.println((a+b) +"\n"+ (a-b) +"\n"+ (a*b));
        System.out.println("Voici le quotient de a par b: "+a/b+"\nainsi que le reste de la division euclidienne de a par b: "+a%b);
    }
    
}
