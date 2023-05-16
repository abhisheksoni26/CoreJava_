package JavaStreamFrameWork;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilteringAStream {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("I am Abhishek and I works at VasyERP", "Hello", "Shubham");

        stream.filter(t-> t.startsWith("I am"))
                .forEach(System.out::println);

    }
}
