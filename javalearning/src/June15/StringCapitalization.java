package June15;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringCapitalization {
    public static void main(String[] args) {
        String[] strings = {"delhi", "mumbai", "goa", "hyderabad"};

        Arrays.stream(strings)
                .sorted()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .forEach(n -> System.out.println(n));
    }
}
