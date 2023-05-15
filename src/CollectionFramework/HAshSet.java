package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HAshSet {

    public static void main(String[] args) {

        ArrayList<String> arrayList  = new ArrayList<String>();
        arrayList.add("Gaurav");

        HashSet<String> hash = new HashSet<String>(arrayList);

        hash.add("Abhishek");
        hash.add("Shubham");
        hash.add(" "); //Allowing Null values
        hash.add("Ajay");
        hash.add("Ajay"); //This will not repeat

        Iterator iterator = hash.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }


    }
}
