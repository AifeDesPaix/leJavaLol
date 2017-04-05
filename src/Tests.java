
public class Tests {

    public static void test_trim() {
        String test = "  Bonjour  Tous       !";
        System.out.println( test.trim() );
    }

    public static void test_recherche() {
        int position;
        String chaine = "j'aime les igouanes";
        String recherche = "e";

        position = chaine.indexOf(recherche);

        while (position >  0) {
            System.out.println(position);
            position = chaine.indexOf(recherche, position+1);
        }

        System.out.println( "Recherche fini." );
    }

    public static void test_replace() {
        String chaine1 = "coucou j'aime les couscous.";
        String chaine2 = chaine1.replace("couscous", "couilles");
        System.out.println(chaine1);
        System.out.println(chaine2);
    }

    public static void test_operator() {
        int i;
        int x = 0, y = 0;
        for (i=0; i<10; i++) {
            System.out.println("====");
            System.out.println(x++);
            System.out.println(++y);
        }
    }

    public static void test_for() {
        String[] table = {"red", "green", "blue", "white"};
        int cpt;
        for (cpt = 0; cpt < table.length; cpt++) {
            System.out.println( table[cpt] );
        }
    }
}
