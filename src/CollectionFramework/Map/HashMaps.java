package CollectionFramework.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {

        Map <Integer, String> map = new HashMap<Integer, String>();

        map.put(101, "Ajay");
        map.put(104, "Abhishek");
        map.put(103, "Shubham");

//        for (Map.Entry m : map.entrySet()){
//            System.out.println(m.getKey() + " " + m.getValue());
//        }
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);


        System.out.println();


        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);


        System.out.println();

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

        System.out.println();

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);

        //Printing Key Set
        System.out.println(map.keySet());

        //Printing Value Set
        System.out.println(map.values());

    }
}
