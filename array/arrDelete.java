import java.util.Scanner;
//Delete an element from array given by user
public class arrDelete {
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        //to take array size input
        System.out.println("Enter the size of array :");
        int size =sc.nextInt();
        //size initialise in array
        int arr[] = new int[size];
        //TO take array input from user
        System.out.println("Enter the array");
        for( i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        // to print array
        System.out.println("The array is :");
        for( i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        // take number to delete in array
        System.out.println("Enter number to delete array is :");
        int n =sc.nextInt();
        //process to delete array
        for( i=0;i<size;i++){
            if(arr[i]==n){
                for (j=i;j<(size-1);i++){
                    arr[j]=arr[j+1];
                    break;
                }
            }
        }
        //print array after deleting array
        System.out.println("The deleted array is :");
        for( i=0;i<(size-1);i++){
            System.out.println(arr[i]);
        }
    }
}
