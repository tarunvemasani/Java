package June15;

import java.util.Arrays;
import java.util.List;

public class VowelCount {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "chrry", "date", "grape"};

        printStringsWithVowels(strings);
    }

    public static void printStringsWithVowels(String[] strings) {
        // Convert the array to a list
        List<String> stringList = Arrays.asList(strings);

        // Filter strings containing vowels
        stringList.stream()
                .filter(string -> containsVowels(string))
                .forEach(string -> {
                    System.out.println("String: " + string);
                    System.out.println("Number of vowels: " + countVowels(string));
                    System.out.println();
                });
    }

    public static boolean containsVowels(String string) {
        return string.toLowerCase().matches(".*[aeiou].*");
    }

    public static int countVowels(String string) {
        return (int) string.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
}

