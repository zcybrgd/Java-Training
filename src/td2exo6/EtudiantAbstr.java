package td2exo6;

public class EtudiantAbstr extends PersonneAbstr implements Comparable<EtudiantAbstr> {
    private int matricule;
    private double[] notes;
    private static int nbrModules;
    public EtudiantAbstr(String n, String p, short a, int mat, double[] notes){
        super(n, p, a);
        this.matricule = mat;
        this.notes = notes;
    }
    public double calculMoyenne(){
        double moy=0;
        nbrModules = notes.length;
        for(double note: notes){
            moy+=note;
        }
        moy/=nbrModules;
        return moy;
    }
    public void afficher(){
        super.afficher();
        System.out.println("matricule : "+ this.matricule);
        System.out.println("moyenne : "+ calculMoyenne());
    }
    public void afficherType(Object obj){
        Class<? extends Object> objClass = obj.getClass();
        System.out.println(objClass.getName());
    }
    public int compareTo(EtudiantAbstr obj){
       double thismoy = this.calculMoyenne();
       double thatmoy = obj.calculMoyenne();
      // return Integer.compare(this.myValue, other.getMyValue());
       return Double.compare(thismoy, thatmoy);
    }
}
