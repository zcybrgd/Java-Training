package exo8;
public class SeanceTDTP {
    private String module;
    private String date;
    private String heure;
    Etudiant[] listeEtudiants;
    public SeanceTDTP(String module,Etudiant[] listeEtudiants){
         this.module = module;
         this.listeEtudiants = listeEtudiants;
    }
}