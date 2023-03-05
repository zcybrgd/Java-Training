package td2exo6;

public class EnseignantAbstr extends PersonneAbstr implements Comparable<EnseignantAbstr>{
    private long numSecSociale;
    private String[] modules;
    public EnseignantAbstr(){
        super();
    }
    public EnseignantAbstr(String n, String p, short a, long secSoc, String[] mod){
        super(n,p,a);
        this.numSecSociale = secSoc;
        this.modules = mod;
    }
    public String getNom(){
        return this.nom;
    }
    public void afficher(){
        super.afficher();
        System.out.println("numéro de sécurité sociale : "+ this.numSecSociale);
        System.out.println("Modules : ");
        for(String eachModule : modules){
            System.out.print(" " + eachModule);
        }
    }
    public void afficherType(Object obj){
        Class<? extends Object> objClass = obj.getClass();
        System.out.println(objClass.getName());
    }
    // l'appel se fait : e.compareTo(e2) ; e < e2 donc retourne un integer négatif
    public int compareTo(EnseignantAbstr obj){
       return this.nom.compareTo(obj.nom);
    }
}
