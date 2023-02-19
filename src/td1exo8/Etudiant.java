package td1exo8;
public class Etudiant {
    private String nom;
    private String prenom;
    private String matricule;
    private int groupe;
    private String nivEtudes;
    private int nbAbsences;
    public Etudiant(String nom, String prenom, String matricule, int groupe, String nivEtudes, int nb){
      this.nom = nom;
      this.prenom = prenom;
      this.matricule = matricule;
      this.groupe = groupe;
      this.nivEtudes = nivEtudes;
      this.nbAbsences = nb;
    }
    public int getNbAbsent(){
         return this.nbAbsences;
    }
    public void setNbAbsent(Etudiant[] tab){
         for(int i=0;i<tab.length;i++){
           tab[i].nbAbsences++;
        }
    }
}
