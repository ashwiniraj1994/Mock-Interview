package Basics;

/**
 * Created by ashwinirajasekar on 1/29/18.
 */
public class Fibbonacci {
        int n1=0,n2=1,n3=0;
        public void printFibonacci(int count){
            if(count > 0){
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                System.out.println(" " + n3);
                printFibonacci(count - 1);
            }
        }
        public static void main(String args[]){
            Fibbonacci fb = new Fibbonacci();
            fb.printFibonacci(10);
        }
    }

