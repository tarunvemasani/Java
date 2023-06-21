package June20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SumTarget {
    public static void main(String[] args){
        Integer[] ar = {10,20,30,40,50,60};
        int t=100;
        HashMap<Integer,Integer> res=new HashMap<Integer,Integer>();
        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]==t-ar[j]) {
                    res.put(i, ar[i]);
                    res.put(j, ar[j]);
                }
            }
        }
        for(Map.Entry<Integer,Integer> entry: res.entrySet()){
            System.out.println(entry.getKey());
        }


    }
}
