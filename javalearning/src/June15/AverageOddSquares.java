package June15;
import java.util.Arrays;

public class AverageOddSquares {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double average = findAverageOfOddSquares(numbers);
        System.out.println("Average of squares of odd numbers: " + average);
    }

    public static double findAverageOfOddSquares(Integer[] numbers) {
        return Arrays.stream(numbers)
                .filter(number -> number % 2 != 0)
                .mapToInt(number -> number * number)
                .average()
                .orElse(0);
    }
}

