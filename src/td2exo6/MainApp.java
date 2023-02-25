package td2exo6;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args){
        int question = 2;
        switch(question){
            case 1:{
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
            }break;
            case 2:{
                String[] mod1 = {"ANA3","ANA4"};
                String[] mod2 = {"ARCHI1","POO"};
                double[] notes1 = {17, 11, 15.5 , 18.25};
                double[] notes2 = {14, 13, 15.75 , 16};
                double[] notes3 = {17, 10.25, 19, 13.5};
                Enseignant Ens1 = new Enseignant("Lounis", "Farhat", (short) 37, 1472575848L, mod1);
                Enseignant Ens2 = new Enseignant("Bousbia", "Nabila", (short) 42, 2832758548L, mod2);
                Etudiant Stu1 = new Etudiant("Boukhetala", "Zaineb", (short) 18, 210052,notes1);
                Etudiant Stu2 = new Etudiant("Mallek", "Dina", (short) 20, 200108,notes2);
                Etudiant Stu3 = new Etudiant("Guittone", "Djihene", (short) 19, 210057,notes3);
                Personne[] tableauPersonne = {Ens1, Ens2, Stu1, Stu2, Stu3};
                for(Personne eachPerso : tableauPersonne){
                    System.out.println("------------------------------");
                    eachPerso.afficher();
                }
            }
        }
    }
}
