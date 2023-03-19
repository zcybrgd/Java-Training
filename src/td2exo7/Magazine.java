package td2exo7;

import java.util.Calendar;

public class Magazine extends Article implements EchangeRembour {
    private String titreMag;
    private Calendar date_achat;
    private double prix;
    public Magazine(String titre, Calendar achat){
        this.titreMag = titre;
        this.date_achat = achat;
    }
    public Calendar getDate_achat() {
        return date_achat;
    }
    public void setDate_achat(Calendar date_achat) {
        this.date_achat = date_achat;
    }
    public String getTitreMag() {
        return titreMag;
    }
    public void creerArticle(String titreMag) {
        this.titreMag = titreMag;
    }
    public void afficherArticle(){
        System.out.println(this.getTitreMag());
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public double getPrix() {
        return prix;
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
