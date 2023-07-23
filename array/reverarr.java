import java.util.Arrays;
// reverce array
public class reverarr {
    public static void main(String[] args) {

         int arr[]={4,5,1,2};
        System.out.println("Array before reverce is " +Arrays.toString(arr));
        reverce(arr);
        System.out.println("Array after reverce is " +Arrays.toString(arr));
    }
// swapping method
    static void reverce(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
