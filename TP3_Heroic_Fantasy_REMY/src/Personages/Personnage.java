/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personages;

import Armes.*;
import java.util.ArrayList;

/**
 *
 * @author Maël
 */
public abstract class Personnage {

    String nom;
    int pv;
    ArrayList<Arme> liste = new ArrayList<Arme>();
    Arme arme_equipe;

    public Personnage(String nom, int pv) {
        this.nom = nom;
        this.pv = pv;
    }

    public String GetNom() {
        return nom;
    }

    public int GetPV() {
        return pv;
    }

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", pv=" + pv + '}';
    }

    public ArrayList<Arme> AddArme(Arme Arme) {
        if (liste.size() > 5) {
            return liste;
        } 
        else {
            liste.add(Arme);
            return liste;
        }

    }
    
}
