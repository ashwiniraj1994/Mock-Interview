package Basics;

/**
 * Created by ashwinirajasekar on 1/31/18.
 */
public class CommonArrayElements {

    public void commonElemnts(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        CommonArrayElements ca = new CommonArrayElements();
        int[] arr1 = {12,24,36,48,60};
        int[] arr2 = {24,48,72,96};
        ca.commonElemnts(arr1, arr2);
    }
}
