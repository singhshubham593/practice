public class arrMinAndMax {
    public static void main(String[] args) {
        int[] arr = {34, 65, 78, 98, 22, 57};

        //Store min function.
        int smallest = min(arr);
        //printing smallest number.
        System.out.println("Smallest number in array is " + smallest+".");
        // Storing max function.
        int largest = max(arr);
        //printing largest number.
        System.out.println("Largest number in array is " + largest+".");
    }
    // find smallest number in array.
    static int min(int[] arr) {
        //taking first index number as minimum.
        int min = arr[0];
        //Searching smallest number in array
        for (int i = 1; i < arr.length; i++) {
            //Condition for minimum.
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    static int max(int[] arr) {
        //taking first index number as maximum.
        int max = arr[0];
        //Searching largest number in array
        for (int i = 1; i < arr.length; i++) {
            //Condition for maximum num.
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
