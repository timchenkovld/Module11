package homework11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NameSorter {
    private static List<String> names = Arrays.asList("John", "Bill", "Vlad", "Oleksandr", "Anna");

    public static void main(String[] args) {
        List<String> sortedNames = sortNames(names);
        System.out.println("sortedNames = " + sortedNames);
    }

    private static List<String> sortNames(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}