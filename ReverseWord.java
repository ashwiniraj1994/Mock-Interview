public class ReverseWord{
  public static void reverseWordInString(String Str){
        String[] words = Str.split(" ");
        String reverseString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
          reverseString = reverseString + reverseWord + " ";
        }
    System.out.println(Str);
    System.out.println(reverseString);
    System.out.println("-------------------------");
    }

    public static void main(String[] args) {
      reverseWordInString("I Love Dogs");
      reverseWordInString("Music heals pain");
      reverseWordInString("Everyone are happy");
    }
}
