package exo9;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
public class Site {
    // les fields de Site: array de films
    // consultation (afficher la liste de films que le ciné programme)
    public void afficherUnFilm(){
        LocalDate dateF = LocalDate.of(2023, 2, 15);
        LocalTime timeF = LocalTime.of(15, 30);
        LocalTime prject = LocalTime.of(2, 30);
        Film film = new Film();
        film.setFilmTitle("The Martian");
        Seance seance = new Seance(5, dateF ,timeF,prject, 250.75F, film);
        seance.afficher();
    }
    public void reserver(){
          Scanner input = new Scanner(System.in);
          System.out.print("Entrez votre numero client: ");
          int numClient = input.nextInt();
          System.out.print("Entrez le num de séance à laquelle vous désirer assister : ");
          int numSeance = input.nextInt();
          Client nvClient = new Client(numClient, numSeance);
          Client.nbrSeancesAssis = 14;
          input.close();
    }
}
