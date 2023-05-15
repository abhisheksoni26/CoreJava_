package CollectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesets {

    public static void main(String[] args) {

        TreeSet <Integer> set = new TreeSet<Integer>();

        set.add(1);
        set.add(9);
        set.add(7);
        set.add(6);
        set.add(2);
        set.add(5);
        set.add(4);

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        System.out.println("Initial Set : " + set);
        System.out.println("Reverse Set : " + set.descendingSet());
        System.out.println("Lowest Value : " + set.pollFirst());
        System.out.println("Highest Value : " + set.pollLast());
        System.out.println("Head Set : " + set.headSet(4, true));
        System.out.println("Tail Set : " + set.tailSet(4, false));
        System.out.println("Subset Set : " + set.subSet(2, false, 6, true ));









    }
}
