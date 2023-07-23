public class subArr {
    public static void main(String[] args){
        int arr[]={2,3,4,5,6};
        System.out.println("Sub Array :");
        sub(arr);
        System.out.println("Sum of sub array :");
        sub2(arr);
    }


    // sum of sub arrays and also find the maximum of sum
    //  in this case time complexity is o(n3)
    static void sub2(int arr[]){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                sum=0;
                for(int k=start;k<=end;k++){
                    sum=sum+arr[k];
                }
                System.out.println(sum);
                if(maxSum<sum){
                    maxSum=sum;
                }
            }
        }
        System.out.println("maximum sum is "+ maxSum);
    }

    //sub arrays
    static void sub(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
