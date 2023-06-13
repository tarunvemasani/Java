package june06;

public class ReverseArray {
    public static void main(String[] args){
        int[] A = {33,1,4,5,2,66,71,61,50,44};
        int n = A.length;
        int B[]=new int[n];
        for(int i=0;i<A.length;i++)
        {
            B[n-1]=A[i];
            n--;
        }
        for(int i=0;i<B.length;i++)
        {
            System.out.print(B[i]+"  ");
        }
    }

}
