/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_manip_remy;

import java.util.Random;

/**
 *
 * @author Maël
 */
public class Moussaka {

    int nbCalories = 0;
    int calories;
    Moussaka[] tab_moussaka = new Moussaka[10];

    public Moussaka(int calories) {
        nbCalories += calories;

    }

    public void Attribution(int calories) {
        nbCalories += calories;
    }

    
    
}
