package CollectionFramework.Map;

import CollectionFramework.Book;

import java.util.LinkedHashMap;
import java.util.Map;

public class LInkedHashMaps {

    public static void main(String[] args) {

        LinkedHashMap <Integer, Books> map = new LinkedHashMap<Integer, Books >();

        Books b1 = new Books(101,"Let us C","Yashwant Kanetkar", 10);
        Books b2 = new Books(102,"Data Communications and Networking","Forouzan", 4);
        Books b3 = new Books(103,"Operating System","Galvin",6);

        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);

        for (Map.Entry<Integer, Books> m : map.entrySet()){
            int keys = (int) m.getKey();
            Books b = m.getValue();

            System.out.println("Key : " + keys);

            System.out.println(b.id + " " + b.bookName + " " + b.auther + " " + b.quantity);


        }


    }
}
