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

// Classe mère spécialisée en Chien, Oiseau, Pigeon avec le mot clé "extends"
// => La classe Chien étend la classe FigureGeomtrique
class Animal {
    void deplacer() {
    System.out.println("Je me déplace");
}
}

// La classe fille Chien récupère automatiquement tous les attributs de la classe mère
// Lorsqu'on fait de l'héritage, tous les champs sont hérités => ils peuvent donc être manipulés si leur accessibilité le permet
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