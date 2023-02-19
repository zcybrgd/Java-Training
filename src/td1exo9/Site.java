package td1exo9;
import java.time.LocalDate;
import java.time.LocalTime;
public class Site {
    // les fields de Site: array de films
    // consultation (afficher la liste de films que le ciné programme)
    private Cinema cinema;
    public Site(Cinema cinema){
         this.cinema = cinema;
    }
    public void afficherUnFilm(Seance seance){
        seance.afficher();
    }
    public int reserver(int numClient, int numSeance){
          return 30;
    }
}
