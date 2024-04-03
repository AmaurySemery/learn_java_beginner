package root.conditions;

import root.conditions.SwitchEnumerates.Direction;

public class SwitchEnumerateOneCase {
    public static void main(String[] args) {
        Direction direction = Direction.north;
        switch (direction) {
            case north:
                System.out.println("You are heading north");
                break;
            default:
                System.out.println("You are lost!");
        }
    }
}