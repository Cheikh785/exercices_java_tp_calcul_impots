package td4.CalculImpots;

public class ImpotHabitation {
    public static void main(String[] args) {
        Habitation[] tabHab = new Habitation[100];
        HabitationIndividuelle hbi1 = new HabitationIndividuelle("Moussa", "Keur Massar", 200, 5, false);
        HabitationIndividuelle hbi2 = new HabitationIndividuelle("Demba", "Pikine", 150, 3, false);
        HabitationIndividuelle hbi3 = new HabitationIndividuelle("Fatou", "Ngor", 150, 3, true);

        HabitationProfessionnelle hbp1 = new HabitationProfessionnelle("Samba", "Guediawaye", 150, 22);
        HabitationProfessionnelle hbp2 = new HabitationProfessionnelle("Kine", "Medina", 500, 52);
        HabitationProfessionnelle hbp3 = new HabitationProfessionnelle("Diogoye", "Rufisque", 4, 3);
        tabHab[0] = hbi1;
        tabHab[1] = hbi2;
        tabHab[2] = hbi3;
        tabHab[3] = hbp1;
        tabHab[4] = hbp2;
        tabHab[5] = hbp3;
        System.out.println("\n\t\t\t*********************************************************************************************************************************");
        for (int i=0; i < tabHab.length; i++) {
            if (tabHab[i] != null) {
                tabHab[i].affiche();
                System.out.println("\t\t\t*\t\t\tImpot : " + tabHab[i].impot() + "\n");
            }
        }
        System.out.println("\t\t\t*********************************************************************************************************************************");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tBYE\n\n");
    }
}
