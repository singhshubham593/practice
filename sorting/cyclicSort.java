import java.util.Arrays;
// Cyclic sort
public class cyclicSort {
    public static void main(String[] args) {
        int[] arr ={4,3,5,2,6,1};
        sort(arr);
        System.out.printf(Arrays.toString(arr));
    }
    // Creating new function for Cyclic sort
    static void sort(int[] arr){
        // index pointer
        int i = 0;
        // loop for i will be less than n-1.
        while(i<arr.length){
            //for correct index = IndexNo -1.
            int correctIndex = arr[i] -1;
            // condition for checking i is at correct index or not
            if(arr[i] !=correctIndex){
                // if index is not at correct index. then, swap
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }
    // Creating new function for swapping
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }
}
