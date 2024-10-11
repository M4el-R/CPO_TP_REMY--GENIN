/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_remy;

import java.util.Scanner;

/**
 *
 * @author Maël
 */
public class TP2_convertisseurObjet_REMY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Convertisseur objet = new Convertisseur();
        System.out.println(objet);
        int commande;
        double deg;

        Scanner sc;
        sc = new Scanner(System.in);
        //partie5
        commande = 1;
        while (commande != 0) {
            System.out.println("Saisissez la conversion que vous souhaiter effectuer :\n1) De Celcius vers Kelvin\n2) De Kelvin vers Celcius\n3) De Farenheit vers Celcius\n4) De Celcius vers Farenheit\n5) De Kelvin vers Farenheit\n6) De Farenheit vers Kelvin \nSaisissez 0 pour arreter");
            commande = sc.nextInt();
            if (commande > 6) {
                System.out.println("Il y a un problème");
                System.exit(0);
            }
            if (commande == 0) {
                break;
            }
            System.out.println("Saisissez une valeur");
            deg = sc.nextDouble();

            switch (commande) {

                case 1:
                    objet.CelciusVersKelvin(deg);
                    break;
                case 2:
                    objet.KelvinVersCelcius(deg);
                    break;
                case 3:
                    objet.FarenheitVersCelcius(deg);
                    break;
                case 4:
                    objet.CelciusVersFarenheit(deg);
                    break;
                case 5:
                    objet.KelvinVersFarenheit(deg);
                    break;
                case 6:
                    objet.FarenheitVersKelvin(deg);
                    break;
            }

        }
        System.out.println(objet);

    }

}
