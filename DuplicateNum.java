package Basics;

/**
 * Created by ashwinirajasekar on 1/27/18.
 */

public class DuplicateNum {
    public int duplicateNum(int[] nums) {
        int largestNum = nums[nums.length - 1];
        int sum = getSum(nums);
        int duplicate = sum - (largestNum*(largestNum+1)/2);
        return duplicate;
    }

    public int getSum(int[] nums) {
        int sum = 0;
        for(int num: nums) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,7,8,9,10};
        //List<Integer> nums = new ArrayList<Integer>();
        //for(int i=1; i<20; i++) {
        //	nums.add(i);
        //}
        //numbers.add(7);
        DuplicateNum dn = new DuplicateNum();
        System.out.println(dn.duplicateNum(nums));
    }
}
