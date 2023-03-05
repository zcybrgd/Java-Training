package td2exo6;
import java.util.Arrays;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args){
        int question = 3;
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
                    System.out.println("\n------------------------------");
                    eachPerso.afficher();
                }
            }
            case 3:{
                String[] mod1 = {"ANA3","ANA4"};
                String[] mod2 = {"ARCHI1","POO"};
                double[] notes1 = {17, 11, 15.5 , 18.25};
                double[] notes2 = {14, 13, 15.75 , 16};
                double[] notes3 = {17, 10.25, 19, 13.5};
                EnseignantAbstr E1 = new EnseignantAbstr("Lounis", "Farhat", (short) 37, 1472575848L, mod1);
                EnseignantAbstr E2 = new EnseignantAbstr("Bousbia", "Nabila", (short) 42, 2832758548L, mod2);
                EtudiantAbstr Stu1 = new EtudiantAbstr("Boukhetala", "Zaineb", (short) 18, 210052,notes1);
                EtudiantAbstr Stu2 = new EtudiantAbstr("Mallek", "Dina", (short) 20, 200108,notes2);
                EtudiantAbstr Stu3 = new EtudiantAbstr("Guittone", "Djihene", (short) 19, 210057,notes3);
                EnseignantAbstr[] arrayEnseig = {E1, E2};
                EtudiantAbstr[] arrayStudents = {Stu1, Stu2, Stu3};
               /*  System.out.println("before sorting");
                for (EtudiantAbstr num : arrayStudents) {
                    System.out.print(num.calculMoyenne() + " ");
                }
                System.out.println("\nafter sorting");
                Arrays.sort(arrayStudents);
                for (EtudiantAbstr num : arrayStudents) {
                    System.out.print(num.calculMoyenne() + " ");
                }
                for(EnseignantAbstr e : arrayEnseig){
                    System.out.println(e.getNom());
                }
                Arrays.sort(arrayEnseig);
                for(EnseignantAbstr e : arrayEnseig){
                    System.out.println(e.getNom());
                }*/
            }
        }
    }
}
