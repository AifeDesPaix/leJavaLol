package personne;

import java.util.GregorianCalendar;

public class Personne implements Classable {

    private static int nbInstance;

    private int num;

    private String nom;
    private String prenom;

    private int year;
    private int month;
    private int day;

    public Personne() {
//        Personne("Jalpo", "Kebab", 1900, 12, 31);
        this.nom = "Jalpo";
        this.prenom = "Kebab";

        this.year = 1900;
        this.month = 12;
        this.day = 31;

        this.num = nbInstance++;
    }

    public Personne(String nom, String prenom, int year, int month, int day) {
        this.nom = nom;
        this.prenom = prenom;

        this.year = year;
        this.month = month;
        this.day = day;

        this.num = nbInstance++;
    }

    /**
     * Calcul l'age
     * @return Age calculé de la date de naissance
     */
    private long calcAge() {
        long age;

        GregorianCalendar bornDate = new GregorianCalendar(year, month, day);
        age = new GregorianCalendar().getTimeInMillis() - bornDate.getTimeInMillis();

        age = age/1000/60/60/24/365;

        return age;
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getMonth() { return month; }
    public void setMonth(int month) { this.month = month; }

    public int getDay() { return day; }
    public void setDay(int day) { this.day = day; }

    public int getNum() { return num; }

    public static int getNbInstance() { return nbInstance; }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", num=" + num +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    /**
     *
     * @param francais Langue
     */
    public void affichage(boolean francais) {
        String name, firstName, age;

        if (francais) {
            name = "Nom";
            firstName = "Prénom";
            age = "Age";
        } else {
            name = "Name";
            firstName = "Firstname";
            age = "Age";
        }

        System.out.println(name + " : " + this.nom);
        System.out.println(firstName + " : " + this.prenom);
        System.out.println(age + " : " + calcAge());
        System.out.println("N° " + num);
    }

    @Override
    public int compare(Object o) {
        int retVal;

        try {
            Personne p;
            if (o instanceof Personne) {
                p = (Personne)o;
            } else {
                throw new Exception();
            }

            if( getNom().compareTo(p.getNom()) > 0 ) {
                retVal = Classable.SUPERIEUR;
            } else if ( getNom().compareTo(p.getNom()) < 0 ) {
                retVal = Classable.INFERIEUR;
            } else {
                retVal = Classable.EGAL;
            }

        } catch (Exception e) {
            retVal = Classable.ERREUR;
        }

        return retVal;
    }
}
