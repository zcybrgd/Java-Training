package td3exo1;

class ExceptionNegatif extends Exception {
    int valeur;
    ExceptionNegatif(int val) { valeur = val; }
    public String toString() { return valeur + " est negatif"; }
    public String getMessage() { return valeur + " est negatif"; }
    }
    class ExceptionGrand extends Exception {
    ExceptionGrand(String s) {
    super(s);
    }
    }
    public class Exercice1 {
    public static void main(String[] args) {
    int i, n = 0, factorielle = 1;
    try {
    n = Integer.parseInt(args[0]);
    if (n < 0) throw (new ExceptionNegatif(n));
    for (i = 2; i <= n; i++)
    {
    if (factorielle > Integer.MAX_VALUE / i)
    throw (new ExceptionGrand(n + " est trop grand pour ce programme,\n"));
    factorielle *= i;
    
    }
    System.out.println("Voila la factorielle des "+n+" premiers entiers : "+factorielle);
    }
    catch (ArrayIndexOutOfBoundsException exc) {
    System.out.println( "Indiquez l'entier dont on souhaite calculer la factorielle " + "sur la ligne de commande");
    
    }
    
    catch (NumberFormatException exc) { System.out.println("L'argument doit etre entier");}
    catch (ExceptionNegatif exc) {System.out.println(exc + " : la factorielle n'est pas definie");}
    catch (ExceptionGrand exc) { System.out.println(exc); }
    }
    }