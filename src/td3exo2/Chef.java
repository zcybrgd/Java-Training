package td3exo2;

public class Chef extends Fonctionnaire {
    String service;
    final double pourcentage=0.15;
    public Chef(String n, String p, double s, String serv){
        super(n,p,s);
        this.service = serv;
    }
    public double augmenterSalaire(){
        return this.salaire += this.salaire + this.salaire * this.pourcentage;
    }
}
