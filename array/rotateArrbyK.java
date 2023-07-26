import java.util.Arrays;

public class rotateArrbyK {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7};
        System.out.print(" the rotated array by k is : ");
        System.out.println(Arrays.toString(rotate(arr,2)));
    }
    static int[] rotate(int[] arr, int k){
       // k%=arr.length;
        reverce(arr,0, arr.length-1);
        reverce(arr,0,k-1);
        reverce(arr,k, arr.length-1);
        return arr;
    }
    static void reverce(int[] arr,int start,int end){
         //start=0;
         //end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
