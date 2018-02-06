package Basics;

/**
 * Created by ashwinirajasekar on 2/3/18.
 */
public class PermutationNum {

    public static void stringPermutation (String str){
        stringPermute("", str);
    }

    public static void stringPermute(String permutation, String str){
        if(str.length() == 0){
            System.out.println(permutation);
        } else {
            for(int i = 0; i< str.length(); i++) {
                stringPermute(permutation + str.charAt(i), str.substring(0,i) + str.substring(i+1, str.length()));
            }
        }
    }

    public static void main(String[] args) {

        stringPermutation("1234");
    }
}
