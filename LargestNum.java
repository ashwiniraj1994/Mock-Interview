package Basics;

/**
 * Created by ashwinirajasekar on 2/2/18.
 */
public class LargestNum {
    private int getLLessThanN(int number, int digit) {
        char c = Integer.toString(digit).charAt(0);
        for (int i = number; i > 0; --i) {
            if(Integer.toString(i).indexOf(c) == -1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LargestNum ln = new LargestNum();
        System.out.println(ln.getLLessThanN(123, 2));
        System.out.println(ln.getLLessThanN(4550, 5));
        System.out.println(ln.getLLessThanN(98546, 5));
        System.out.println(ln.getLLessThanN(387, 8));
    }
}
