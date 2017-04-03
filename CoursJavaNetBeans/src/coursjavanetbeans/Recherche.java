package testg4base;

public class Recherche {

    static int position;

    public static int recherche(String elementRecherche, String chaineIN) {
        position = chaine.indexOf(recherche);

        while (position > 0) {
            System.out.println("Couille : " + position);
            position = chaine.indexOf(recherche, position + 1);
        }

        System.out.println("Fini");

    }

}
