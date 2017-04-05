package personne;

import java.util.GregorianCalendar;

public class Personne {

    private String nom;
    private String prenom;
//    private long age;

    private int year;
    private int month;
    private int day;
//    private GregorianCalendar bornDate;
    private int num;
    private static int nbInstance;

    public Personne() {
        this.nom = "Jalpo";
        this.prenom = "Kebab";

        this.year = 1900;
        this.month = 12;
        this.day = 31;
    }

    public Personne(String nom, String prenom, int year, int month, int day) {
        nbInstance++;

        this.nom = nom;
        this.prenom = prenom;

        this.year = year;
        this.month = month;
        this.day = day;
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

//    public String getNom() {
//        return nom;
//    }
//
//    public void setNom(String nom) {
//        this.nom = nom;
//    }
//
//    public String getPrenom() {
//        return prenom;
//    }
//
//    public void setPrenom(String prenom) {
//        this.prenom = prenom;
//    }
//
//    public long getAge() {
//        return age;
//    }
//
//    public void setAge(long age) {
//        this.age = age;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public int getMonth() {
//        return month;
//    }
//
//    public void setMonth(int month) {
//        this.month = month;
//    }
//
//    public int getDay() {
//        return day;
//    }
//
//    public void setDay(int day) {
//        this.day = day;
//    }


    public static int getNbInstance() {
        return nbInstance;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + calcAge() +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
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
    }
}
