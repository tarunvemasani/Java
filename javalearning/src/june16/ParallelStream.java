package june16;

import java.util.ArrayList;

public class ParallelStream {
    public static void main(String[] args){
        ArrayList<String> myNumbers = new ArrayList<String>();
        myNumbers.add("del");
        myNumbers.add("mum");
        myNumbers.add("bom");
        myNumbers.add("tex");
        myNumbers.parallelStream().forEach(i->System.out.println(i+" "+Thread.currentThread().getName()));
        myNumbers.forEach(i->System.out.println(i));
    }
}
