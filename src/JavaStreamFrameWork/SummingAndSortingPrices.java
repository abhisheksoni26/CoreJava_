package JavaStreamFrameWork;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SummingAndSortingPrices {

    public static void main(String[] args) {

        ArrayList <Data> arr = new ArrayList<Data>();

        Data b1 = new Data(1, "Maggie", 109);
        Data b2 = new Data(2, "Coffee", 20);
        Data b3 = new Data(3, "Chips", 40);

        arr.add(b1);
        arr.add(b2);
        arr.add(b3);

        double totalPrice = arr.stream()
                .collect(Collectors.summingDouble(t->t.price));

        System.out.println(totalPrice);

        //count ->

        long count = arr.stream()
                .filter(t->t.price<100)
                .count();

        System.out.println(count);


        arr.stream()
                .filter(t-> t.price<120)
                .sorted(Comparator.comparing(Data::getPrice).reversed())
                .forEach(t-> System.out.println(t.productName));

    }
}
