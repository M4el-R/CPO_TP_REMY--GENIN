/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personages;

/**
 *
 * @author Maël
 */
public class Magicien extends Personnage {

    boolean confirme;

    public Magicien(boolean confirme, String nom, int pv) {
        super(nom, pv);
        this.confirme = confirme;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    public String Confirme() {
        if (confirme == true) {
            return "est confirme";
        } else {
            return "n'est pas confirme";
        }
    }
}

}
