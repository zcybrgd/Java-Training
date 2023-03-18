package td2exo7;

import java.util.Scanner;

public abstract class Album extends Article {
    private String title;
    private String Author;
    private String prodMusic;
    private int anneeEdition;
    private String[] titres;
    private double prix;
    private Genre style;
    public Album(String t, String a, String p, int annee, String[] titles, double prix, Genre s){
           this.title = t;
           this.Author = a;
           this.prodMusic = p;
           this.anneeEdition = annee;
           this.titres = titles;
           this.prix = prix;
           this.style = s;
    }
    public Genre getStyle() {
        return style;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return Author;
    }
    public String getProdMusic() {
        return prodMusic;
    }
    public int getAnneeEdition() {
        return anneeEdition;
    }
    public void setAnneeEdition(int anneeEdition) {
        this.anneeEdition = anneeEdition;
    }
    public void setTitres(String[] titres) {
        this.titres = titres;
    }
    public String[] getTitres() {
        return titres;
    }
    public void creerArticle(String titre){
        Scanner input = new Scanner(System.in);
        this.title = titre;
        System.out.println("Entrer l'auteur : ");
        this.Author = input.nextLine();
        System.out.println("Entrer la maison de production : ");
        this.prodMusic = input.nextLine();
        input.close();
    }
    public void afficherArticle(){
        System.out.println("Album Title: " + this.getTitle() + "\nArtiste: " + this.getAuthor() + "\nMaison de Prod" + this.getProdMusic() );
    }
    abstract double calculPrix();
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
}
