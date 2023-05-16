package JavaStreamFrameWork;

import java.util.stream.Stream;

public class ConcatInStream {
    public static void main(String[] args) {

        String[] arr = new String[] {"abhishek", "shubham", "abhi", "vasy", "aaa", "pet", "aiuu"};
        String[] arr1 = new String[] {"abhishek", "shubham", "abhi"};
        String[] arr2 = new String[] {"shubham", "yash", "vasy"};
        String[] arr3 = new String[] {"java", "point", "geeks"};

        Stream <String> stream = Stream.of(arr);
        Stream <String> stream1 = Stream.of(arr1);
        Stream <String> stream2 = Stream.of(arr2);
        Stream <String> stream3 = Stream.of(arr3);

        Stream.concat(Stream.concat(Stream.concat(stream,stream1 ),stream2),stream3)
                .forEach(System.out::println);

    }
}
