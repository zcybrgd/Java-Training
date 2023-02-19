package exo9;
import java.time.LocalDate;
import java.time.LocalTime;
public class Site {
    // les fields de Site: array de films
    // consultation (afficher la liste de films que le ciné programme)
    private Cinema cinema;
    public Site(Cinema cinema){
         this.cinema = cinema;
    }
    public void afficherUnFilm(){
        LocalDate dateF = LocalDate.of(2023, 2, 15);
        LocalTime timeF = LocalTime.of(15, 30);
        LocalTime prject = LocalTime.of(2, 30);
        Film film = new Film();
        film.setFilmTitle("The Martian");
        Seance seance = new Seance(5, dateF ,timeF,prject, 250.75F, film);
        seance.afficher();
    }
    public int reserver(int numClient, int numSeance){
          return 30;
    }
}
