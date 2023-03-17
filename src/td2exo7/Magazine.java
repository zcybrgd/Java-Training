package td2exo7;

public class Magazine extends Article {
    private String titreMag;
    public String getTitreMag() {
        return titreMag;
    }
    public void creerArticle(String titreMag) {
        this.titreMag = titreMag;
    }
    public void afficherArticle(){
        System.out.println(this.getTitreMag());
    }
}
