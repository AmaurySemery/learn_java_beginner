package root.conditions;

import root.conditions.SwitchEnumerates.Direction;

public class SwitchEnumerates {
    /** listez toutes les directions possibles */
    enum Direction {
        north, east, south, west;
    }

    /** trouvez le nord */
    // Exemple de commande : java root/conditions/SwitchEnumerates north
    public static void main(String[] args) {
        Direction direction = Direction.north;
        switch (direction) {
            case north:
                System.out.println("You are heading north");
                break;
            case east:
                System.out.println("You are heading east");
                break;
            case south:
                System.out.println("You are heading south");
                break;
            case west:
                System.out.println("You are heading west");
                break;
        }
    }
}
