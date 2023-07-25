// pair of array
//arr={2,4,6,8,10}
/*
output
(2,4)(2,6)(2,8)(2,10)
(4,6)(4,8)(4,10)
(6,8)(6,10)
(8,10)
 */
public class pairOfarr {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        System.out.println("The pair of array is:");
        pair(arr);

    }
    // for pairing oarray
    static void pair(int arr[]){
        // loop for element 2 to last element
        for(int i=0;i<arr.length;i++){
            // storing the value  2,4,6,8,10
            int firstElemnt=arr[i];
            //loop for element 4 to last element
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+firstElemnt+","+arr[j]+")");
            }
            System.out.println();
        }
    }
}
