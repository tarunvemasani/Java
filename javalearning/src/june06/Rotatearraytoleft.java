package june06;

public class Rotatearraytoleft {
    public static void main(String[] args)
    {
        int[] A = {1,2,3,4,5,6,7};
        int n= A.length;
        System.out.println(n);
        int x=3;
        int temp[]=new int[x];
        int y=x;
        for(int i=0;i<x;i++)
        {
            temp[i]=A[i];
        }
        for(int i=x;i<A.length;i++)
        {
            A[i-x]=A[i];
        }
        for(int i=0;i<x;i++)
        {
            A[n-y]=temp[i];
            y--;

        }

        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+"  ");
        }
    }
}
