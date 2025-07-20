package maps;

import classes.school.Person;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {
    Map<Long, String> mapAsHashMap = new HashMap<>();
    //Map<Long, String> mapAsLinkedHash = new LinkedHashMap<>();

    mapAsHashMap.put(1L, "Alysson");
    mapAsHashMap.put(2L, "José Antunes");
    mapAsHashMap.put(3L, "Maria");
    mapAsHashMap.put(3L, "Maria Ribeiro");

    if(mapAsHashMap.containsKey(1L)){

        System.out.println("Key exists, name= " + mapAsHashMap.get(1L));
    }

        mapAsHashMap.keySet().stream().forEach( key -> System.out.println("Key: " + key));
        mapAsHashMap.values().stream().forEach( value -> System.out.println("value: " + value));

        mapAsHashMap.entrySet().forEach(
                longStringEntry -> {
                    System.out.println("Key: " + longStringEntry.getKey());
                    System.out.println("value: " + longStringEntry.getValue());
                }
        );
    }
}
