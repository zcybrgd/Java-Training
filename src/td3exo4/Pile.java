package td3exo4;

import java.util.*;
public class Pile {
private Deque<Character>pile=new ArrayDeque<Character>(); //ligne 5
// empile x au sommet de la pile
public void empiler(char x){ 
  pile.addFirst(x);
}
/*retourne l’élément qui est au sommet de la pile en le supprimant de la pile. Elle 
lance une exception si la pile est vide*/
public char depiler() throws PileVideException{ //ligne 13
if (this.estVide()) throw new PileVideException(); //ligne 14
return pile.removeFirst(); //ligne 15
}
//retourne true si la pile est vide et false dans le cas contraire
public boolean estVide() {
return pile.isEmpty(); //ligne 19
} 
}
class PileVideException extends Exception{}
