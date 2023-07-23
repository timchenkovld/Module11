package homework11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DigitalSorter {
    private static List<String> digits = Arrays.asList("1, 2, 0", "4, 5");

    public static void main(String[] args) {
        List<String> sortedDigits = sortDigits(digits);
        System.out.println("sortedDigits = " + sortedDigits);
    }

    private static List<String> sortDigits(List<String> digits) {
        return digits.stream()
                .flatMapToInt(string -> Arrays.stream(string.split(", "))
                        .mapToInt(Integer::parseInt))
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());
    }
}
