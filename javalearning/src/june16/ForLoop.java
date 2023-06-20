package june16;
import java.util.ArrayList;

public class ForLoop {
    public static void main(String[] args)
    {
        ArrayList<String> myNumbers = new ArrayList<String>();
        myNumbers.add("del");
        myNumbers.add("mum");
        myNumbers.add("bom");
        myNumbers.add("tex");

        for(int i=0;i<myNumbers.size();i++)
        {
            System.out.println(myNumbers.get(i));
        }
    }
}
