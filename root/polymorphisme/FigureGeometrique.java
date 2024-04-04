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

public class Carre extends FigureGeometrique {
    private long cote;
    public long getCote() {
        return cote;
    }
    public long getPerimetre(){
        return 4*cote;
    }
}