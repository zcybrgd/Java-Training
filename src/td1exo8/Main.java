package td1exo8;
public class Main{
    public static void main(String[] args){
        // Créer 5 objets de type Etudiant
        Etudiant e1=new Etudiant("chehboub","cerinemona","21/0248",8,"2CP-S2",0);
        Etudiant e2=new Etudiant("boukhetala","zaineb","21/0052",8,"2CP-S2",0);
        Etudiant[] listEtudiants = {e1, e2};
        ServiceAssid service = new ServiceAssid();
        SeanceTDTP seance = new SeanceTDTP("POO", listEtudiants);
        
    }
}