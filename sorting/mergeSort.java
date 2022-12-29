public class mergeSort {
    // mergeSort function that takes in an array of integers and sorts it in ascending order using the merge sort algorithm.
    //
    public static void mergeSort(int[] array) {
         if (array.length > 1) {
             int[] left = leftHalf(array);
             int[] right = rightHalf(array);

             mergeSort(left);
             mergeSort(right);

             merge(array, left, right);
         }
    }
    //The leftHalf and rightHalf functions are helper functions that split the input array into its left and right halves,
    public static int[] leftHalf(int[] array) {

        return left;
    }

    public static int[] rightHalf(int[] array) {

    }
    public static void merge(int[] result, int[] left, int[] right) {

    }
}
