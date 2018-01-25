package Basics;

/**
 * Created by ashwinirajasekar on 1/23/18.
 */
public class DuplicateChar {
    public String removeDuplicates(String str){
        String result = "";
            for (int i = 0; i < str.length(); i++) {
                if(!result.contains(String.valueOf(str.charAt(i)))) {
                    result += String.valueOf(str.charAt(i));
                 }
            }
        return result;
    }

    public static void main (String[] args) {
        DuplicateChar dc = new DuplicateChar();
        String result = dc.removeDuplicates("Mississippi");
        System.out.println(result);
    }
}