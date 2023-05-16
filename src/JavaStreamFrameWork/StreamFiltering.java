package JavaStreamFrameWork;

import java.util.stream.Stream;

public class StreamFiltering {

    public static void FilterByEvenInteger(){

        Integer [] arr = new Integer[]{1,2,3,4,5,6,7,8,9};

      Stream.of(arr)
                .filter(t-> t %2 ==0)
                .forEach(System.out::println);

    }

    public static void FilterByStartsWith(){

        String[] arr = new String[] {"abhishek", "shubham", "abhi", "vasy", "aaa", "pet", "aiuu"};

        Stream.of(arr)
                .filter(t-> t.startsWith("a"))
                .forEach(System.out::println);

    }

    public static void FilterByVowels(){

        String[] arr = new String[] {"Hello, I am Abhishek Soni, and I am here as Android Developer"};

        Stream.of(arr)
                .filter(t->t.matches("(a|e|i|o|u)\\w*"))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        FilterByEvenInteger();
        FilterByStartsWith();
        FilterByVowels();

    }
}
