package td2exo6;

public class Etudiant extends Personne {
    private int matricule;
    private double[] notes;
    private static int nbrModules;
    public Etudiant(String n, String p, short a, int mat, double[] notes){
        super(n, p, a);
        this.matricule = mat;
        this.notes = notes;
    }
    public double calculMoyenne(){
        double moy=0;
        nbrModules = notes.length;
        for(double note: notes){
            moy+=note;
            System.out.println("+ note " + moy);
        }
        moy/=nbrModules;
        System.out.println("+ finale " + moy);
        return moy;
    }
    public void afficher(){
        super.afficher();
        System.out.println("matricule : "+ this.matricule);
        System.out.println("moyenne : "+ calculMoyenne());
    }
}
