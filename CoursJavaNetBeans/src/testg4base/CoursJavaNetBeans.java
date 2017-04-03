/*
 * Les fonctions du cours de Java
 */
package testg4base;

/**
 * Fait avec NetBeans
 * @author BBB
 */
public class CoursJavaNetBeans {
    
    // Récupération du dimanche dans l'ENUM des Jours
    public static Jours Dimanche = Jours.DIMANCHE;


    /**
     * @param args Les paramètres de l'invité de commande
     */
    public static void main(String[] args) {
        // Appelle de la fonction affiche
        affiche("Début du Programme Main.");
        affiche("--- Cours de Java  ---");
        
        // Utilisation d'un enum
        affiche(" On est pas " + Dimanche);
        
        Recherche app = new Recherche();
        app.recherche("f", "essai de retour fff aaa bbb");
    }
    
    /**
     * Permet d'afficher un message à l'écran
     * @param message le message à afficher
     */
    private static void affiche(String message) {
        System.out.println(message);
    }
    
}
