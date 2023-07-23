package homework11;

import java.util.Iterator;
import java.util.stream.Stream;

public class StreamMixer  {
    public static void main(String[] args) {
        Stream<String> firstStream = Stream.of("Vlad", "Dima", "Sasha", "Oleh");
        Stream<String> secondStream = Stream.of("1 ", "2 ", "3 ", "4 ");
        Stream<String> zippedStream = zip(firstStream, secondStream);
        zippedStream.forEach(System.out::print);
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();
        Stream<T> result = Stream.empty();
        while (iterator1.hasNext() && iterator2.hasNext()){
            result = Stream.concat(result, Stream.of(iterator1.next(), iterator2.next()));
        }
        return result;
    }
}
