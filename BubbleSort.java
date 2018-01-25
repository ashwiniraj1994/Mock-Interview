package Basics;

/**
 * Created by ashwinirajasekar on 1/25/18.
 */
public class BubbleSort {
    public void bubbleSort(int arr[]) {
        int i, j, temp;
        boolean swap;
        for(i = 0; i < arr.length - 1; i++) {
            swap = false;
            for(j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if (swap == false)
                break;
        }
    }

    public void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        BubbleSort bc = new BubbleSort();
        int arr[] = {12,-3,0,7,12,-7};
        bc.bubbleSort(arr);
        bc.printArr(arr);
    }
}
