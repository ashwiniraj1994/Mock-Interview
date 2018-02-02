package Basics;

/**
 * Created by ashwinirajasekar on 2/1/18.
 */
public class Armstrong {
    public static void ArmstrongNumber(int number){
        int num = number;
        int noOfDigits = String.valueOf(number).length();
        int sum = 0;
        while (num != 0){
            int lastDigit = num % 10;
            int lastDigitPower = 1;
            for(int i = 0; i < noOfDigits; i++) {
                lastDigitPower = lastDigitPower * lastDigit;
            }
            sum = sum + lastDigitPower;
            num = num / 10;
        }
        if (sum == number){
            System.out.println(number+" is an armstrong number");
        }
        else{
            System.out.println(number+" is not an armstrong number");
        }
    }

    public static void main(String[] args) {
        ArmstrongNumber(153);
        ArmstrongNumber(404);
        ArmstrongNumber(9474);
        ArmstrongNumber(144);
    }
}
