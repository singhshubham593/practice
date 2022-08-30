import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={2,4,8,6,7,9};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=1;j < arr.length-i;j++){
                if(arr[j] <arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] =temp;
                }
            }
        }
    }
}
