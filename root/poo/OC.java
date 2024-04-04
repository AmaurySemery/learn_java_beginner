package root.poo;

public class OC {
    public static void main(String[] args) {
        Marque apple = new Marque("apple");

        Telephone iphone = new Telephone(34000, "iphone", apple);

        System.out.println(iphone.nom);

    }
}

class Telephone {
    int pixels;
    String nom;
    Marque marque;

    public Telephone(int pixels, String nom, Marque marque) {
        this.pixels = pixels;
        this.nom = nom;
        this.marque = marque;
    }
}

class Marque {
    String nom;

    public Marque(String nom) {
        this.nom = nom;
    }
}
