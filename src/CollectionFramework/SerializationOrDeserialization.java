package CollectionFramework;

import java.io.*;
import java.util.ArrayList;

public class SerializationOrDeserialization {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<Integer>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        try {
            //Serialization
            FileOutputStream fos = new FileOutputStream("file");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(list);

            fos.close();
            oos.close();

            //Deserialization
            FileInputStream fis = new FileInputStream("file");
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList list1 = (ArrayList) ois.readObject();

            System.out.println(list1);

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
