public class searchNoInRange {
    public static void main(String[] args) {
        int[] arr ={45,76,99,75,35,87,48,34,67};
        int target =35;// to find no in array with position.
        System.out.println(lenearSearch(arr,target,1,7));
    }
    //Search in the array :return the index if item is found
    //Otherwise if no found return -1
    static int lenearSearch(int[] arr,int target,int start,int end) {//start =search no from index no
        //if array length is 0.then,return -1                        //end=end searching
        if (arr.length == 0) {
            return -1;
        }
        //to run for loop and check element=target at which index
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                System.out.println("no is found at index no :" );
                return index;
            }
        }
        //if target is not in array.then,return -1
        return -1;
    }
}
