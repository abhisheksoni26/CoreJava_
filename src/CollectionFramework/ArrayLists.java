package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<Integer>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(1);

        list.add(1, 5);

//        System.out.println(list);

        //Iteration ->
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
        System.out.println();

        //Size of List ->
        System.out.println("Size Of List : "+list.size());


        //Sorting of Arraylist ->
        Collections.sort(list);
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next());
        }
        System.out.println();

        //JAVA

    }
}
