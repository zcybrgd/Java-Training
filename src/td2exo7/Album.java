package td2exo7;

public abstract class Album extends Article {
    private String title;
    private String Author;
    private String prodMusic;
    private int anneeEdition;
    private String[] titres;
    private float prix;
    private Genre style;
    abstract double calculPrix();
}
