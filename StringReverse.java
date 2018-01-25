package Basics;

/**
 * Created by ashwinirajasekar on 1/25/18.
 */
public class StringReverse {
    public boolean isAlphabet(char x) {
        if ( (x >= 'A' &&  x <= 'Z') || (x >= 'a' &&  x <= 'z') ) {
            return false;
        }
        return true;
    }

    public String reverseString(String str) {
        char[] inputArr = str.toCharArray();
        int l = 0;
        int r = inputArr.length - 1;
        while (l < r) {
            if (isAlphabet(inputArr[l])) {
                l++;
            } else if (isAlphabet(inputArr[r])) {
                r--;
            } else {
                char tempChar = inputArr[l];
                inputArr[l] = inputArr[r];
                inputArr[r] = tempChar;
                l++;
                r--;
            }
        }
        return new String(inputArr);
    }

    public static void main(String[] args) {
        StringReverse sr = new StringReverse();
        String result = sr.reverseString("a,b,$c,&d,e,f");
        System.out.println(result);
    }
}
