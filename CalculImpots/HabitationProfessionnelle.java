package td4.CalculImpots;

public class HabitationProfessionnelle extends Habitation {
    private int nbEmployes;

    public HabitationProfessionnelle(String proprietaire, String adresse, int surface, int nbEmployes) {
        super(proprietaire, adresse, surface);
        this.nbEmployes = nbEmployes;
    }

    public double impot() {
        int feeEmployes = (this.nbEmployes / 10) * 1000;
        return (super.impot() + feeEmployes);
    }

    public void affiche() {
        System.out.println("\t\t\t*\t\t\tProprietaire :" + super.getProprietaire() + "\n\t\t\t*\t\t\tAdresse : " + super.getAdresse() + "\n\t\t\t*\t\t\tSurface : " + super.getSurface() + "\n\t\t\t*\t\t\tNombre d'employés : " + this.nbEmployes );
    }
}
