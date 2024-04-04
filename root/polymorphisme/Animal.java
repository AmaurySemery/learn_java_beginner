package root.polymorphisme;

public class Test {
    public static void main(String[] args) {
    
        Animal a1 = new Animal();
    
        Animal a2 = new Chien();
    
        Animal a3 = new Pigeon();
    
    
        a1.deplacer();
    
        a2.deplacer();
    
        a3.deplacer();
    
        }
    
    }

class Animal {
    void deplacer() {
    System.out.println("Je me déplace");
}

class Chien extends Animal {

    void deplacer() {
       System.out.println("Je marche");
    }
 
 }

 class Oiseau extends Animal {

    void deplacer(){
       System.out.println("Je vole");
    }
 
 }

 class Pigeon extends Oiseau {

    void deplacer() {
       System.out.println("Je vole surtout en ville");
    }
 
 }