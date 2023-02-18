import java.util.Scanner;

import exo9.Cinema;
import exo9.Salle;

public class App{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenue dans notre site, choisissez 1 pour consulter les films, et 2 pour réserver: ");
        int choice = input.nextInt();
        input.close();
        Salle salle1 = new Salle(1, 62);
        Salle salle2 = new Salle(2,85);
        Salle salle3 = new Salle(3, 54);
        Salle[] salles={salle1, salle2, salle3};
        Cinema monCine = new Cinema(salles); 

        switch(choice){
            case 1:
            {
                
            }break;
            case 2:
            {

            }break;
            default: System.out.println("QUITTER LE SITE");
        }
    }
}
/* switch statement : in the menu: 
         * afficher la liste des séances de films programmés
         * réserver une place (pour les clients fidèles)
         */