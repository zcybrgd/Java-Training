package td1exo9;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenue dans notre site, choisissez 1 pour consulter les films, et 2 pour réserver: ");
        int choice = input.nextInt();
        LocalDate dateF = LocalDate.of(2023, 2, 15);
        LocalTime timeF1 = LocalTime.of(13, 00);
        LocalTime timeF2 = LocalTime.of(17, 00);
        LocalTime duree = LocalTime.of(2, 00);
        Seance premierSeance = new Seance(1,dateF,timeF1,duree, choice, null);
        Seance deuxiemeSeance = new Seance(1,dateF,timeF2,duree, choice, null);
        Seance[] seances = {premierSeance, deuxiemeSeance};
        Salle salle1 = new Salle(1, 62, seances);
        Salle salle2 = new Salle(2,85, seances);
        Salle salle3 = new Salle(3, 54, seances);
        Salle[] salles={salle1, salle2, salle3};
        Cinema monCine = new Cinema(salles); 
        Site website = new Site(monCine);
        switch(choice){
            case 1:
            {
                website.afficherUnFilm();
            }break;
            case 2:
            {
                System.out.print("Entrez votre numero client: ");
                int numClient = input.nextInt();
                System.out.print("Entrez le num de séance à laquelle vous désirer assister : ");
                int numSeance = input.nextInt();
                Fidele client = new Fidele(numClient, numSeance, 30);
                Client[] liste= {client};
                Fidele.liste = liste;
                boolean bool = client.existEtVerification(client, salle3, deuxiemeSeance);
            }break;
            default: System.out.println("QUITTER LE SITE");
        }
        input.close();
    }
}
/* switch statement : in the menu: 
         * afficher la liste des séances de films programmés
         * réserver une place (pour les clients fidèles)
         */