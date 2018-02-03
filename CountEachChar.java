package Basics;

import java.util.HashMap;

/**
 * Created by ashwinirajasekar on 2/2/18.
 */
public class CountEachChar {
    private void characterCount(String inputString) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();
        for (char c : strArray) {
            if(charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }

        System.out.println(charCountMap);
    }

    public static void main(String[] args)
    {
        CountEachChar cc = new CountEachChar();
        cc.characterCount("Java J2EE Java JSP J2EE");
        cc.characterCount("All Is Well");
        cc.characterCount("Done And Gone");
    }
}
