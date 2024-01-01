import java.util.Arrays;
/* arr= -3 5 1 -4 4 2
         - - -  - - -
         0 1 2  3 4 5
equilibrium Index = sum of index before equilibrium point == sum of index after equilibrium point

output = 2
*/
public class equilibriumIndexArr {
    public static void main(String[] args) {
        int arr[]={-7,1,5,2,-4,3,0};
        System.out.print(" the equilibrium index is : ");
        System.out.println(equilibrium(arr));
    }
    // optimise approach
    static int equilibrium(int[] arr){
        int sum=0,leftsum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            sum=sum-arr[i];
            if(leftsum==sum){
                return i;
            }
            leftsum=leftsum+arr[i];
        }
        return -1;
    }
    /*
    // simple approach
    static int equilibrium(int arr[]){
        int i;
        for(i=0;i< arr.length-1;i++){
            int leftsum=0;
            int rightsum=0;
            for(int j=0;j<i;j++){
                leftsum+=arr[j];
            }
            for(int j=i+1;j< arr.length;j++){
                rightsum+=arr[j];
            }
            if(leftsum==rightsum){
                return i;
            }
        }
        return i;
    }
     */
}
