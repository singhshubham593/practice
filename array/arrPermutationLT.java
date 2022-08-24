//Build array permutation

public class arrPermutationLT {
    public static void main(String[] args){
        int[] nums={0,2,1,5,3,4,};
        // printing build array function.
        System.out.println(buildArray(nums));
    }
    static int[] buildArray(int[] nums) {
        // lenght is asign in ans array.
        int[] ans = new int[nums.length];
        // process to build array permutation.
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;

    }
}
