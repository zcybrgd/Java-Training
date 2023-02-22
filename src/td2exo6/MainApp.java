package td2exo6;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez entrer le nom de la personne: ");
        String nom = input.nextLine();
        System.out.println("Veuillez entrer le prénom de la personne: ");
        String prenom = input.nextLine();
        System.out.println("Veuillez entrer l'age de la personne: ");
        short age = input.nextShort();
        input.close();
        Personne somebody = new Personne(nom, prenom, age);
        somebody.afficher();
    }
}
