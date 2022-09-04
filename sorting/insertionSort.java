import java.util.Arrays;
// Insertion Sort
public class insertionSort {
        public static void main(String[] args){
            int[] arr = {34,54,67,43,62};
            // Function call
            insertionSort(arr);
            System.out.println(Arrays.toString(arr));
        }
        // Creating new function
        static void insertionSort(int[] arr){
            // i index start with 0 and end at n-1.
            for(int i=0;i<arr.length-1;i++){
                // j start with index 1 and end at n.
                for(int j=i+1;j>0;j--){
                    //Condition for changing index value
                    if(arr[j]<arr[j-1]){
                        // Swap function call
                        swap(arr,j,j-1);
                    }else{
                        break;
                    }
                }
            }
        }
        //function for Swaping using third varaible.
        static void swap(int[] arr,int first,int second){
            int temp = arr[first];
            arr[first]= arr[second];
            arr[second]=temp;
        }
}
