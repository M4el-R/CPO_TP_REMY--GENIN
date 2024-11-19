/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author Maël
 */
public abstract class Arme {

    String nom;
    private int attaque;

    public Arme(String nom, int attaque) {
        this.nom = nom;
        if (attaque > 100) {
            this.attaque = 0;
            System.out.println("L'attaque de votre arme est devenu nulle");
        } else {
            this.attaque = attaque;
        }
    }

    public void SetAttaque(int attaque) {
        if (attaque > 100) {
            this.attaque = 0;
            System.out.println("L'attaque de votre arme est devenu nulle");
        } else {
            this.attaque = attaque;
        }
    }

    public int GetAttaque() {
        return this.attaque;
    }

    public String GetNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", attaque=" + attaque + '}';
    }

}
