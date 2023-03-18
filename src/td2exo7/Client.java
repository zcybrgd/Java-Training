package td2exo7;

import java.util.Scanner;

public class Client {
    private String nom;
    private String prenom;
    private String adr;
    public Client(String n, String p, String a){
        this.nom = n;
        this.prenom = p;
        this.adr = a;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getAdr() {
        return adr;
    }
    public void consulter(){
    }
    public String trouverMotDePasse(Compte[] comptes, String username){
        for(Compte c : comptes){
            if(c.getUsername().equals(username)){
                String realPassword = c.getPassword();
                return realPassword;
            }
        }
        return ";";
    }
    public String seConnecter(NetMusic site){
        String messagePrompt = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Entrer votre nom d'utilisateur : ");
        String username = input.nextLine();
        System.out.print("\nEntrer votre mot de passe : ");
        String password = input.nextLine();
        input.close();
        Compte compteAuth = new Compte(username, password);
        if(site.compteExistant(compteAuth)){
            // check si le mot de passe entré est le vrai
            Compte[] comptes = NetMusic.getComptes();
            String pass = trouverMotDePasse(comptes, username);
            if(pass.equals(password)){
                return "Access Accordé";
            }else{
                return "Mot De Passe: FAUX";
            }
        }else{
            messagePrompt = "Compte Inexistant, créer un nouveau compte pour se connecter";
        }
        return messagePrompt;
    }
    public Compte creercompte(String username, String password){
        Compte compte = new Compte(username, password);
        return compte;
    }
}
