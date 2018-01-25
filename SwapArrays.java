package Basics;

import java.util.Random;

/**
 * Created by ashwinirajasekar on 1/22/18.
 */
public class SwapArrays {
    public int[] swapArray(int[] nums, int pos1, int pos2) {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
        return nums;
    }
//    public static void main(String[] args) {
//        SwapArrays sa = new SwapArrays();
//        int[] nums = {1,2,3,4,5,6,7,8,9,10};
//        for (int i= 0; i< nums.length; i++) {
//            System.out.print(nums[i]);
//        }
//        sa.swapArray(nums, 9, 1);
//        System.out.println();
//        for (int i= 0; i< nums.length; i++) {
//            System.out.print(nums[i]);
//        }
//        sa.swapArray(nums, 4, 6);
//        System.out.println();
//        for (int i= 0; i< nums.length; i++) {
//            System.out.print(nums[i]);
//        }
//    }
    public static void main(String[] args) {
        Random r = new Random();
        SwapArrays sa = new SwapArrays();
        int[] nums = new int[10];
        for(int i= 0 ; i < nums.length; i++) {
            nums[i] = r.nextInt(50);
            System.out.print(nums[i] + " ");
        }
        sa.swapArray(nums, 3,5);
        System.out.println();
        for (int i = 0; i< nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
