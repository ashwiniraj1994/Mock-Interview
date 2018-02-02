package Basics;

/**
 * Created by ashwinirajasekar on 2/1/18.
 */
public class SumTriplets {

        static int countTriplets(int[] arr, int n, int sum) {
            int ans = 0;
            for (int i = 0; i < n-2; i++) {
                for (int j = i+1; j < n-1; j++) {
                    for (int k = j+1; k < n; k++)
                        if (arr[i] + arr[j] + arr[k] < sum)
                            System.out.println("{" + arr[i] + ", " + arr[j] + ", " + arr[k] + "}");
                            ans++;
                }
            }

            return ans;
        }

        public static void main(String[] args)
        {
            int[] arr = {13,16,8,-4,1,4};
            int sum = 12;
         countTriplets(arr, arr.length, sum);
        }
}

