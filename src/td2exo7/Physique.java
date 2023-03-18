package td2exo7;

import java.util.Calendar;


public class Physique extends Album implements EchangeRembour{
    private Calendar date_achat;
    public Calendar getDate_achat() {
        return date_achat;
    }
    public Physique(String t, String a, String p, int annee, String[] titles, double prix, Genre s, Calendar date){
        super(t, a, p, annee, titles, prix,  s);
        this.date_achat = date;
    }
    double calculPrix(){
        double Prix= this.getPrix()*(1.1); // +10% du vrai prix
        this.setPrix(Prix);
        return Prix;
    }
    public boolean estDepasse()
        {
    Calendar date = this.getDate_achat();
    Calendar aujourdHui = Calendar.getInstance();
    long intervalInMillis = aujourdHui.getTimeInMillis() - date.getTimeInMillis();
    long intervalInDays = intervalInMillis / (24 * 60 * 60 * 1000);
    if (intervalInDays >= 7) { 
    return false;
    } else {
    return true;
         }
        }
    public boolean rembourser ()
    { return (estDepasse());}
}
