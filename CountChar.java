package Basics;

/**
 * Created by ashwinirajasekar on 1/26/18.
 */
import java.util.HashMap;
public class CountChar {
    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    public void countChar(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))) {
                count = map.get(str.charAt(i));
                map.put(str.charAt(i),++count);
            } else {
                map.put(str.charAt(i),1);
            }
        }
        for(Character k: map.keySet()) {
            System.out.println("Character: " + k + " count: " + map.get(k));
        }
    }

    public int countCharOccurence(String str, char c) {
        int count = 0;
        for (int i =0 ; i< str.length(); i++){
            if(str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountChar cr = new CountChar();
        cr.countChar("Mississippi");
        int c = cr.countCharOccurence("California",'a');

        System.out.println(c);
    }
}
