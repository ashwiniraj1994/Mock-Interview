package Basics;

/**
 * Created by ashwinirajasekar on 1/20/18.
 */
public class PrintString {
    public void strInput(String str1, String str2) {
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        char first = s1[0];
        char last = s2[s2.length - 1];
        System.out.println("" + first + "" + last);
    }

    public static void main(String args[]) {
        PrintString ps = new PrintString();
        ps.strInput("Ashwini", "Rajasekar");
    }
}