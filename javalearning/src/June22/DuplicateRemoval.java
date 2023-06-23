package June22;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateRemoval {
    public static void main(String[] args){
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        String s="Test string";
        for(int i=0;i<s.length();i++){
            lhs.add(s.charAt(i));
        }

        for(char ch: lhs){
            System.out.print(ch);
        }
    }
}
