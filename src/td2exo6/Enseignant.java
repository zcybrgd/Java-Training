package td2exo6;

public class Enseignant extends Personne {
    private long numSecSociale;
    private String[] modules;
    public Enseignant(String n, String p, short a, long secSoc, String[] mod){
        super(n,p,a);
        this.numSecSociale = secSoc;
        this.modules = mod;
    }
    public void afficher(){
        super.afficher();
        System.out.println("numéro de sécurité sociale : "+ this.numSecSociale);
        System.out.println("modules : "+ modules);
    }
}
