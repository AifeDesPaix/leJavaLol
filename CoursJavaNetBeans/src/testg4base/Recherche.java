package testg4base;

public class Recherche {

    public void recherche(String recherche, String chaine) {
        int position = chaine.indexOf(recherche);

        while (position > 0) {
            System.out.println("Position de la chaine " + chaine + " : " + position);
            position = chaine.indexOf(recherche, position + 1);
        }

        System.out.println("Fini");
    }

}
