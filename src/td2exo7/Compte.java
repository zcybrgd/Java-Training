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
    public void setSolde(double solde) {
        this.solde = solde;
    }
    public double getSolde() {
        return solde;
    }
    void acheter(double prix){
        if(this.solde>=prix){
            System.out.println("Achat effectué");
        }else{
            System.out.println("vous n'avez pas le crédit suffisant pour effectuer cet achat");
        }
    }
    void debiterSolde(double debit){
        this.solde -= debit;
    }
    void crediterSolde(double credit){
        this.solde += credit;
    }
}
