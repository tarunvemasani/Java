package june16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class UsingIterator {
    public static void main(String[] args){
        ArrayList<String> myNumbers = new ArrayList<String>();
        myNumbers.add("del");
        myNumbers.add("mum");
        myNumbers.add("bom");
        myNumbers.add("tex");
        Iterator it =myNumbers.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
