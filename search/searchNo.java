import java.util.Scanner;

// search a number is present in array or not.

public class searchNo {
    /*
    ////Without function
    public static void main(String[] args) {
        int i;
        System.out.println("Enter the size :");
        // to take input
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        // To take array input;
        System.out.println("Enter array is :");
        for(i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        //to print array
        System.out.println("array element :");
        for(i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        //take number to find in array
        System.out.println("Enter number to find its index :");
        int n= sc.nextInt();
        //to search a no which is present in array or not
        for(i=0;i<size;i++){
            if(arr[i]==n){
                System.out.println( n + " is present at indox no "+ i);
            }
        }

    }
    */
    ///with function
    public static void main(String[] args) {
        int[] arr={34,56,99,87,99};
        int target =87;
        //store value in ans
        int ans = lenearSearch(arr,target);
        System.out.println("THe target is present at index no :" + ans);
    }
    //Search in the array :return the index if item is found
    //Otherwise if no found return -1
    static int lenearSearch(int[] arr,int target){
        //if array length is 0.then,return -1
        if(arr.length==0){
            return -1;
        }
        //to run for loop and check element=target at which index
        for(int index =0;index<=arr.length;index++){
            int element =arr[index];
            if(element==target){
                return index;
            }
        }
        //if target is not in array.then,return -1
            return -1;
    }

}

