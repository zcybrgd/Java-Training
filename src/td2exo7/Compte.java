package td2exo7;


public class Compte{
    private String username;
    private String password;
    public Compte(String u, String p){
        this.username = u;
        this.password = p;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    Client client;
    double solde;
    Panier panier;
    Achats[] achats;
    void choisir(){}
    void acheter(){}
    void debiterSolde(){}
    void crediterSolde(){}
}
