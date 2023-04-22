package td3exo2;

public class Fonctionnaire implements AugmentationSalaire {
    protected String nom;
    protected String prenom;
    protected double salaire;
    public Fonctionnaire(String n, String p, double s){
        this.nom = n;
        this.prenom = p;
        this.salaire = s;
    }
    public boolean equals(Fonctionnaire f2){
        if((this.nom==f2.nom)&&(this.prenom==f2.prenom)){
            return true;
        }else{
            return false;
        }
    }
}
