package td3exo2;

public class Stagiaire extends Fonctionnaire  {
    public int dureeDeStage;
    public Stagiaire(String n, String p, double s, int d){
        super(n,p,s);
        this.dureeDeStage = d;
    }
    public double augmenterSalaire() throws AugmentationImpossibleException {
        throw new AugmentationImpossibleException();
    }
}
