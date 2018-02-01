/**
 * Created by ashwinirajasekar on 1/31/18.
 */
public class PairOfElementEqualsSum {
    public void pairElement(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num) {
                    System.out.println("{ " + arr[i] + ", " + arr[j] + " }");
                }
            }
        }
    }

    public static void main(String[] args) {
        PairOfElementEqualsSum pa = new PairOfElementEqualsSum();
        int[] arr = {1,3,4,2,6,-1};
        pa.pairElement(arr, 5);
    }
}
