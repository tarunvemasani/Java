package june16;

import java.util.ArrayList;

public class Foreach {
    public static void main(String[] args){
        ArrayList<String> myNumbers = new ArrayList<String>();
        myNumbers.add("del");
        myNumbers.add("mum");
        myNumbers.add("bom");
        myNumbers.add("tex");
        myNumbers.forEach(i->System.out.println(i));
    }
}
