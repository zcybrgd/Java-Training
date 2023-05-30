package td3exo4;

public class ExpressionParenthesee {
    private String expression;
    public ExpressionParenthesee(String s) throws PareOuvMan, ParFermMan{
        this.expression = s;
    }
    // pour chaque n*( il faut qu'on trouve n*)  avec ( avant )
    public boolean isCorrect() throws PareOuvMan, ParFermMan{
        Pile pile = new Pile();
        for(char c : expression.toCharArray()){
            if(c=='('){
                if (!pile.estVide())throw new ParFermMan("Parenthèse fermante manquante");
               pile.empiler(c);
            }else if(c==')'){
                try{pile.depiler(); }
                catch(PileVideException e) { throw new PareOuvMan("Parenthèse ouvrante manquante"); }
               
            }
        }
        return true;
    }
    public static void main(String[] args) throws PareOuvMan, ParFermMan{
        ExpressionParenthesee exp = new ExpressionParenthesee("(a*b)+ (c*d)");
        System.out.println("l'expression est correcte: " + exp.isCorrect());
    }
}
