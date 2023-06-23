package June22;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetString {
    public static void main(String[] args){
        Set<String> s= new HashSet<>();
        s.addAll(Arrays.asList(new String[] {"ab","cde","fghi","k","qw","wsdcx","wecxd","vdcd","wqx","ytgrg"}));

        //using iterator
        Iterator<String> it = s.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+ "  ");
        }
        System.out.println();
        //using foreach
        for(String x: s){
            System.out.print(x+"  ");
        }
        System.out.println();
        //using stream for each
        s.stream().forEach(i->System.out.print(i+"  "));

    }

}
