package June15;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "date", "grape"};

        sortStrings(strings);

        // Print the sorted strings
        Arrays.stream(strings).forEach(System.out::println);
    }

    public static void sortStrings(String[] strings) {
        Arrays.sort(strings, Comparator.comparingInt(String::length)
                .thenComparing(Comparator.comparingInt((String s) -> s.charAt(s.length() - 1)).reversed()));
    }
}
