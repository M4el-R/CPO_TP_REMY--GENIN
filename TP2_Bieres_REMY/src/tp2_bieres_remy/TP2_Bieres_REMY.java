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
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7, "Dubuisson");
        BouteilleBiere Leffe = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        BouteilleBiere Jupiler = new BouteilleBiere("Jupiler", 5.2, "Piedbœuf ");
        BouteilleBiere Corona = new BouteilleBiere("Corona", 4.6, "Grupo Modelo");
        BouteilleBiere Heineken = new BouteilleBiere("Heineken", 5, "Schiltigheim ");

        uneBiere.lireEtiquette();
        Leffe.lireEtiquette();
        Jupiler.lireEtiquette();
        Corona.lireEtiquette();
        Heineken.lireEtiquette();

        Leffe.decapsuler();
        Heineken.decapsuler();
        Corona.decapsuler();

        System.out.println(uneBiere);
        System.out.println(Leffe);
        System.out.println(Jupiler);
        System.out.println(Corona);
        System.out.println(Heineken);

    }

}
