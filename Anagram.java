import java.util.Arrays;
public class Anagram {
  public static void Anagram(String s1, String s2){
  String str1 = s1.replaceAll(" ", "");
  String str2 = s2.replaceAll(" ", "");
  boolean status = true;
  if(str1.length() != str2.length()) {
      status = false;
  }
  else {
    char[] s1Arr = str1.toLowerCase().toCharArray();
    char[] s2Arr = str2.toLowerCase().toCharArray();
    Arrays.sort(s1Arr);
    Arrays.sort(s2Arr);
    status = Arrays.equals(s1Arr, s2Arr);
  }
  if(status){
     System.out.println(s1 + " and " + s2 + " are anagrams");
  }
  else {
     System.out.println(s1 + " and " + s2 + " are not anagrams");
  }
}

public static void main(String[] args) {
    Anagram("keep", "peek");
    Anagram("Debit Card", "Bad Credit");
    Anagram("toss", "soil");
 }
}
