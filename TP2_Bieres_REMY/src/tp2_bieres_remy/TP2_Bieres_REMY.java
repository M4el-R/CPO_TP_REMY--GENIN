/**
 * TP2
 * TDA
 * Maël
 */
package tp2_bieres_remy;

/**
 *
 * @author Maël
 */
public class TP2_Bieres_REMY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere();
        BouteilleBiere Leffe = new BouteilleBiere();
        uneBiere.nom ="Cuvée des Trolls";
        uneBiere.degreAlcool = (float) 7.0;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false;
        
        uneBiere.lireEtiquette();
        
        Leffe.nom ="Leffe";
        Leffe.degreAlcool = (float) 6.6;
        Leffe.brasserie = "Abbaye de Leffe";
        Leffe.ouverte = false;
        
        Leffe.lireEtiquette();

        
    }
    
}
