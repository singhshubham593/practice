// Find a number position in an array
public class OrderAgnosticBS {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        // value is store by funcion call.
        int ans = filter(arr,target);
        System.out.println("The target is found at index at index number: " +ans);
    }
    //return the index.
    //return -1 if it does not exist.
    static int filter(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        //find whether the array is sorted in ascending or descending.
        boolean isAsc;
            if(arr[start]<arr[end]){
                isAsc=true;// if arr is ascending
            }
            else{
                isAsc=false;// if arr is decending
            }
        while(start<=end){

            int middle = start + (end-start)/2; // int middle = (start+end).
            //if middle = target
            if(arr[middle] == target){
                return middle;
            }
            if(isAsc){
                // in ascending this ia apply
                if (target < arr[middle]){
                    end = middle -1;
                }
                else  {
                    start = middle +1;
                }
            }
            else {
                // in decending this is apply
                 if (target > arr[middle]){
                    end = middle -1;
                }
                else  {
                    start = middle +1;
                }
            }

        }
        // return -1 when condition ia false.
        return -1;
    }
}
