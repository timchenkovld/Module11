package homework11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NameFinder {
    private static List<String> names = Arrays.asList("John", "Bill", "Vlad", "Oleksandr", "Anna");

    public static void main(String[] args) {
        List<String> addIndexedNames = getAddIndexedNames(names);
        System.out.println("addIndexedNames = " + addIndexedNames);
    }

    private static List<String> getAddIndexedNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(index -> index % 2 != 0)
                .mapToObj(names::get)
                .collect(Collectors.toList());
    }
}
