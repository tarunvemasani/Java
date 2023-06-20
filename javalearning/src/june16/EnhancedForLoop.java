package june16;

import java.util.ArrayList;

public class EnhancedForLoop {
    public static void main(String[] args){
        ArrayList<String> myNumbers = new ArrayList<String>();
        myNumbers.add("del");
        myNumbers.add("mum");
        myNumbers.add("bom");
        myNumbers.add("tex");
        for(String i :myNumbers){
            System.out.println(i);
        }
    }
}
