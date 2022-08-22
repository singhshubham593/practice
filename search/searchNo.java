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
        int ans = lenearSearch(arr,target);
        System.out.println(ans);
    }

    static int lenearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int index =0;index<=arr.length;index++){
            int element =arr[index];
            if(element==target){
                return index;
            }
        }
            return -1;
    }

}

