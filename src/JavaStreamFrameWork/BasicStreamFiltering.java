package JavaStreamFrameWork;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BasicStreamFiltering {


    public static void main(String[] args) {

        ArrayList <Data> al = new ArrayList<Data>();

        Data b1 = new Data(1, "Maggie", 109);
        Data b2 = new Data(2, "Coffee", 20);
        Data b3 = new Data(3, "Chips", 40);

        al.add(b1);
        al.add(b2);
        al.add(b3);

        ArrayList<Float> list = (ArrayList<Float>) al.stream()
                .filter(T -> T.price < 100)
                .map(T -> T.price)
                        .collect(Collectors.toList());

        System.out.println(list);


        //Filtering and iterating ->
        al.stream()
                .filter(t-> t.price > 100)
                .forEach(t-> System.out.println(t.productName));

    }
}
