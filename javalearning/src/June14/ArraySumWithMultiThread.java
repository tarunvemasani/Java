package June14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ArraySumWithMultiThread {
    private static final int ARRAY_SIZE = 100;
    private static final int THREAD_COUNT = 5;

    private static int[] array = new int[ARRAY_SIZE];
    private static int[] partialSums = new int[THREAD_COUNT];
    private static int finalSum = 0;

    public static void main(String[] args) {
        // Fill the array with values from 1 to 100
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = i + 1;
        }

        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);

        // Calculate the partial sums using multiple threads
        for (int i = 0; i < THREAD_COUNT; i++) {
            int threadIndex = i;
            executorService.submit(() -> {
                int start = threadIndex * (ARRAY_SIZE / THREAD_COUNT);
                int end = start + (ARRAY_SIZE / THREAD_COUNT);
                for (int j = start; j < end; j++) {
                    partialSums[threadIndex] += array[j];
                }
            });
        }

        // Shutdown the executor service and wait for all threads to finish
        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Combine the partial sums to get the final sum
        for (int sum : partialSums) {
            finalSum += sum;
        }

        System.out.println("Final Sum: " + finalSum);
    }

}
