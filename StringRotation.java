package Basics;

/**
 * Created by ashwinirajasekar on 2/1/18.
 */
public class StringRotation {
    public static void rotation(String s1, String s2){
        String str1 = s1.toLowerCase();
        String str2 = s2.toLowerCase();
        if(str1.length() != str2.length()){
            System.out.println("str2 is not rotated version of str1");
        }
        else {
            String str3 = str1 + str1;
            if(str3.contains(str2)){
                System.out.println("str2 is a rotated version of str1");
            }
            else {
                System.out.println("str2 is not rotated version of str1");
            }
        }
    }
    public static void main(String[] args) {
        rotation("UnclePeter", "Peteruncle");
        rotation("AshwiniRajasekar", "RoohaBharadwaj");
    }
}
