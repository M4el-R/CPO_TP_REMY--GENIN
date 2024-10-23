/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_remy;

/**
 *
 * @author Maël
 */
public class Personne {

    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures = new Voiture[3];

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {

        if (this.nbVoitures > 3) {
            return false;
        }
        liste_voitures[this.nbVoitures] = voiture_a_ajouter;
        nbVoitures += 1;
        voiture_a_ajouter.proprietaire = this;

        return true;
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }

}
