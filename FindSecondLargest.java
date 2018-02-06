package Basics;

/**
 * Created by ashwinirajasekar on 2/5/18.
 */
public class FindSecondLargest {
    static int secondLargest(int[] input){
        int firstLargest, secondLargest;
        if(input[0] > input[1]){
            firstLargest = input[0];
            secondLargest = input[1];
        }
        else {
            firstLargest = input[1];
            secondLargest = input[0];
        }
        for (int i = 2; i < input.length; i++){
            if(input[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = input[i];
            }
            else if (input[i] < firstLargest && input[i] > secondLargest){
                secondLargest = input[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args){
        System.out.println(secondLargest(new int[] {29,30,14,35,65,45}));
        System.out.println(secondLargest(new int[] {985,456,765,345,233,323,556}));
        System.out.println(secondLargest(new int[] {2345,3213,3456,7374,2233,7589}));
        System.out.println(secondLargest(new int[] {34564,47364,36373,47694,85775,38464}));
    }
}

