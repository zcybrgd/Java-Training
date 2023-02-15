package exo9;

public class Film {
    private String filmTitle;
    private int annee;
    private String realisateur;
    private String[] cast;
    private String synopsis;
    public Film(){} // empty constructor
    public Film(String title, int annee, String rea, String[] cast, String syn){
       this.filmTitle = title;
       this.annee = annee;
       this.realisateur = rea;
       this.cast = cast;
       this.synopsis = syn;
    }
    public String getFilmTitle(){
        return this.filmTitle;
    }
    public void setFilmTitle(String filmTitle){
        this.filmTitle = filmTitle;
    }
}
