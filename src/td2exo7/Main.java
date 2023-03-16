package td2exo7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        NetMusic site = new NetMusic();
        /*** I. Gestion des clients ***/
        //A. Création de Compte
        //1. Création d'un client qui n'existe pas
    Client client1 = new Client("Boukhetala", "Zaineb", "16004"); 
  /*   Scanner input = new Scanner(System.in);
    System.out.println("Entrer votre nom : ");
    String nom = input.nextLine();
    System.out.println("Entrer votre prenom : ");
    String prenom = input.nextLine();
    System.out.println("Entrer votre adresse : ");
    String adresse = input.nextLine();
    input.close();
    site.ajouterUnClient(client1);
    Client client = new Client(nom, prenom, adresse); 
    //2. Test de création d'un client qui existe
    if(!(site.clientExistant(client))){
       System.out.print("on est la on va ajouter un nouveau client");
       site.ajouterUnClient(client);
    }else{
        System.out.println("Le Client Existe Déja, vous ne pouvez pas l'inclure dans la liste des clients plus qu'une fois");
    }*/
    /* 
    Client[] tableau = site.getClients();
    // afficher le tableau des clients
    for(Client c : tableau){
        System.out.println("Client : " + c.getNom() + c.getPrenom() + c.getAdr());
    }*/
    Compte compte1 = new Compte("zaineb", "pootd");
    site.ajouterUnCompte(compte1);
   // Compte compte = client1.creercompte();
     //3. Test de création d'un compte avec un nom d'utilisateur existant
      //4. Création d'un compte avec un nom d'utilisateur différent
   /*   if(!(site.compteExistant(compte))){
        site.ajouterUnCompte(compte);
     }else{
         System.out.println("ce nom d'utilisateur existe déja, choisissez un autre");
     }*/
 //B. Authentification
 //1. Test d’authentification d'un client qui n'existe pas
     String message = client1.seConnecter(site);
     System.out.println(message);
 //2. Test d’authentification d'un client qui existe mais mot de passe incorrecte
 
 //3. Test d’authentification d'un client qui existe avec mot de passe correcte
 
 /*** II. Gestion du catalogue d'Album***/
 //A. Création et affichage des albums
 //1. Ajouter des albums physiques et numériques au catalogue
 
 //2. Consulter le catalogue d’album
 
 //B. Achat et Remboursement des albums
 //1. Achat de deux albums physique 
 
 //2. Achat d'un album numérique
 
 //3. Remboursement d'un album physique dans un délai >7 jours 
 
 //4. Remboursement d'un album physique dans un délai de 7 jours 
 
 /*** III. Gestion du catalogue de magazines***/
 //A. Création et affichage des magazines
 //1. Ajouter des magazines au catalogue

 //2. Consulter le catalogue de magazines
 
  //B. Achat et Remboursement des magazines
 //1. Achat d’un magazine sans avoir le solde suffisant pour le faire 

 //2. Créditer le compte avec 500 DA
 //3. Achat de deux magazines

 //4. Remboursement d'un magazine dans un délai >7 jours 

 //5. Remboursement d'un magazine dans un délai de 7 jours
    }
}
