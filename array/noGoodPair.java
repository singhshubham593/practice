import java.util.Arrays;

/*
1512.Number of Good Pair

Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
 */
public class noGoodPair {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,3};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
