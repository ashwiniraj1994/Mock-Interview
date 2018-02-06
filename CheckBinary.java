public class CheckBinary {
  public static void Binary(int num){
  boolean isBinary = true;
  int Number = num;
  while (Number != 0){
    int temp = Number % 10;   //Gives last digit of the number
        if(temp > 1){
           isBinary = false;
           break;
        }
        else {
           Number = Number/10;    //Removes last digit from the number
        }
  }
 if (isBinary){
      System.out.println(num + " is a binary number");
 }
 else {
     System.out.println(num + " is not a binary number");
 }
}

public static void main(String[] args) {
  Binary(1890);
  Binary(10110);
  Binary(3256);
  Binary(1011);
}
}
