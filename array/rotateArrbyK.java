import java.util.Arrays;

public class rotateArrbyK {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7};
        System.out.print(" the rotated array by k is : ");
        System.out.println(Arrays.toString(rotate(arr,2)));
    }
    // rotate function
    static int[] rotate(int[] arr, int k){
       // k%=arr.length;
        reverce(arr,0, arr.length-1); // reverse array 0 to n-1
        reverce(arr,0,k-1);           // reverse array 0 to k-1
        reverce(arr,k, arr.length-1);      // reverse array k to n-1
        return arr;
    }
    // reverce function
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
    /*
     public static void main(String[] args) {
        int arr[]={1,2,3,4,5}; //   3,4,5,1,2
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rotat(arr,3)));
    }
     static int[] rotat(int[] arr, int k){
        for(int i=0;i<k;i++){
            reverse(arr);
        }
        return arr;
    }
    static void reverse(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
     */
}
