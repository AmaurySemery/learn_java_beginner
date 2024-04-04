package root.polymorphisme;

// Classe mère spécialisée en Carre avec le mot clé "extends"
// => La classe Carre étend la classe FigureGeomtrique
public class FigureGeometrique {
    private int x;
    private int y;
    public void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }
}

// La classe fille Carre récupère automatiquement tous les attributs de la classe mère
// Lorsqu'on fait de l'héritage, tous les champs sont hérités => ils peuvent donc être manipulés si leur accessibilité le permet
public class Carre extends FigureGeometrique {
    private long cote;
    public long getCote() {
        return cote;
    }
    public long getPerimetre(){
        return 4*cote;
    }
}

// En Java, une classe fille ne peut hériter que d'une seule classe mère, mais rien n'empêche cette classe mère d'être la classe fille d'une autre classe mère