package td4.CalculImpots;

public class HabitationIndividuelle extends Habitation {
    private int nbPieces;
    private boolean piscine;

    public HabitationIndividuelle() {}

    public HabitationIndividuelle(String proprietaire, String adresse, int surface, int nbPieces, boolean piscine) {
        super(proprietaire, adresse, surface);
        this.nbPieces = nbPieces;
        this.piscine = piscine;
    }

    public double impot() {
        int feePiscine = (this.piscine) ? 500 : 0;
        return (super.impot() + 100 * this.nbPieces + feePiscine);
    }

    public void affiche() {
        System.out.println("\t\t\t*\t\t\tProprietaire :" + super.getProprietaire() + "\n\t\t\t*\t\t\tAdresse : " + super.getAdresse()
                + "\n\t\t\t*\t\t\tSurface : " + super.getSurface() + "\n\t\t\t*\t\t\tNombre de pièces : " + this.nbPieces + "\n\t\t\t*\t\t\tPiscine : " + ((this.piscine) ? "Oui" : "Non") );
    }
}
