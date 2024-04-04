package root.polymorphisme;

public class Test {
   public static void main(String[] args) {

      Animal a1 = new Animal();

      Animal a2 = new Chien();

      Animal a3 = new Pigeon();

      a1.deplacer();

      a2.deplacer();

      a3.deplacer();

      FigureGeometrique figure = new FigureGeometrique();
      figure.moveTo(1, 1);

      Carre carre = new Carre(2, 2, 3); // Création d'un carré avec un côté de longueur 3
      carre.moveTo(2, 2);
   }
}

// Classe mère spécialisée en Chien, Oiseau, Pigeon avec le mot clé "extends"
// => La classe Chien étend la classe FigureGeomtrique
class Animal {
   void deplacer() {
      System.out.println("Je me déplace");
   }
}

// La classe fille Chien récupère automatiquement tous les attributs de la
// classe mère
// Lorsqu'on fait de l'héritage, tous les champs sont hérités => ils peuvent
// donc être manipulés si leur accessibilité le permet
class Chien extends Animal {

   void deplacer() {
      System.out.println("Je marche");
   }
}

class Oiseau extends Animal {

   void deplacer() {
      System.out.println("Je vole");
   }
}

class Pigeon extends Oiseau {

   void deplacer() {
      System.out.println("Je vole surtout en ville");
   }
}

class FigureGeometrique {
   int x, y;

   void moveTo(int x, int y) {
      this.x = x;
      this.y = y;
   }
}

class Carre extends FigureGeometrique {
   long cote;

   Carre(long cote, int x, int y) {
      // Appel du constructeur de la classe mère FigureGeometrique
      super();
      this.cote = cote;
      moveTo(x, y); // Appel de la méthode moveTo de la classe mère
   }
}

// En Java, une classe fille ne peut hériter que d'une seule classe mère, mais
// rien n'empêche cette classe mère d'être la classe fille d'une autre classe
// mère