package td3exo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class Main {
   public static void main(String[] args){
    // Peuplez votre ensemble d'animaux
    Set<Animal> ensembleAnimaux = new HashSet<Animal>();
    ensembleAnimaux.add(new Animal("Lion"));
    ensembleAnimaux.add(new Animal("Tiger"));
    ensembleAnimaux.add(new Animal("Rabbit"));
    ensembleAnimaux.add(new Animal("Fennec"));
    ensembleAnimaux.add(new Animal("Wolf"));
    ensembleAnimaux.add(new Animal("Rabbit"));
    // Affichez l'ensemble d'animaux en utilisant l'ittérateur fourni par la méthode Iterator();
    System.out.println("-Affichez l'ensemble d'animaux en utilisant l'ittérateur fourni par la méthode Iterator();-");
     Iterator<Animal> i = ensembleAnimaux.iterator();
     System.out.println("Le HashSet des Animaux");
     while(i.hasNext()){
        Animal animal = i.next();
        System.out.println(animal.getName());
     }
    Set<Animal> ensembleAnimals = new TreeSet<Animal>();
    ensembleAnimals.add(new Animal("Lion"));
    ensembleAnimals.add(new Animal("Tiger"));
    ensembleAnimals.add(new Animal("Rabbit"));
    ensembleAnimals.add(new Animal("Fennec"));
    ensembleAnimals.add(new Animal("Wolf"));
    ensembleAnimals.add(new Animal("Rabbit"));
    ensembleAnimals.add(new Animal("Alligator"));
    System.out.println("Le TreeSet des Animaux");
    Iterator<Animal> j = ensembleAnimals.iterator();
    while(j.hasNext()){
        Animal animal = j.next();
        System.out.println(animal.getName());
    }
    List<Animal> animals = new ArrayList<Animal>(ensembleAnimaux);
    // Ajoutez plusieurs animaux ayant le même nom dans la liste, et rajoutez plusieurs fois la même instance d'Animal. Affichez la liste.
    Animal a = new Animal("Cat");
    animals.add(new Animal("Lion"));
    animals.add(new Animal("Crocodile"));
    animals.add(a);
    animals.add(new Animal("Elephant"));
    animals.add(a);
    animals.add(a);
    animals.add(new Animal("Cow"));
    System.out.println("Le ArrayList des Animaux");
    Iterator<Animal> k = animals.iterator();
    while(k.hasNext()){
        Animal an = k.next();
        System.out.println(an.getName());
    } 
    System.out.println("------Animals with C at the beginning-------------");
    List<Animal> anx = Animal.affichC(animals);
    Iterator<Animal> k1 = anx.iterator();
    while(k1.hasNext()){
        Animal an = k1.next();
        System.out.println(an.getName());
    } 
    Collections.sort(animals);
    System.out.println("------Animals List Sorted-------------");
    for(Animal each : animals){
        System.out.println(each.getName());
    }
    // les maps
    Map<Animal, Tatouage>  mapTatAn = new HashMap<Animal, Tatouage>();
    mapTatAn.put(a, new Tatouage(a.getName()));
    mapTatAn.put(new Animal("Cow"), new Tatouage("Cow"));
    mapTatAn.put(new Animal("Lion"), new Tatouage("Lion"));
    System.out.println("------Afficher les entrées de votre Map (utilisez la méthode entrySet)-------------");
    for(Map.Entry<Animal, Tatouage> entrée : mapTatAn.entrySet()){
        System.out.println(entrée.getKey().getName() + " -> " + entrée.getValue().getId());
    }
}}

