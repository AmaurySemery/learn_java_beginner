package root.polymorphisme;

// Classe mère spécialisée en Carre avec le mot clé "extends"
// => La classe Carre étend la classe FigureGeomtrique
class FigureGeometrique {
    private int x;
    private int y;
    FigureGeometrique(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// La classe fille Carre récupère automatiquement tous les attributs de la classe mère
// Lorsqu'on fait de l'héritage, tous les champs sont hérités => ils peuvent donc être manipulés si leur accessibilité le permet
class Carre extends FigureGeometrique {
    long cote;
     Carre(long cote, int x, int y){
       //Appel du constructeur de la classe mère FigureGeometrique
       super(x, y);
       this.cote = cote;
    }
  }

// En Java, une classe fille ne peut hériter que d'une seule classe mère, mais rien n'empêche cette classe mère d'être la classe fille d'une autre classe mère