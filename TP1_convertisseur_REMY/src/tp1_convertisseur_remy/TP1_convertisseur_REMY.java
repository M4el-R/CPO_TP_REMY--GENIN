/**
 * TP1 Un convertisseur de températures
 * TDA
 * Maël
 */
package tp1_convertisseur_remy;

import java.util.Scanner;

/**
 *
 * @author Maël
 */
public class TP1_convertisseur_REMY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int commande;
        double deg;

        Scanner sc;
        sc = new Scanner(System.in);
        //partie5
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :\n1) De Celcius vers Kelvin\n2) De Kelvin vers Celcius\n3) De Farenheit vers Celcius\n4) De Celcius vers Farenheit\n5) De Kelvin vers Farenheit\n6) De Farenheit vers Kelvin");
        commande = sc.nextInt();
        if (commande > 6) {
            System.out.println("Il y a un problème");
            System.exit(0);
        }
        System.out.println("Saisissez une valeur");
        deg = sc.nextDouble();
        if (commande == 1) {
            System.out.println(deg + "degr Celcius est egal a " + CelciusVersKelvin(deg) + " degres Kelvin");
        }
        if (commande == 2) {
            System.out.println(deg + "degr Kelvin est egal a " + KelvinVersCelcius(deg) + " degres Celcius");
        }
        if (commande == 3) {
            System.out.println(deg + "degr Farenheit est egal a " + FarenheitVersCelcius(deg) + " degres Celcius");
        }
        if (commande == 4) {
            System.out.println(deg + "degr Celcius est egal a " + CelciusVersFarenheit(deg) + " degres Farenheit");
        }
        if (commande == 5) {
            System.out.println(deg + "degr Kelvin est egal a " + KelvinVersFarenheit(deg) + " degres Farenehit");
        }

        if (commande == 6) {
            System.out.println(deg + "degr Farenheit est egal a " + FarenheitVersKelvin(deg) + " degres Kelvin");
        }

    }

    public static double CelciusVersKelvin(double tCelcius) {
        //converti les degrés Celcius en degrés Kelvin
        return (tCelcius + 273);
    }

    public static double KelvinVersCelcius(double tKelvin) {
        //converti les degrés Celcius en degrés Kelvin
        return (tKelvin - 273);
    }

    public static double FarenheitVersCelcius(double tFarenheit) {
        // converti les degrés Farenheit en degrés Celcius
        return ((tFarenheit - 32)/1.8);
    }

    public static double CelciusVersFarenheit(double tCelcius) {
        // converti les degrés Celcius en degrés Farenheit
        return (1.8*tCelcius + 32);
    }

    public static double KelvinVersFarenheit(double tKelvin) {
        // converti les degrés Kelvin en degrés Farenheit
        return (CelciusVersFarenheit(KelvinVersCelcius(tKelvin)));
    }

    public static double FarenheitVersKelvin(double tFarenheit) {
        // converti les degrés Farenheit en degrés Kelvin
        return (CelciusVersKelvin(FarenheitVersCelcius(tFarenheit)));
    }

}
