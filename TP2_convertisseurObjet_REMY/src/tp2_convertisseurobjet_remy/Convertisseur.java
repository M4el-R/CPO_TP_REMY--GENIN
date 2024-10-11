package tp2_convertisseurobjet_remy;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maël
 */
public class Convertisseur {

    double nbConversions;

    public double CelciusVersKelvin(double valeur) {
        //converti les degrés Celcius en degrés Kelvin
        nbConversions += 1;
        return (valeur + 273);
    }

    public double KelvinVersCelcius(double valeur) {
        //converti les degrés Celcius en degrés Kelvin
        nbConversions += 1;
        return (valeur - 273);
    }

    public double FarenheitVersCelcius(double valeur) {
        // converti les degrés Farenheit en degrés Celcius
        nbConversions += 1;
        return ((valeur - 32) / 1.8);
    }

    public double CelciusVersFarenheit(double valeur) {
        // converti les degrés Celcius en degrés Farenheit
        nbConversions += 1;
        return (1.8 * valeur + 32);
    }

    public double KelvinVersFarenheit(double valeur) {
        // converti les degrés Kelvin en degrés Farenheit
        nbConversions -= 1;
        return (CelciusVersFarenheit(KelvinVersCelcius(valeur)));
    }

    public double FarenheitVersKelvin(double valeur) {
        // converti les degrés Farenheit en degrés Kelvin
        nbConversions -= 1;
        return (CelciusVersKelvin(FarenheitVersCelcius(valeur)));
    }
    
    public Convertisseur () {
        nbConversions = 0;
    }
    
    @Override
    public String toString(){
        return "nb de conversions " + nbConversions;
    }
}
