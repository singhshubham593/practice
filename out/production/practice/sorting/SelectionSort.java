import java.util.Arrays;
//Selection Sort
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,2,96,7,8,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // Created new function for selection of maximum element and placed on correct index.
    static void selectionSort(int [] arr){
        //  find the max item in the remaining array and swap with correct index
        for(int i = 0;i< arr.length;i++){
            //asign index in last
            int last = arr.length -1-i;
            // funcyion call and store value
            int maxIndex = getMaxIndex(arr,0,last);
            // funcyion call
            swap(arr,maxIndex,last);
        }
    }
    //for swap using third variable
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=arr[temp];
    }
    // find max element
    static int getMaxIndex(int [] arr,int start,int end){
        int max =start;
        for(int i =start;i<= end;i++){
            if(arr[max] < arr[i]){
                max =i;
            }
        }
        return max;
    }
}
