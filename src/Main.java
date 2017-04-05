import personne.*;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
//        Tests.test_trim();
//        Tests.test_recherche();
//        Tests.test_replace();
//        Tests.test_operator();
//        Tests.test_for();

        Personne p = new Personne("Cule", "Jean", 1990, 7, 24);
        Personne pd = new Personne();

        Client c = new Client('d');

        System.out.println(p);
        System.out.println(pd);
        System.out.println(c);
    }

}
