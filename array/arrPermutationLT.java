import java.util.Arrays;

// leetcode
//1920.Build array permutation
/*
Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).



Example 1:

Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]
 */
public class arrPermutationLT {
    public static void main(String[] args){
        int[] nums={0,2,1,5,3,4,};
        // printing build array function.
        System.out.println(Arrays.toString(buildArray(nums)));
    }
    static int[] buildArray(int[] nums) {
        // first approach
        int n= nums.length;
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
        // time = o(n)
        // space = o(n)
        /*
        // Second approach
        int n= nums.length;
        // process to build array permutation.
        for (int i = 0; i < n; i++) {
            nums[i] =n*(nums[nums[i]]%n)+nums[i]; //a=a+(b%n)*n
        }
        // logic
        for(int i=0;i<n;i++){
            nums[i]=nums[i]/n;  //b=b/n; // logic
        }
        return nums;
         */
    }
}

