package td3exo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Animal implements Comparable<Animal> {
    private String name;
    public Animal(String n){
        this.name = n;
    }
    public String getName() {
        return name;
    }
    public boolean equals(Animal a){
        return a.getName().equals(this.name);
    }
    public boolean equals(Object a){
        return ((Animal)a).getName().equals(this.name);
    }
    public int hashCode(){
         return name.hashCode();
    }
    @Override
    public int compareTo(Animal a){
        return this.name.compareTo(a.getName());
    }
    public static List<Animal> affichC(Collection<Animal> collec){
          List<Animal> co = new ArrayList<Animal>();
          Iterator<Animal> i = collec.iterator();
          while(i.hasNext()){
            Animal a = i.next();
            if((a.getName().charAt(0)=='c')||(a.getName().charAt(0)=='C')){
                co.add(a);
            }
          }
          return co;
    }
}
