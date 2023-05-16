package JavaStreamFrameWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {

        List<String> productlist1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");
        List<String>  productlist2 = Arrays.asList("Scanner", "Projector", "Light Pen");
        List<String> productlist3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");
        List<String> productlist4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");

        List<List<String>> list = new ArrayList<List<String>>();

        list.add(productlist1);
        list.add(productlist2);
        list.add(productlist3);
        list.add(productlist4);

        //List before applying flattening and mapping ->

        //Creating allProducts list

        List<String>allProducts = new ArrayList<String>();

        for (List<String> productList : list){
            for (String product : productList){
                allProducts.add(product);
            }
        }

        System.out.println(allProducts);
        System.out.println();

        //Using Flattening now ->

        List<String> flatMapList = list.stream()
                .flatMap(t-> t.stream())
                .collect(Collectors.toList());

        System.out.println(flatMapList);






    }
}
