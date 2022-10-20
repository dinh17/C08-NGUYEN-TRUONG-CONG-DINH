package ss12_collection_framework.practic.HashMap_LinkedHashMap_TreeMap;

import java.util.*;

public class TestMap{
    public static void main(String[] args) {
//        Map<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("Smith", 30);
//        hashMap.put("Anderson", 31);
//        hashMap.put("Lewis", 29);
//        hashMap.put("Cook", 29);
//        System.out.println("Display entries in HashMap");
//        System.out.println(hashMap + "\n");
//
//        Map<Integer, String> hashMap = new HashMap<>();
//        hashMap.put(30, "Smith");
//        hashMap.put(31, "Anderson");
//        hashMap.put(33, "Anderson");
//        hashMap.put(78, "Anderson");
//        hashMap.put(6, "Anderson");
//        hashMap.put(3, "Anderson");
//        hashMap.put(-2, "Anderson");
//        hashMap.put(4, "Anderson");
//        hashMap.put(3, "Anderson");
//        hashMap.put(1, "Anderson");

//        Map<Integer, String> treeMap = new TreeMap<>(hashMap);
//        System.out.println("Display entries in ascending order of key");
//        System.out.println(treeMap);


        Map<Integer,String> linkedHashMap = new TreeMap<>();
        linkedHashMap.put(12,"Smith");
        linkedHashMap.put( 31,"Anderson1");
        linkedHashMap.put( 123,"Anderson2");

        Set<Integer> keys = linkedHashMap.keySet();
        for (Integer key : keys) {
            System.out.println(linkedHashMap.get(key));
        }
    }
}
