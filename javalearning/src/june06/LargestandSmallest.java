package june06;

import java.util.Arrays;

public class LargestandSmallest {
    public static void main(String[] args)
    {
        //int A[]=new int[10];
        int[] A = {33,1,4,5,2,66,71,61,50,44};
        int l= A.length;
        Arrays.sort(A);

        System.out.println("Highest number in the aray is "+A[0]);
        System.out.println("Smallest number in the array is "+A[l-1]);

    }
}
