import java.util.Scanner;

// search a number is present in array or not.

public class searchNo {
    public static void main(String[] args) {
        int i;
        System.out.println("Enter the size :");
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
                System.out.println( n + "is present at indox no "+ i);
            }
        }

    }
}

