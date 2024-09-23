/**
 * TP1 exercice 4
 * TDA
 * Maël
 */
package tp1_stats_remy;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Maël
 */
public class TP1_stats_REMY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tab[] = new int [6];
        int m;
        Random generateurAleat = new Random();
        
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Choisissez un entier");
        m = sc.nextInt();
        for(int i = 1; i<=6; i++){
            tab[i]= generateurAleat.nextInt(5);//
        }
        System.out.println(tab);
        }
        
        
    }
}
}
