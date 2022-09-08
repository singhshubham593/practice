import java.util.Arrays;

public class missNumber {

    public static void main(String[] args) {
        int[] arr = {1,0,3,4};
        System.out.println(missNo(arr));
    }
    // function for finding missing number in array
    static int missNo(int[] arr){
        //i is initialise index number 0
        int i = 0;
        // correct is for arrays index value is equal to arrays index.
        int correct = arr[i];
        // loop to run array less than n
        while(i < arr.length) {
            //to check arrays index value is equal to arrays index.if not than swap,otherwise,continue checking
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        // searching for missing element
             for (int index =0; index < arr.length ; index++){
                 //case 1
                 if(arr[index]!= index){
                     return index;
                 }
             }
             //case 2
             return arr.length;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}