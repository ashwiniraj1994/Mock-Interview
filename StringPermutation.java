package Basics;

/**
 * Created by ashwinirajasekar on 1/27/18.
 */
public class StringPermutation {
    public void stringPermutation(String str) {
        stringPermutation("", str);
    }

    public void stringPermutation(String permutation, String str) {
        if(str.length() == 0) {
            System.out.println(permutation);
        } else {
            for(int i = 0; i < str.length(); i++) {
                stringPermutation(permutation + str.charAt(i), str.substring(0,i) + str.substring(i+1, str.length()));
            }
        }
    }

    public static void main(String[] args) {
        StringPermutation sp = new StringPermutation();
        sp.stringPermutation("ABCDA");
    }
}
