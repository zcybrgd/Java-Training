package td2exo7;

public class Numerique extends Album {
    String url;
    public Numerique(String t, String a, String p, int annee, String[] titles, double prix, Genre s, String url){
      super(t, a, p, annee, titles, prix, s);
      this.url = url;
    }
    public double calculPrix(){
        double Prix= this.getPrix()*(0.95);
        this.setPrix(Prix);
        return Prix;
    }
}
