package td2exo7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
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
                        switch(choixInterne){
                            case 1:{}break;
                            case 2:{}break;
                            case 3:{}break;
                            case 4:{}break;
                        }
                    }break;
                    case 2:{
                        System.out.println("1. Test d’authentification d'un client qui n'existe pas");
                        System.out.println("2. Test d’authentification d'un client qui existe mais mot de passe incorrecte");
                        System.out.println("3. Test d’authentification d'un client qui existe avec mot de passe correcte");
                        System.out.println("Choisissez : ");
                        int choixInterne=input.nextInt();
                        switch(choixInterne){
                            case 1:{}break;
                            case 2:{}break;
                            case 3:{}break;
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
                        System.out.println("1. Ajouter des albums physiques et numériques au catalogue");
                        System.out.println("2. Consulter le catalogue d’album");
                        System.out.println("Choisissez : ");
                        int choixInterne=input.nextInt();
                        switch(choixInterne){
                            case 1:{}break;
                            case 2:{}break;
                        }
                    }break;
                    case 2:{
                        System.out.println("1. Achat de deux albums physique");
                        System.out.println("2. Achat d'un album numérique");
                        System.out.println("3. Remboursement d'un album physique dans un délai >7 jours");
                        System.out.println("4. Remboursement d'un album physique dans un délai de 7 jours");
                        System.out.println("Choisissez : ");
                        int choixInterne=input.nextInt();
                        switch(choixInterne){
                            case 1:{}break;
                            case 2:{}break;
                            case 3:{}break;
                            case 4:{}break;
                        }
                    }break;
                }
            }break;
            case 3:{
                System.out.println("1. Création et affichage des magazines");
                System.out.println("2. Achat et Remboursement des magazines");
                System.out.println("Choisissez : ");
                int choixAct = input.nextInt();
                switch(choixAct){
                    case 1:{
                        System.out.println("1. Ajouter des magazines au catalogue");
                        System.out.println("2. Consulter le catalogue de magazines");
                        System.out.println("Choisissez : ");
                        int choixInterne=input.nextInt();
                        switch(choixInterne){
                            case 1:{}break;
                            case 2:{}break;
                        }
                    }break;
                    case 2:{
                        System.out.println("1. Achat d’un magazine sans avoir le solde suffisant pour le faire");
                        System.out.println("2. Créditer le compte avec 500 DA");
                        System.out.println("3. Achat de deux magazines");
                        System.out.println("4. Remboursement d'un magazine dans un délai >7 jours ");
                        System.out.println("4. Remboursement d'un magazine dans un délai de 7 jours ");
                        System.out.println("Choisissez : ");
                        int choixInterne=input.nextInt();
                        switch(choixInterne){
                            case 1:{}break;
                            case 2:{}break;
                            case 3:{}break;
                            case 4:{}break;
                            case 5:{}break;
                        }
                    }break;
                }
            }break;
        }
    input.close();
    }
}
