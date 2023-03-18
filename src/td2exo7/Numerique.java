package td2exo7;

public class Numerique extends Album {
    String url;
    double reduction;
    public double calculPrix(){
        double Prix= this.getPrix()*(0.95);
        this.setPrix(Prix);
        return Prix;
    }
}
