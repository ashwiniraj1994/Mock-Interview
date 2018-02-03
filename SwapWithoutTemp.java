package Basics;

/**
 * Created by ashwinirajasekar on 2/2/18.
 */
public class SwapWithoutTemp {
    private void swapNum (int x, int y) {
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping: " + x + " " + y);
    }

    public static void main(String[] args) {
        SwapWithoutTemp swt = new SwapWithoutTemp();
        swt.swapNum(43,65);
        swt.swapNum(23,43);
    }
}
