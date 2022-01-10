package td4.CalculImpots;

public class Habitation {
    private String proprietaire;
    private String adresse;
    private int surface;

    public Habitation() {}

    public Habitation(String proprietaire, String adresse, int surface) {
        this.proprietaire = proprietaire;
        this.adresse = adresse;
        this.surface = surface;
    }

    public double impot() {
        return 2 * this.surface;
    }

    public void affiche() {
        System.out.println("\t\t\t*\t\t\tProprietaire :" + this.proprietaire + "\n\t\t\t*\t\t\tAdresse : " + this.adresse + "\n\t\t\t*\t\t\tSurface : " + this.surface);
    }

    public int getSurface() {
        return this.surface;
    }

    public String getProprietaire () {
        return this.proprietaire;
    }

    public String getAdresse() {
        return this.adresse;
    }
}
