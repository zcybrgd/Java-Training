package td3exo1;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.NumberFormatException;

class NombreNegatif extends Exception {
    private int n;
    public NombreNegatif(int n){
      this.n = n;
    }
}
class NombreGrand extends Exception {
    private int n;
    public NombreGrand(int n){
      this.n = n;
    }
}
public class Fact {
   public static int factorielle(int n){
    try{
        if(n>Integer.MAX_VALUE) throw new NombreGrand(n);
    if(n==0){
      return 1;
    }else{
      return factorielle(n-1)*n;
    }
    }catch(NombreGrand e){
        return -1;
    }
    
   }
   public static void main(String[] args){
     int n = 13;
     try{
        if(n<0) throw new NombreNegatif(n);
        int res = Fact.factorielle(n);
        if(res>Integer.MAX_VALUE) throw new NombreGrand(n);
        System.out.println("résultat : " + res);}
     catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Entrez un entier en ligne de commande : " + e);
     }catch(NumberFormatException e){
        System.out.println("L'argument doit  être un entier : " + e);}
      catch (NombreNegatif e) {
            System.out.println("l'entier est négatif, la factorielle n'est pas définie");
        }catch(NombreGrand e){
            System.out.println("l'entier entré est trop grand");
        }
      
   }
}

