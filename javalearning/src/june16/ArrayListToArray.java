package june16;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args){
        ArrayList<String> str = new ArrayList<>();
        str.add("A");
        str.add("B");
        str.add("C");
        str.add("D");
         String[] strlst= new String[str.size()];
         strlst= str.toArray(strlst);
         for(String s: strlst)
         {
             System.out.println(s);
         }


    }
}
