package exo9;
import java.time.LocalDate;
import java.time.LocalTime;
public class Site {
    // consultation (afficher la liste de films que le ciné programme)
    public void afficherUnFilm(){
        LocalDate dateF = LocalDate.of(2023, 2, 15);
        LocalTime timeF = LocalTime.of(15, 30);
        Film film = new Film();
        film.setFilmTitle("The Martian");
        Seance seance = new Seance(5, dateF ,timeF, 250.75F, film);
        seance.afficher();
    }
}
