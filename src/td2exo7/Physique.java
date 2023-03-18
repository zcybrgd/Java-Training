package td2exo7;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Physique extends Album {
    private int q;
    private static double livraison;
    private Calendar date_achat;
    double calculPrix(){
        double Prix= this.getPrix()*(1.1); // +10% du vrai prix
        this.setPrix(Prix);
        return Prix;
    }
    public boolean estDepasse(Calendar date)
        {
    Calendar aujourdHui = Calendar.getInstance();
    long differenceEnMs = aujourdHui.getTimeInMillis() - date.getTimeInMillis();
    long differenceEnJours = TimeUnit.MILLISECONDS.toDays(differenceEnMs);
    return differenceEnJours > 7;
        }
    public boolean rembourser ()
    { return (estDepasse(date_achat));}
}
