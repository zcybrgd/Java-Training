package exo9;
import java.time.LocalDate;
import java.time.LocalTime;
public class Seance {
    private int numero;
    private LocalDate date;
    private LocalTime heure;
    private LocalTime projection;
    private double tarif;
    private Film film;
    public Seance(int num, LocalDate d, LocalTime h, LocalTime p,double tarif, Film film ){
        this.numero = num;
        this.date = d;
        this.heure = h;
        this.projection = p;
        this.tarif = tarif;
        this.film = film;
    }
    public double getTarif() {
        return tarif;
    }
    public void setTarif(double tarif) {
        this.tarif = tarif;
    }
    public void afficher(){
        System.out.print("numéro de séance : " + this.numero + "\nle film projeté: " + this.film.getFilmTitle());
        System.out.println("\nRéalisé par: " + this.film.getRealisateur());
        System.out.println("Date: "+ this.date +", Heure : " + this.heure + " durant: " + this.projection);
        System.out.println("Tarif : "+ this.tarif);
    }
}
