package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.add("Abhishek");
        list.add("Shubham");
        list.add("VasyERP");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

    }
}
