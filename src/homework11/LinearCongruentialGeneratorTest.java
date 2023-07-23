package homework11;

import java.util.stream.Stream;

public class LinearCongruentialGeneratorTest {
    public static void main(String[] args) {
        LinearCongruentialGenerator linearCongruentialGenerator = new LinearCongruentialGenerator(123L);
        Stream<Long> stream = linearCongruentialGenerator.generateRandomStream();
        stream.forEach(System.out::println);
    }
}
