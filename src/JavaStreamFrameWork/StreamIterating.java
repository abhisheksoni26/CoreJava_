package JavaStreamFrameWork;

import java.util.stream.Stream;

public class StreamIterating {

    public static void main(String[] args) {

        Stream.iterate(1, t -> t+1)
                .filter(t -> t%5==0)
                .limit(10)
                .forEach(System.out::println);




    }
}
