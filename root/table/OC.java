package root.table;

import java.util.ArrayList;
import java.util.List;

public class OC { 
    public static void main(String[] args) {
        String[] tableau = new String[10];

        tableau[3] = "Index 3";

        tableau[1] = "Index 1";

        tableau[3] = "Nouvelle donnée";

        for(int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
        }

        List<Integer> myList = new ArrayList<Integer>(); // -> []
        myList.add(7); // -> [7]
        myList.add(5); //-> [7, 5]
        myList.add(1,12); //-> [7, 12, 5]
        myList.set(0,4); // -> [4, 12, 5]
        myList.remove(1); // removed 12 -> [4, 5]
        System.out.println(myList);
        System.out.println(myList.size());
        
}
}