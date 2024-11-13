/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_remy;

/**
 *
 * @author Maël
 */
public class Epee extends Arme{
    private int finesse;

    public Epee(int finesse, String nom, int attaque) {
        super(nom, attaque);
        if (finesse > 100){
            this.finesse = 100;
        }
        else this.finesse = finesse;
    }
    
    public int getFinesse(){
        return this.finesse;
    }
    public void Setfinesse(int finesse){
        if (finesse > 100){
            this.finesse = 100;
        }
        else this.finesse = finesse;
    }

    @Override
    public String toString() {
        return "Epee{" + "finesse=" + finesse + '}';
    }
    
}
