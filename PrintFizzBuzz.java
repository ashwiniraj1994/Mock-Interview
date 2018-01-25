package Basics;

/**
 * Created by ashwinirajasekar on 1/20/18.
 */
public class PrintFizzBuzz {
    public void numb(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("fizz buzz");
        }
        else if(num % 3 == 0) {
            System.out.println("fizz");
        }
        else if (num % 5 == 0) {
            System.out.println("buzz");
        }
    }
    public static void main(String args[]) {
        PrintFizzBuzz bz = new PrintFizzBuzz();
        bz.numb(15);
        bz.numb(9);
        bz.numb(10);
        bz.numb(4);
    }
}

