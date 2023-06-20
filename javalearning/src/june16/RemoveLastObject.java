package june16;
import java.util.ArrayList;

public class RemoveLastObject {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.remove(arrayList.size()-1);
        for(String i : arrayList){
            System.out.println(i);
        }

    }
}
