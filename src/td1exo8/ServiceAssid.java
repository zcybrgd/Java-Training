package td1exo8;
public class ServiceAssid {
    private Etudiant[] liste;
    private SeanceTDTP[] seance;
    public void miseajour(){
       for(int i=0; i<this.seance.length; i++){
        this.liste = this.seance[i].listeEtudiants;
        liste[i].setNbAbsent(liste);
       }
    }
}
