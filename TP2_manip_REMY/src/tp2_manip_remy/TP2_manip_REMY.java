/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_remy;

import java.util.Random;
/**
 *
 * @author Maël
 */
public class TP2_manip_REMY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Moussaka[] tab_moussaka = new Moussaka[10];
        
        Tartiflette assiete1 = new Tartiflette(500);
        Tartiflette assiete2 = new Tartiflette(600);
        Tartiflette assiete3 = assiete2;
        assiete3.Attribution(1000);
        assiete3 = assiete1;
        assiete1 = assiete2;
        assiete2 = assiete3;

        System.out.println("nb de calories de Assiete 1 : " + assiete1.nbCalories);
        System.out.println("nb de calories de Assiete 2 : " + assiete2.nbCalories);
        
        Random generateurAleat = new Random();
        for(int i = 0; i < 10 ; i++){
        int calories = generateurAleat.nextInt(1000);
        tab_moussaka[i] =  new Moussaka(calories);
        System.out.println("La moussaka " +(i+1)+ " fait "+tab_moussaka[i].nbCalories +" calories.");
        
    }
        
    }
    
}
