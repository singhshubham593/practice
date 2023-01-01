import java.util.Arrays;
// Code and concept of merge sort
public class mergeSort {
    // mergeSort function that takes in an array of integers and sorts it in ascending order using the merge sort algorithm.

    public static void mergeSort(int[] array) {
         if (array.length > 1) {
             // function call and initialise
             int[] left = leftHalf(array);
             int[] right = rightHalf(array);

             mergeSort(left);
             mergeSort(right);

             merge(array, left, right);
         }
    }
    //The leftHalf and rightHalf functions are helper functions that split the input array into its left and right halves,
    public static int[] leftHalf(int[] array) {
        //devide array value and shifting
        int size1 = array.length / 2;
        int[] left = new int[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = array[i];
        }
        return left;
    }

    public static int[] rightHalf(int[] array) {
        //devide array value and shifting
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
        return right;
    }
    //conquer the divided value from left and right in sorted manner
    public static void merge(int[] result, int[] left, int[] right) {
        int i1 = 0;
        int i2 = 0;

        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                result[i] = left[i1];
                i1++;
            } else {
                result[i] = right[i2];
                i2++;
            }
        }
    }
    //main function for showing array before and after sorting array.
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 7, 1, 3, 2, 6};

        System.out.println("Original array: " + Arrays.toString(array));

        mergeSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
/*
NOTE
mergeSort function that takes in an array of integers and sorts it in ascending order using the merge sort algorithm.
The function works by dividing the input array into two halves, sorting each half recursively using the mergeSort function,
and then merging the two sorted halves back together using the merge function.

The leftHalf and rightHalf functions are helper functions that split the input array into its left and right halves, respectively.
The merge function takes in three arrays: the result array, the left half array, and the right half array. It merges the left and
right arrays into the result array in sorted order.

Finally, the main function demonstrates how to use the mergeSort function by creating an unsorted array of integers and printing
it out, sorting the array using mergeSort, and then printing out the sorted array.

 */
