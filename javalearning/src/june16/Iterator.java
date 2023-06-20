package june16;

import java.util.ArrayList;

public class Iterator<S> {
    public static void main(String[] args){
        ArrayList<String> myNumbers = new ArrayList<String>();
        myNumbers.add("del");
        myNumbers.add("mum");
        myNumbers.add("bom");
        myNumbers.add("tex");
        java.util.Iterator<String> it =myNumbers.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
