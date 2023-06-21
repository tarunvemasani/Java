package June20;

import java.util.HashMap;
import java.util.Map;

public class DistinctChar {
    public static void main(String[] args){
        String s="test string";
        s=s.replaceAll(" ","");
        char[] ch = s.toCharArray();
        HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
        for(char c:ch){
            if(hmap.containsKey(c)){
                hmap.put(c, hmap.get(c)+1);
            }
            else{
                hmap.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer> entry : hmap.entrySet()){
            System.out.println(entry.getKey()+"  - "+entry.getValue());
        }


    }
}
