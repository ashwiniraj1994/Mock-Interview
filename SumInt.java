package Basics;

/**
 * Created by ashwinirajasekar on 1/26/18.
 */
public class SumInt {
    public void sum(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("Sum is " + sum);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        SumInt si = new SumInt();
        si.sum(nums);
    }
}

