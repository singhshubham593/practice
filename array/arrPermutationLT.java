//Build array permutation

public class arrPermutationLT {
    public static void main(String[] args){
        int[] nums={0,2,1,5,3,4,};
        // printing build array function.
        System.out.println(buildArray(nums));
    }
    static int[] buildArray(int[] nums) {
        /*
        Approch

        a=3  b=3 n=6

        a=a+(b%n)*n;  -> 3+(4)*6 =27
        a=a%n;        ->3
        b=b/n;         ->4
         */
        // lenght is asign in ans array.
        int n= nums.length;
        // process to build array permutation.
        for (int i = 0; i < n; i++) {
             nums[i] = nums[i]+(nums[i]%n)*n; //a=a+(b%n)*n
        }
        for(int i=0;i<n;i++){
            nums[i]=nums[i]/n;  //b=b/n;
        }
        return nums ;

    }
}
