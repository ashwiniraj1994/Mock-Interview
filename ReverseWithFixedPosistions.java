package Basics;
public class ReverseWithFixedPosistions {
  private static void reverseString(String Str){
      char[] StrArray = Str.toCharArray();
      char[] resultArray = new char[StrArray.length];
      for (int i = 0; i < StrArray.length; i++) {
        if (StrArray[i] == ' ')
            resultArray[i] = ' ';
      }
      int j = resultArray.length-1;
      for (int i = 0; i < StrArray.length; i++){
        if (StrArray[i] != ' '){
            if(resultArray[j] == ' '){
                    j--;
            }
          resultArray[j] = StrArray[i];
          j--;
        }
      }
      System.out.println(Str);
      System.out.println(String.valueOf(resultArray));
      System.out.println("=================");
    }

    public static void main(String[] args) {
        reverseString("I love Dogs");
        reverseString("Are you a Devil");
    }
}
