/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personages;

/**
 *
 * @author Maël
 */
public class Guerrier extends Personnage {

    boolean cheval;

    public Guerrier(boolean cheval, String nom, int pv) {
        super(nom, pv);
        this.cheval = cheval;
    }

    public String Cheval() {
        if (cheval == true) {
            return "est a cheval";
        } else {
            return "n'est pas a cheval";
        }
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }

}
