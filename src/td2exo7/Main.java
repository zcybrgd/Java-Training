package td2exo7;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Calendar jourAchat = new GregorianCalendar(2023, Calendar.MARCH, 17);
        Calendar jourAchatd = new GregorianCalendar(2023, Calendar.MARCH, 10);
        String[] folklore = {"cardigan","betty","august"};
        String[] Nectar = {"MODUS","Pretty","Sanctuary"};
        String[] a30 = {"Easy On Me", "Hold On", "All Night Parking"};
        Physique ph1 = new Physique("folklore", "taylor swift", "Big Machine Records", 2020, folklore ,18.5 , Genre.ALT, jourAchat);
        Physique ph2 = new Physique("Nectar", "Joji", "Interscope", 2020, Nectar, 14.2 , Genre.RNB, jourAchat);
        Physique ph3 = new Physique("30", "Adele", "British Records", 2022, a30, 21.9, Genre.POP, jourAchatd);
        Numerique num1 = new Numerique("folklore", "taylor swift", "Big Machine Records", 2020, folklore ,18.5 , Genre.ALT, "https");
        Numerique num2 = new Numerique("Nectar", "Joji", "Interscope", 2020, Nectar, 14.2 , Genre.RNB, "https//02");
        Numerique num3 = new Numerique("30", "Adele", "British Records", 2022, a30, 21.9, Genre.POP, "https/96");
        NetMusic site = new NetMusic();
        Scanner input = new Scanner(System.in);
        System.out.println("\t\tBIENVENUE DANS NOTRE SITE");
        System.out.println("/*** I. Gestion des clients ***/");
        System.out.println("/*** II. Gestion du catalogue d'Album***/");
        System.out.println("/*** III. Gestion du catalogue de magazines***/");
        System.out.println("Choisissez : ");
        int choixGestion=input.nextInt();
        switch(choixGestion){
            case 1:{
                System.out.println("1. Création de Compte");
                System.out.println("2. Authentification");
                System.out.println("Choisissez : ");
                int choixAct = input.nextInt();
                switch(choixAct){
                    case 1:{
                        System.out.println("1. Création d'un client qui n'existe pas");
                        System.out.println("2. Test de création d'un client qui existe");
                        System.out.println("3. Test de création d'un compte avec un nom d'utilisateur existant");
                        System.out.println("4. Création d'un compte avec un nom d'utilisateur différent");
                        System.out.println("Choisissez : ");
                        int choixInterne=input.nextInt();
                        Client client0 = new Client("Boukhetala", "Zaineb", "16004");
                        site.ajouterUnClient(client0);
                        Compte compte0 = client0.creercompte("zed18","pootd");
                        site.ajouterUnCompte(compte0);
                        switch(choixInterne){
                            case 1:{
                            Client client = new Client("ffg", "hfhth", "ghfthht");
                            if(site.clientExistant(client)){
                                System.out.println("Client Existant");
                            }else{
                                site.ajouterUnClient(client);
                                System.out.println("Inclus dans la liste des clients avec succès, Bienvenue dans notre site");
                            }
                            }break;
                            case 2:{
                                if(site.clientExistant(client0)){
                                    System.out.println("Client Existant");
                                }else{
                                    site.ajouterUnClient(client0);
                                    System.out.println("Inclus avec succès, Bienvenue dans notre site");
                                }
                            }break;
                            case 3:{
                                Compte compte = client0.creercompte("zed18", "pootd");
                                if(site.compteExistant(compte)){
                                    System.out.println("nom d utilisateur existant, veuillez choisir un autre username");
                                }else{
                                    site.ajouterUnCompte(compte);
                                    System.out.println("Compte validé, Bienvenue, vous etes maintenant un utilisateur");
                                }
                            }break;
                            case 4:{
                                Compte compte = client0.creercompte("dgsrghr", "grthrth");
                                if(site.compteExistant(compte)){
                                    System.out.println("nom d utilisateur existant, veuillez choisir un autre username");
                                }else{
                                    site.ajouterUnCompte(compte);
                                    System.out.println("Compte validé, Bienvenue, vous etes maintenant un utilisateur");
                                }
                            }break;
                        }
                    }break;
                    case 2:{
                        System.out.println("1. Test d'authentification d'un client qui n'existe pas");
                        System.out.println("2. Test d'authentification d'un client qui existe mais mot de passe incorrecte");
                        System.out.println("3. Test d'authentification d'un client qui existe avec mot de passe correcte");
                        System.out.println("Choisissez : ");
                        int choixInterne=input.nextInt();
                        Client client0 = new Client("Boukhetala", "Zaineb", "16004");
                        site.ajouterUnClient(client0);
                        Compte compte0 = client0.creercompte("zed18","pootd");
                        site.ajouterUnCompte(compte0);
                        switch(choixInterne){
                            case 1:{
                                String message = client0.seConnecter(site);
                                System.out.println(message);
                            }break;
                            case 2:{
                                String message = client0.seConnecter(site);
                                System.out.println(message);
                            }break;
                            case 3:{
                                String message = client0.seConnecter(site);
                                System.out.println(message);
                            }break;
                        }
                    }break;
                }
            }break;
            case 2:{
                System.out.println("1. Création et affichage des albums");
                System.out.println("2. Achat et Remboursement des albums");
                System.out.println("Choisissez : ");
                int choixAct = input.nextInt();
                switch(choixAct){
                    case 1:{
                        Catalogue catal = new Catalogue();
                        System.out.println("1. Ajouter des albums physiques et numériques au catalogue");
                        System.out.println("Choisissez 1 pour Physique et 2 pour Numérique");
                        int choixAlbum=input.nextInt();
                                switch(choixAlbum){
                                    case 1:{
                                    Physique[] albums = new Physique[3];
                                    albums[0] = ph1;
                                    albums[1] = ph2;
                                    albums[2] = ph3;
                                    catal.setAlbums(albums);
                                    }break;
                                    case 2:{
                                    Numerique[] albums = new Numerique[3];
                                    albums[0] = num1;
                                    albums[1] = num2;
                                    albums[2] = num3;
                                    catal.setAlbums(albums);
                                    }break;
                                }
                        System.out.println("2. Consulter le catalogue d'album");
                        for(Album each : catal.getAlbums()){
                            System.out.println("----------------");
                            System.out.println("Title: " + each.getTitle() +"\nArtiste: "+ each.getAuthor() + "\nPrix: " + each.getPrix());
                        }
                        } break;
                    case 2:{
                        System.out.println("1. Achat de deux albums physique");
                        System.out.println("2. Achat d'un album numérique");
                        System.out.println("3. Remboursement d'un album physique dans un délai >7 jours");
                        System.out.println("4. Remboursement d'un album physique dans un délai de 7 jours");
                        System.out.println("Choisissez : ");
                        int choixInterne=input.nextInt();
                        switch(choixInterne){
                            case 1:{
                                System.out.println("l'opération d'achat du premier album : Prix : " + ph1.calculPrix());
                                System.out.println("l'opération d'achat du deuxieme album : Prix : " + ph2.calculPrix());
                            }break;
                            case 2:{
                                System.out.println("l'opération d'achat d'un album num : Prix : " + num1.calculPrix());
                            }break;
                            case 3:{
                                boolean bool = ph3.rembourser();
                                if(bool==true){
                                    System.out.println("Album Remboursable");
                                }else{
                                    System.out.println("Album NON Remboursable");
                                }
                            }break;
                            case 4:{
                                boolean bool = ph1.rembourser();
                                if(bool==true){
                                    System.out.println("Album Remboursable");
                                }else{
                                    System.out.println("Album NON Remboursable");
                                }
                            }break;
                        }
                    }break;
                }
            }break;
            case 3:{
                Catalogue catal = new Catalogue();
                Magazine[] mag = new Magazine[3];
                mag[0] = new Magazine("VOGUE", jourAchatd);
                mag[0].setPrix(63.2);
                mag[1] = new Magazine("ELLE", jourAchat);
                mag[1].setPrix(12.4);
                mag[2] = new Magazine("VANITY FAIR", jourAchat);
                mag[2].setPrix(47.4);
                catal.setMagazines(mag);
                System.out.println("1. Création et affichage des magazines");
                System.out.println("2. Achat et Remboursement des magazines");
                System.out.println("Choisissez : ");
                int choixAct = input.nextInt();
                switch(choixAct){
                    case 1:{
                        System.out.println("1. Ajouter des magazines au catalogue");
                        System.out.println("2. Consulter le catalogue de magazines");
                        for(Magazine each : catal.getMagazines()){
                            System.out.println("----------------");
                            System.out.println("Title: " + each.getTitreMag());
                        }
                    }break;
                    case 2:{
                        Client client0 = new Client("Boukhetala", "Zaineb", "16004");
                        site.ajouterUnClient(client0);
                        Compte compte0 = client0.creercompte("zed18","pootd");
                        site.ajouterUnCompte(compte0);
                        compte0.setSolde(45.3);
                        System.out.println("1. Achat d'un magazine sans avoir le solde suffisant pour le faire");
                        System.out.println("2. Créditer le compte avec 500 DA");
                        System.out.println("3. Achat de deux magazines");
                        System.out.println("4. Remboursement d'un magazine dans un délai >7 jours ");
                        System.out.println("5. Remboursement d'un magazine dans un délai de 7 jours ");
                        System.out.println("Choisissez : ");
                        int choixInterne=input.nextInt();
                        switch(choixInterne){
                            case 1:{
                                compte0.acheter(mag[0].getPrix());
                            }break;
                            case 2:{
                                System.out.println("Solde du compte avant le créditer : " + compte0.getSolde());
                                compte0.crediterSolde(500);
                                System.out.println("Solde du compte après le créditer : " + compte0.getSolde());
                            }break;
                            case 3:{
                                System.out.println("Achat : Magazine  : " + mag[0].getTitreMag());
                                compte0.acheter(mag[0].getPrix());
                                System.out.println("Achat : Magazine  : " + mag[2].getTitreMag());
                                compte0.acheter(mag[2].getPrix());
                            }break;
                            case 4:{
                                boolean bool = mag[0].rembourser();
                                if(bool==true){
                                    System.out.println("Magazine Remboursable");
                                }else{
                                    System.out.println("Magazine NON Remboursable");
                                }
                            }break;
                            case 5:{
                                boolean bool = mag[1].rembourser();
                                if(bool==true){
                                    System.out.println("Magazine Remboursable");
                                }else{
                                    System.out.println("Magazine NON Remboursable");
                                }
                            }break;
                        }
                    }break;
                }
            }break;
        }
    input.close();
    }
}
