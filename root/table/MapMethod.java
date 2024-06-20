package root.table;

import java.util.HashMap;
import java.util.Map;

public class MapMethod {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("Jean", 34);
        
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            printEntry(entry);
        }
    }

    static void printEntry(Map.Entry entry){
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
    
}
