// Binary Search
public class BinarySearch {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        // value is store by funcion call.
        int ans = filter(arr,target);
        System.out.println("The target is found at index number :" + ans);
    }
    //return the index.
    //return -1 if it does not exist.
    static int filter(int[] arr, int target){
        int start = 0;
        int end = arr.length;
        while(start<=end){
            // find the middle of array.
            //      int middle = (start + end);  // might be possible that (start+end) exceed the range of integer in java.
            int middle = start + (end-start)/2; // int middle = (start+end).
            // target is less then middle,than End is changed.
            if (target < arr[middle]){
                end = middle -1;
            }
            // target is greater then middle,than Start is changed.
            else if(target > arr[middle]){
                start = middle +1;
            }
            // target is equal to middle,than  target is found at middle.
            else{
                return middle;
            }
        }
        // target is  not found in array.
        return -1;
    }
}
