package exo9;

public class Salle {
    private int numero;
    private int nbrReserv;
    private static int capacite;
    private Seance[] seancesprogrammes;
    public Salle(int num, int nbrReserv){
         this.numero = num;
         this.nbrReserv = nbrReserv;
    }
    public static int getCapacite() {
        return capacite;
    }
    public int getNbrReserv() {
        return nbrReserv;
    }
    public static void setCapacite(int capacite) {
        Salle.capacite = capacite;
    }
}
