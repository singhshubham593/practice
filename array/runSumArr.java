/*
  Running sum of 1d Array From leetcode question no 1480
QUESTION
        Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
        Return the running sum of nums.

Example 1:
        Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

 */
public class runSumArr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int ans=arr[0];
        int as =sum(arr,ans);
        System.out.println(as);
    }
    static int sum(int[] arr,int ans){
        for (int i=1;i<arr.length;i++){
            System.out.println(ans);
            ans=ans+arr[i];
        }
        return ans;
    }
}
