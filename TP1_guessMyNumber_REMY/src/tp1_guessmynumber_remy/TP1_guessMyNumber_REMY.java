/**
 * TP1 exercice 3
 * TDA
 * Maël
 */
package tp1_guessmynumber_remy;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Maël
 */
public class TP1_guessMyNumber_REMY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generateurAleat = new Random();
        int n = 1;
        int reponse;
        int compteur = 0;
        int difficulte;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Choisissez une difficulte\n1) facile\n2) moyen\n3) difficile");
        difficulte = sc.nextInt();
        switch (difficulte) {
            case 1:
                n = generateurAleat.nextInt(100);//facile entre 1 et 100
                break;
            case 2:
                n = generateurAleat.nextInt(1000);//moyen entre 1 et 1000
                break;
            case 3:
                n = generateurAleat.nextInt(10000);//difficile entre 1 et 10 000
                break;
            default:
                System.out.println("erreur");
                break;
        }

        do {
            System.out.println();
            sc = new Scanner(System.in);
            System.out.println("Entrez un nombre");
            reponse = sc.nextInt();
            if (reponse < n) {
                System.out.println("C'est plus");
            }
            if (reponse > n) {
                System.out.println("C'est moins");
            }
            if (reponse == n) {
                System.out.println("Gagne");
            }
            compteur += 1;
        } while (reponse != n);
        System.out.println("Fait en " + compteur + " coups.");

    }

}
