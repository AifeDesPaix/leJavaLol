/*
 * Les fonctions du cours de Java
 */
package coursjavanetbeans;

/**
 * Fait avec NetBeans
 * @author BBB
 */
public class CoursJavaNetBeans {

    /**
     * @param args Les paramètres de l'invité de commande
     */
    public static void main(String[] args) {
        // Appelle de la fonction affiche
        affiche("Début du Programme Main.");
        affiche("--- Cours de Java G4 ---");
    }
    
    /**
     * Permet d'afficher un message à l'écran
     * @param message le message à afficher
     */
    private static void affiche(String message) {
        System.out.println(message);
    }
    
}
