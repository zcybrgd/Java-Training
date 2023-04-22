package td3exo2;

public class Test {
    public static void main(String[] args){
        int choice=4;
        switch(choice){
            // Un fonctionnaire dont le salaire après augmentation ne dépasse pas le plafond
            case 1:{
               double salaire = 15444;
               Fonctionnaire f = new Fonctionnaire("Chehboub","Cerine",salaire);
               try{
                salaire = f.augmenterSalaire(salaire, 0.15);
                System.out.println("nouveau salaire : " + salaire);
               }catch(AugmentationImpossibleException e){
                System.out.println("AugmentationImpossibleException");
               }
            }break;
           // Un fonctionnaire dont le salaire après augmentation dépasse le plafond
            case 2:{
                double salaire = 1000254;
                Fonctionnaire f = new Fonctionnaire("Chehboub","Cerine",salaire);
                try{
                 salaire = f.augmenterSalaire(salaire, 0.75);
                }catch(AugmentationImpossibleException e){
                 System.out.println("AugmentationImpossibleException");
                }
            }break;
           // Un chef de service dont le salaire est augmenté d’un pourcentage fixe
            case 3:{
               double salaire = 750000.7;
               Chef chefdeServ = new Chef("Mallek", "Dina", salaire, "Service Réseaux");
               System.out.print("nouveau salaire : "+ chefdeServ.augmenterSalaire());
            }break;
            // Un stagiaire dont le salaire est augmenté
            case 4:{
               double salaire = 5000;
               Stagiaire st = new Stagiaire("Mallek", "Dina", salaire , 15);
               try{
                st.augmenterSalaire();
               }catch(AugmentationImpossibleException e){
                System.out.println("AugmentationImpossibleException");
               }
            }break;
        }
    }
}
