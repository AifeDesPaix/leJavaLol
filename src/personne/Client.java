package personne;

public class Client extends Personne {

    private char type;

    public Client(char type) {
        this.type = type;
    }

    public Client(String nom, String prenom, int year, int month, int day, char type) {
        super(nom, prenom, year, month, day);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + this.getNom() + '\'' +
                ", prenom='" + this.getPrenom() + '\'' +
                ", year=" + this.getYear() +
                ", month=" + this.getMonth() +
                ", day=" + this.getDay() +
                ", num=" + this.getNum() +
                ", type=" + type +
                '}';
    }

}
