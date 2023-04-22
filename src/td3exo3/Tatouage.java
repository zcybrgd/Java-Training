package td3exo3;

public class Tatouage {
    private String nom;
    private int id;
    private static int cpt=0;
    public Tatouage(String n){
        this.nom = n;
        this.id = cpt;
        cpt++;
    }
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
}
