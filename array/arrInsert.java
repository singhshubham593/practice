import java.util.Scanner;

// search a number is present in array or not.

public class arrInsert {
    public static void main(String[] args) {
        int i;
        System.out.println("Enter the size :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
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
        //take number to  insert in array
        System.out.println("Enter number to insert at its index :");
        int n= sc.nextInt();
        //to take a location at which a number is located
        System.out.println("Enter the location :");
        int loc = sc.nextInt();
        loc--;
        //process to locate index
        for(i=size-1;i>=loc;i--){
            if(arr[i]==loc){
                arr[i]=arr[i+1];
            }
        }
         arr[loc]=n;
        //to print array after insert
        for(i=0;i<size;i++){
            System.out.println(arr[i]);
        }

    }
}

