package td2exo6;

public class Personne {
    protected String nom;
    protected String prenom;
    protected short age;
    public Personne(String n, String p, short a){
        this.nom = n;
        this.prenom = p;
        this.age = a;
    }
    public void afficher(){
        System.out.println("Les informations sur la personne:\nNom: "+ this.nom + "\nPrénom: "+ this.prenom + "\nAge: "+ this.age);
    }
}
