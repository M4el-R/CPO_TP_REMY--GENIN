/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_remy;

import Armes.*;
import java.util.ArrayList;
import Personages.*;

/**
 *
 * @author Maël
 */
public class TP3_Heroic_Fantasy_REMY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Epee Excalibur = new Epee(7, "Excalibur", 5);
        Epee Durandal = new Epee(4, "Durandal", 7);
        Baton Chene = new Baton(4, "Chene", 5);
        Baton Charme = new Baton(5, "Charme", 6);

        ArrayList<Arme> stuff = new ArrayList<Arme>();
        stuff.add(Excalibur);
        stuff.add(Durandal);
        stuff.add(Chene);
        stuff.add(Charme);
        for (int i = 0; i <= stuff.size() - 1; i++) {
            System.out.print("L'arme " + stuff.get(i).GetNom() + " a " + stuff.get(i).GetAttaque() + " d'attaque et ");

            if (stuff.get(i) instanceof Baton) {
                System.out.println(((Baton) stuff.get(i)).getAge() + " d'age.");
            }
            if (stuff.get(i) instanceof Epee) {
                System.out.println(((Epee) stuff.get(i)).getFinesse() + " de finesse.");
            }
        }

        Personnage Gandalf = new Magicien(true, "Gandalf", 65);
        Personnage Garcimore = new Magicien(false, "Garcimore", 44);
        Personnage Conan = new Guerrier(false, "Conan", 78);
        Personnage Lannister = new Guerrier(true, "Lannister", 45);

        ArrayList<Personnage> liste = new ArrayList<Personnage>();
        liste.add(Gandalf);
        liste.add(Garcimore);
        liste.add(Conan);
        liste.add(Lannister);

        for (int i = 0; i <= liste.size() - 1; i++) {
            System.out.print("Le heros " + liste.get(i).GetNom() + " a " + liste.get(i).GetPV() + " pv et ");

            if (liste.get(i) instanceof Magicien) {
                System.out.println(((Magicien) liste.get(i)).Confirme());
            }
            if (liste.get(i) instanceof Guerrier) {
                System.out.println(((Guerrier) liste.get(i)).Cheval());
            }
        }
    }
}
