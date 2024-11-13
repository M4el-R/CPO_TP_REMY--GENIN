/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_remy;

/**
 *
 * @author Maël
 */
public class Baton extends Arme {
    private int age;

    public Baton(int age, String nom, int attaque) {
        super(nom, attaque);
        if (age > 100){
            this.age = 100;
        }
        else this.age = age;
    }

    public void SetBaton(int age){
        if (age > 100){
            this.age = 100;
        }
        else this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    @Override
    public String toString() {
        return "Baton{" + "age=" + age + '}';
    }

    
}
