public class ArrayEqual {
    public static void main(String[] args){
        int[] array1 = {3,19,21,4,13};
        int[] array2 = {3,19,21,4,13};
        boolean equalCheck = true;
        if(array1.length == array2.length){
            for (int i = 0; i < array1.length; i++){
                if(array1[i] != array2[i]){
                    equalCheck = false;
                }
            }
        } else {
            equalCheck = false;
        }
        if(equalCheck){
            System.out.println("Two Arrays Are Equal");
        }
        else {
            System.out.println("Two Arrays Are Not equal");
        }
    }
}
