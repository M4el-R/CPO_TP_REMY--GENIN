/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_remy;

/**
 *
 * @author Maël
 */
public class TP2_relation_1_REMY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles " + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);

        bob.ajouter_voiture(uneClio);
        bob.ajouter_voiture(une2008);

        reno.liste_voitures[0] = uneAutreClio;
        reno.liste_voitures[1] = uneMicra;
        uneMicra.proprietaire = reno;
        uneAutreClio.proprietaire = reno;
        reno.nbVoitures = 2;

        System.out.println("Bob a " + bob.nbVoitures + " voitures");
        System.out.println("Proprietaire de la micra:  " + uneMicra.proprietaire);
        System.out.println("La premiere voiture de Bob est " + bob.liste_voitures[0]);
        System.out.println("La deuxieme voiture de Bob est " + bob.liste_voitures[1]);

    }

}
