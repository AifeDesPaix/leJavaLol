import personne.*;

import java.io.*;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
//        Main.mainTest();
//        Main.mainPersonne();

        Main.readFile("test.txt");
    }

    public static void mainTest() {
        tests.Tests.test_trim();
        tests.Tests.test_recherche();
        tests.Tests.test_replace();
        tests.Tests.test_operator();
        tests.Tests.test_for();
    }

    public static void mainPersonne() {
        Personne p = new Personne("Cule", "Jean", 1990, 7, 24);
        Personne pd = new Personne();

        Client c = new Client('d');

//        System.out.println(p);
//        System.out.println(pd);
//        System.out.println(c);
//        System.out.println(p.compare(pd));
//        System.out.println(p.compare(c));
//        System.out.println(c.compare(pd));
//        System.out.println(c.compare(c));
//        System.out.println(c.compare(p));
    }


    public static void readFile( String name ) {
        FileInputStream file = null;
        BufferedReader br = null;
        String line = null;

        try {
            file = new FileInputStream(name);
            br = new BufferedReader(new InputStreamReader(file));
            line = br.readLine();
            System.out.println(line);
        } catch (FileNotFoundException e) {
            Logger.getLogger(Personne.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            Logger.getLogger(Personne.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
